package O14_JDBC.Step3_CreateConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q641 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/<dbName>", "root", "");
    }
}
