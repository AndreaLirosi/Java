import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db_Manager {
    private static final String URL = "jdbc:mysql://localhost:3306/newdb";
    private static final String USER = "developer@localhost";
    private static final String PASS = "pass1";

public static Statement createStatementDb () {
    try {
        Connection connection = DriverManager.getConnection(URL,USER,PASS);
        return connection.createStatement();
}catch (SQLException e ){
throw new RuntimeException();
    }
}


}
