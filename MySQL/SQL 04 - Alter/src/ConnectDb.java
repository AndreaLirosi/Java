import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDb {
    private static String url = "jdbc:mysql://localhost:3306/newdb";
    private static String user = "developer@localhost";
    private static String pass = "pass1";

    public static Statement newStatement () throws SQLException {
        Connection connection = DriverManager.getConnection(url,user,pass);
        return connection.createStatement();
    }

}
