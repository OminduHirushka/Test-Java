package O14_JDBC.Step8_DBwithSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testJAVA", "root", "");
    }

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}

public class Q651 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Customer Id : ");
        String customerId = scanner.nextLine();

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer WHERE CustID = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customerId);

        ResultSet rst = statement.executeQuery();

        while (rst.next()) {
            System.out.println(rst.getString("CustomerID") + " " + rst.getString("CustomerTitle") + " " + rst.getString("CustomerName") + " " + rst.getDouble("salary"));
        }
    }
}
