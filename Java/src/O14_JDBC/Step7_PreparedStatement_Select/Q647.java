package O14_JDBC.Step7_PreparedStatement_Select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Q647 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Customer Id : ");
        String customerId = scanner.nextLine();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testJAVA", "root", "");

        String sql = "SELECT * FROM Customer WHERE CustomerId = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customerId);

        ResultSet rst = statement.executeQuery();

        while (rst.next()) {
            System.out.println(rst.getString("CustomerId") + " " + rst.getString("CustomerTitle") + " " + rst.getString("CustomerName") + " " + rst.getDouble("Salary"));
        }
    }
}
