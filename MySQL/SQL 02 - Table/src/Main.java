import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer@localhost", "pass1");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from students");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("first_name"));
        }

        }
    }
