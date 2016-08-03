package Week4.day2;



import java.sql.*;
import java.util.Scanner;



/**
 * Created by Justin on 8/2/16.
 */
public class QueryMachine {
 private String first_name;
 private String last_name;
 private String addnote;


    static final String JDBC_DRIVER = "org.hsqldb.jdbcDriver";
    static final String DB_URL = "jdbc:hsqldb:registry_file";
    static final String USER = "Ferdinand";
    static final String PASS = "";




    public static void main(String[] args) {
        PreparedStatement pstmt = null;
        Connection con = null;
        Statement stmt = null;


        try {
            //Step 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //Step 2: Open a connection
            System.out.println("Connecting to a database....");
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            //Step 3: Execute a query

            pstmt = con.prepareStatement("Insert Into guest_registry (first_name,last_name,addnote) VALUES (?,?,?)");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Registry: [ADD]/[View]");
            String guests = scanner.nextLine();
            QueryMachine qm = new QueryMachine();

            if (guests.equalsIgnoreCase("add")) {
                System.out.println("First name:");
                qm.setFirst_name(scanner.nextLine());
                System.out.println("Last name:");
                qm.setLast_name(scanner.nextLine());
                System.out.println("Add note:");
                qm.setAddnote(scanner.nextLine());

                pstmt.setString(1, qm.getFirst_name());
                pstmt.setString(2, qm.getLast_name());
                pstmt.setString(3, qm.getAddnote());
                pstmt.executeUpdate();

            }
            if (guests.equalsIgnoreCase("view")) {
                try {
                    Class.forName(JDBC_DRIVER);

                    //STEP 2: Open a connection
                    System.out.println("Connecting to database...");
                    con = DriverManager.getConnection(DB_URL, USER, PASS);

                    //STEP 3: Execute a query
                    stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT id, first_name, last_name, addnote FROM guest_registry");

                    //STEP 4: Extract data from result set
                    while (rs.next()) {
                        //Retrieve by column name
                        int id = rs.getInt("id");
                        String first_name = rs.getString("first_name");
                        String last_name = rs.getString("last_name");
                        String addnote = rs.getString("addnote");

                        //Display values
                        String resultString = "ID: " + id;
                        resultString += ", FIRST_NAME: " + first_name;
                        resultString += ", LAST_NAME: " + last_name;
                        resultString += ", ADDNOTE: " + addnote;
                        System.out.println(resultString);
                    }
                } catch (SQLException se1) {
                    se1.printStackTrace();
                }
            }


                    //step 4: Clean-up environment
                    stmt.close();
                    con.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (stmt != null)
                            stmt.close();
                    } catch (SQLException se2) {
                    }
                    try {
                        if (con != null)
                            con.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }



                System.out.println("Please Come Again");


            }






    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddnote() {
        return addnote;
    }

    public void setAddnote(String addnote) {
        this.addnote = addnote;
    }
}
