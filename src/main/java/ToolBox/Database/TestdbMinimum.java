package ToolBox.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Justin on 8/2/16.
 */
public class TestdbMinimum {
    public static void main(String[] args) {
        try {
           // setting the driver this translates language for the program
            Class.forName("org.hsqldb.jdbcDriver");
            // connects the jdbc , hsqldb username and password in other words creates the pipeline
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:db_file","sa","");
            //a query for information
            Statement st = conn.createStatement();
            //data we will get back from Statement
            ResultSet rs = st.executeQuery("SELECT id,str_col,num_col FROM sample_table");
            //goes through the pipe with these conditions
            while(rs.next()) {
                String rowResults = rs.getInt("id")+" -- "+rs.getString("str_col")+" -- "+rs.getInt("num_col");
                System.out.println(rowResults);
                // be sure to name what your requesting
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
