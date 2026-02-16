import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeInsert {
    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/task",
                "root",
                "root"
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // Insert Queries
            stmt.executeUpdate("INSERT INTO Employee VALUES (101,'Jenny',25,10000)");
            stmt.executeUpdate("INSERT INTO Employee VALUES (102,'Jacky',30,20000)");
            stmt.executeUpdate("INSERT INTO Employee VALUES (103,'Jo',20,40000)");
            stmt.executeUpdate("INSERT INTO Employee VALUES (104,'John',40,80000)");
            stmt.executeUpdate("INSERT INTO Employee VALUES (105,'Shameer',25,90000)");

            System.out.println("Records inserted successfully");
            

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
