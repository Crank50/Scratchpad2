package Week4.day2;

import java.sql.*;

/**
 * Created by Justin on 8/2/16.
 */
/*public class GuestQueryMachine00 {
    Connection con;               //our connnection to the db - presist for life of program

    // we dont want this garbage collected until we are done
    public GuestQueryMachine00(String datb_file_name_prefix) throws Exception {    // note more general exception

        // Load the HSQL Database Engine JDBC driver
        // hsqldb.jar should be in the class path or made part of the current jar
        Class.forName("org.hsqldb.jdbcDriver");

        // connect to the database.   This will load the db files and start the
        // database if it is not alread running.
        // db_file_name_prefix is used to open or create files that hold the state
        // of the db.
        // It can contain directory names relative to the
        // current working directory
        con = DriverManager.getConnection("jdbc:hsqldb:"
                        + datb_file_name_prefix,    // filenames
                "sa",                     // username
                "");                      // password
    }

    public static void main(String[] args) {

        GuestQueryMachine00 db = null;

        try {
            db = new GuestQueryMachine00("datb_file");
        } catch (Exception ex1) {
            ex1.printStackTrace();    // could not start db

            return;                   // bye bye
        }

        try {

            //make an empty table
            //
            // by declaring the id column IDENTITY, the db will automatically
            // generate unique values for new rows- useful for row keys
            db.update(
                    "CREATE TABLE Visitors( id INTEGER IDENTITY, First_Name VARCHAR(256), Last_Name VARCHAR(256), Day VARCHAR(256)");
        } catch (SQLException ex2) {

            //ignore
            //ex2.printStackTrace();  // second time we run program
            //  should throw execption since table
            // already there
            //
            // this will have no effect on the db
        }

        try {

            // add some rows - will create duplicates if run more then once
            // the id column is automatically generated
            db.update(
                    "INSERT INTO Visitors(First_Name,Last_Name,Day) VALUES('Michelle', 'Obama','Friday')");
            db.update(
                    "INSERT INTO Visitors(First_Name,Last_Name,Day) VALUES('Sinister', 'Intentions','Sunday')");

            // do a query
            db.query("SELECT * FROM Visitors WHERE id > 1");

            // at end of program
            db.shutdown();
        } catch (SQLException ex3) {
            ex3.printStackTrace();
        }
    }

    public void shutdown() throws SQLException {

        Statement st = con.createStatement();

        // db writes out to files and performs clean shuts down
        // otherwise there will be an unclean shutdown
        // when program ends
        st.execute("SHUTDOWN");
        con.close();    // if there are no other open connection
    }

    //use for SQL command SELECT
    public synchronized void query(String expression) throws SQLException {

        Statement st = null;
        ResultSet rs = null;

        st = con.createStatement();         // statement objects can be reused with

        // repeated calls to execute but we
        // choose to make a new one each time
        rs = st.executeQuery(expression);    // run the query

        // do something with the result set.
        dump(rs);
        st.close();    // NOTE!! if you close a statement the associated ResultSet is

        // closed too
        // so you should copy the contents to some other object.
        // the result set is invalidated also  if you recycle an Statement
        // and try to execute some other query before the result set has been
        // completely examined.
    }

    //use for SQL commands CREATE, DROP, INSERT and UPDATE
    public synchronized void update(String expression) throws SQLException {

        Statement st = null;

        st = con.createStatement();    // statements

        int i = st.executeUpdate(expression);    // run the query

        if (i == -1) {
            System.out.println("datb error : " + expression);
        }

        st.close();
    }

    public static void dump(ResultSet rs) throws SQLException {

        // the order of the rows in a cursor
        // are implementation dependent unless you use the SQL ORDER statement
        ResultSetMetaData meta   = rs.getMetaData();
        int               colmax = meta.getColumnCount();
        int               i;
        Object            o = null;

        // the result set is a cursor into the data.  You can only
        // point to one row at a time
        // assume we are pointing to BEFORE the first row
        // rs.next() points to next row and returns true
        // or false if there is no next row, which breaks the loop
        for (; rs.next(); ) {
            for (i = 0; i < colmax; ++i) {
                o = rs.getObject(i + 1);    // Is SQL the first column is indexed

                // with 1 not 0
                System.out.print(o.toString() + " .");
            }

            System.out.println(" .");
        }
    }

}
*/