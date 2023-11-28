import java.sql.*;

public class ManagerDb {
    private static String url = "jdbc:mysql://localhost:3306/newdb";
    private static String user = "developer@localhost";
    private static String pass = "pass1";
    public static Statement createStatement () throws SQLException {
       Connection connection = DriverManager.getConnection(url,user,pass);
       return connection.createStatement();
    }
    public static ResultSet createViewIt () throws SQLException {
        String query = "CREATE VIEW italianstudents AS" +
                "SELECT * " +
                "FROM students " +
                "WHERE country = 'Italy?";
        ResultSet resultSet = createStatement().executeQuery(query);
        return resultSet;
    }
    public static ResultSet createViewGe () throws SQLException {
        String query = "CREATE VIEW germanstudents AS" +
                "SELECT * " +
                "FROM students " +
                "WHERE country = 'German?";
        ResultSet resultSet = createStatement().executeQuery(query);
        return resultSet;
    }
}
