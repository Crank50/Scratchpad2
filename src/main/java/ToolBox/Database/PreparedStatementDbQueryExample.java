package ToolBox.Database;

import java.sql.*;

/**
 * Created by Justin on 8/2/16.
 */
public class PreparedStatementDbQueryExample {
    static final String JDBC_DRIVER = "org.hsqldb.jdbcDriver";
    static final String DB_URL = "jdbc:hsqldb:db_file";
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
            stmt = conn.prepareStatement("SELECT id, str_col, num_col FROM sample_table WHERE num_col < ?");
            stmt.setInt(1,250);
            ResultSet rs = stmt.executeQuery();

            //STEP 4: Extract data from result set
            while(rs.next()) {
                //Retrieve by column name
                int id  = rs.getInt("id");
                String str_col = rs.getString("str_col");
                int num_col = rs.getInt("num_col");

                //Display values
                String resultString = "ID: " + id;
                resultString += ", STR_COL: " + str_col;
                resultString += ", NUM_COL: " + num_col;
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
