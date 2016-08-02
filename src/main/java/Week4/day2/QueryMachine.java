package Week4.day2;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by Justin on 8/2/16.
 */
public class QueryMachine {
    PreparedQueryMachine preparedQueryMachine = new PreparedQueryMachine();
    Connection conn;               //our connnection to the db - presist for life of program
    QueryGettersSetters queryGettersSetters = new QueryGettersSetters();


    // we dont want this garbage collected until we are done
    public QueryMachine(String db_file_name_prefix) throws Exception {    // note more general exception

        // Load the HSQL Database Engine JDBC driver
        // hsqldb.jar should be in the class path or made part of the current jar
        Class.forName("org.hsqldb.jdbcDriver");

        // connect to the database.   This will load the db files and start the
        // database if it is not alread running.
        // db_file_name_prefix is used to open or create files that hold the state
        // of the db.
        // It can contain directory names relative to the
        // current working directory
        conn = DriverManager.getConnection("jdbc:hsqldb:"
                        + db_file_name_prefix,    // filenames
                "sa",                     // username
                "");                      // password
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QueryMachine dbase = null;

        try {
            dbase = new QueryMachine("dbase_file");
        } catch (Exception ex1) {
            ex1.printStackTrace();    // could not start db

            return;                   // bye bye
        }

        try {
            dbase.update("Drop Table Loyalty_Program");
        } catch (Exception e) {}


        try {

            //make an empty table
            //
            // by declaring the id column IDENTITY, the db will automatically
            // generate unique values for new rows- useful for row keys
            dbase.update("Create TABLE Loyalty_Program (id INTEGER IDENTITY, first_name VARCHAR(256), last_name VARCHAR(256), dayofweek Integer)");
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
            dbase.update(
                    "INSERT INTO Loyalty_Program(first_name,last_name,dayofweek) VALUES('Genison', 'Marx', 1)");
            dbase.update(
                    "INSERT INTO Loyalty_Program(first_name,last_name,dayofweek) VALUES('Farcy', 'Lexicon', 2)");


            // do a query
            dbase.query("SELECT * FROM Loyalty_Program WHERE id < 250");

            // at end of program
            dbase.shutdown();
        } catch (SQLException ex3) {
            ex3.printStackTrace();
        }

        try {
            dbase.insert("Insert Into Loyalty_Program(first_name,last_name,dayofweek)");
        }catch (SQLException ee) {
            ee.printStackTrace();
        }
    }

    public void shutdown() throws SQLException {

        Statement st = conn.createStatement();

        // db writes out to files and performs clean shuts down
        // otherwise there will be an unclean shutdown
        // when program ends
        st.execute("SHUTDOWN");
        conn.close();    // if there are no other open connection
    }

    //use for SQL command SELECT
    public synchronized void query(String expression) throws SQLException {
        System.out.println("");
        Statement st = null;
        ResultSet rs = null;

        st = conn.createStatement();         // statement objects can be reused with

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

        st = conn.createStatement();    // statements

        int i = st.executeUpdate(expression);    // run the query

        if (i == -1) {
            System.out.println("db error. : " + expression);
        }

        st.close();
    }

    public synchronized void insert(String expression) throws SQLException{
        Statement stmt = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add new info:[yes]/[no]");
        String userinput = scanner.nextLine();
        if (userinput.equalsIgnoreCase("yes")) {
            System.out.println("What is your first name?: ");
            queryGettersSetters.setFirst_name(scanner.nextLine());
            System.out.println("What is your last name?: ");
            queryGettersSetters.setLast_name(scanner.nextLine());
            System.out.println("What is the # day of month?: ");
            queryGettersSetters.setDayofweek(scanner.nextInt());
        }
        stmt = conn.createStatement();
        stmt.executeUpdate("UPDATE Loyalty_Program SET first_name = ?, last_name = ?, dayofweek = ? WHERE id > 1");
    }

    public static void dump(ResultSet rs) throws SQLException {

        // the order of the rows in a cursor
        // are implementation dependent unless you use the SQL ORDER statement
        ResultSetMetaData meta = rs.getMetaData();
        int colmax = meta.getColumnCount();
        int i;
        Object o = null;

        // the result set is a cursor into the data.  You can only
        // point to one row at a time
        // assume we are pointing to BEFORE the first row
        // rs.next() points to next row and returns true
        // or false if there is no next row, which breaks the loop
        for (; rs.next(); ) {
            for (i = 0; i < colmax; ++i) {
                o = rs.getObject(i + 1);    // Is SQL the first column is indexed

                // with 1 not 0
                System.out.print(o.toString() + " ..");
            }

            System.out.println(" ");
        }
    }

}
