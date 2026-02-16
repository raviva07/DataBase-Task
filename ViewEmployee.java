import java.sql.*;

public class ViewEmployee {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/task",
                "root",
                "root"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

            System.out.println("empcode  empname  empage  esalary");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("empcode") + "   " +
                    rs.getString("empname") + "   " +
                    rs.getInt("empage") + "   " +
                    rs.getInt("esalary")
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
