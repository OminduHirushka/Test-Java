package O14_JDBC.Step4_ExecuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q643 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/<dbName>", "root", "");

        Statement statement = connection.createStatement();

        String sql = "SELECT * FROM <tblName>";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(resultSet.getString(" ") + " " + resultSet.getString(" ") + " " + resultSet.getString(" ") + " " + resultSet.getDouble(" "));
            // System.out.println(resultSet.getString("CustomerID") + " " + resultSet.getString("CustomerTitle") + " " + resultSet.getString("CustomerName") + " " + resultSet.getDouble("salary"));
        }
    }
}
