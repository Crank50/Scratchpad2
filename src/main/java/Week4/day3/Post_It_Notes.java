package Week4.day3;



import java.sql.*;
import java.util.Locale;
import java.util.Scanner;

import static sun.misc.MessageUtils.where;


public class Post_It_Notes {

    public static void main(String[] args) {
        Post_It_Notes postItNotes = new Post_It_Notes();
        // postItNotes.droptable();
        Scanner scanner = new Scanner(System.in);
        postItNotes.checkCategories();
        postItNotes.checkNotes();
        try {
            postItNotes.readNotesRecords(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            postItNotes.readCategoryRecords(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("would you like to view Categories? [Yes]/[No]");
        String view = scanner.nextLine();
        if (view.equalsIgnoreCase("Yes")) {
            postItNotes.viewCategories();
        }
        System.out.println("Which Category would you like to use?:  ");
        int category = scanner.nextInt();

        System.out.println("What would you like to create? [Post It]/[Categories]");
        String primary = scanner.nextLine();
        if (primary.equalsIgnoreCase("Post It")) {
            System.out.println("What is the name of your note?");
            String notetitle = scanner.nextLine();
            System.out.println("Enter note here (256 char limit): ");
            String content = scanner.nextLine();
            System.out.println("Which Category?:");
            int categoryID = scanner.nextInt();
            postItNotes.insertNotes(notetitle, content, categoryID);
        } else if (primary.equalsIgnoreCase("Categories")) {
            System.out.println("What is the name of your Category");
            String ctitle = scanner.nextLine();
            System.out.println("Enter color of your Category: ");
            String colorC = scanner.nextLine();
            System.out.println("Enter description of your Category: ");
            String cDesc = scanner.nextLine();
            int categoryID = 1;
            postItNotes.insertCategories(ctitle, colorC, cDesc, categoryID);
        }


    }


    private void droptable() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:posititnotes", "za", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DROP TABLE Categories;");
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void createNotesTables() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:postitnotes", "za", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE Notes ( id INTEGER IDENTITY, ntitle VARCHAR(256), content VARCHAR(256),)");

            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Table Already Exists");
        }
    }

    private void insertNotes(String ntitle, String content, int categoryID) {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:postitnotes", "za", "");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Notes (ntitle, content) VALUES (?,?);");
            stmt.setString(1, ntitle);
            stmt.setString(2, content);
            stmt.executeUpdate();

            stmt.close();
            conn.close();
            System.out.println("NOTE: Finished Update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createCategoriesTables() {


        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:postitnotes", "za", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE Categories ( id INTEGER IDENTITY, lname VARCHAR(256), color VARCHAR(256),description VARCHAR(256))");
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Table Already Exists");
        }
    }

    private void insertCategories(String lname, String color, String description, int categoryID) {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:postitnotes", "za", "");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Categories (lname, color, description) VALUES (?,?,?);");
            stmt.setString(1, lname);
            stmt.setString(2, color);
            stmt.setString(3, description);
            stmt.executeUpdate();

            stmt.close();
            conn.close();
            System.out.println("NOTE: Finished Update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readNotesRecords(boolean printMe) throws Exception {
        Class.forName("org.hsqldb.jdbcDriver");
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:postitnotes", "za", "");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id,ntitle,content FROM Notes");
        while (rs.next()) {
            String rowResults = rs.getInt("id") + " -- " + rs.getString("ntitle") + " -- " + rs.getString("content");
            if (printMe) {
                System.out.println(rowResults);
            }
        }

        rs.close();
        stmt.close();
        conn.close();
    }

    private void readCategoryRecords(boolean printMe) throws Exception {
        Class.forName("org.hsqldb.jdbcDriver");
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:Categories", "za", "");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id,lname,color,description FROM Categories");
        while (rs.next()) {
            String rowResults = rs.getInt("id") + " -- " + rs.getString("lname") + " -- " + rs.getString("color") + "-- " + rs.getString("description");
            if (printMe) {
                System.out.println(rowResults);
            }
        }

        rs.close();
        stmt.close();
        conn.close();
    }

    private void checkCategories() {
        try {
            readCategoryRecords(false);
        } catch (Exception e) {
            createCategoriesTables();
        }
    }

    private void checkNotes() {
        try {
            readNotesRecords(false);
        } catch (Exception e) {
            createNotesTables();
        }
    }


    //
//    private void sqlJoin() {
//
//        try {
//            Class.forName("org.hsqldb.jdbcDriver");
//            Connection conn = DriverManager.getConnection("jdbc:hsqldb:postitnotes", "sa", "");
//            PreparedStatement stmt = conn.prepareStatement("SELECT Categories.name Notes. ntitle FROM Categories Left Join Notes ON Categories.noteID=Notes.noteID");
//
//            stmt.close();
//            conn.close();
//        } catch (Exception e) {
//        }
//    }
//
    private void viewCategories() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:Categories", "za", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id FROM Categories");
            while (rs.next()) {
                int rowResults = rs.getInt("id");
                System.out.println(rowResults);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void selectCategory(int categoryID) {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:postitnotes", "za", "");
            PreparedStatement stmt = conn.prepareStatement("SELECT Categories.id, Notes.id,  FROM Categories + INNER JOIN Notes + ON Categories.id=Notes.id;");
            stmt.setInt(categoryID,1);
            stmt.executeUpdate();

            stmt.close();
            conn.close();
            System.out.println("NOTE: Finished Update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//
//    private void chooseCategories() {
//
//    }
//}
//
//            private void addCategory() {
//            }
//
//            private void queryCategory() {
//            }




