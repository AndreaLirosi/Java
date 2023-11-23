import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {
    //qui procediamo a creare un collegamento tra la nostra IDE e il database.
    public static void main(String[] args) throws SQLException {
        // creiamo una connessione tramite un oggetto connection e l'uso di DriveMananger e, del suo metodo getConnection; diamo l'url, l'user e la password.
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer@localhost", "pass1");
        // qui creiamo un oggetto Statement, associato alla connessione, e usiamo il metodo createStatement, per generare le query di SQL.
        Statement statement = connection.createStatement();
        //istanziamo un oggetto result, che sarà associato a statement; e gli passiamo il metodo executeQuery che, come dice il metodo, esegue la query.
        ResultSet resultSet = statement.executeQuery("select * from students");
        //procediamo a istanziare una lista con i cognomi
        ArrayList<String> surnames = new ArrayList<>();
        //eseguaimo un ciclo while, con l'uso di next(), e ci facciamo dare tutti i Last_name
        while (resultSet.next()) {
            String surname = resultSet.getString("Last_name");
            surnames.add(surname);
        }

        for (String surname : surnames) {
            System.out.println(surname);
        }

    }
}