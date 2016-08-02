package Week4.day2;

import java.sql.*;

/**
 * Created by Justin on 8/2/16.
 */
public class PreparedQueryMachine {
    static final String JDBC_DRIVER = "org.hsqldb.jdbcDriver";
    static final String DB_URL = "jdbc:hsqldb:dbase_file";
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            //STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 3: Execute a query
            stmt = conn.prepareStatement("SELECT id, first_name, last_name, dayofweek FROM Loyalty_Program WHERE dayofweek < ?");
            stmt.setInt(1,8);
            ResultSet rs = stmt.executeQuery();

            //STEP 4: Extract data from result set
            while(rs.next()) {
                //Retrieve by column name
                int id  = rs.getInt("id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String dayofweek = rs.getString("dayofweek");

                //Display values
                String resultString = "ID: " + id;
                resultString += ", FIRST_NAME: " + first_name;
                resultString += ", LAST_NAME: " + last_name;
                resultString += ", DAYOFWEEK: " + dayofweek;
                System.out.println(resultString);
            }
            //STEP 5: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            se.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt!=null)
                    stmt.close();
            } catch(SQLException se2) {
            } try {
                if(conn!=null)
                    conn.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }

}


