package O14_JDBC.Step5_ExecuteUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Q644 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/<dbName>", "root", "");

        Statement statement = connection.createStatement();

        String sql = "INSERT INTO <tblName> VALUES (<tableData>)";

        int result = statement.executeUpdate(sql);

        System.out.println(result > 0 ? "Success" : "Fail");
    }
}
