import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {
        String createQuery = "CREATE TABLE IF NOT EXISTS students (" +
                "student_id INT(10) NOT NULL AUTO_INCREMENT," +
                "last_name VARCHAR(30)," +
                "first_name VARCHAR(30)," +
                "PRIMARY KEY (student_id))";
        createTableStudents(createQuery);
        insertStudents(1, "Rossi", "Alberto", "Italy");
        insertStudents(2, "Bianchi", "Stefano", "German");
        insertStudents(3, "Verdi", "Rebecca", "Italy");
        insertStudents(4, "Neri", "Chiara", "German");
        printDatabase();

    }

    public static void createTableStudents(String query) throws SQLException {
        Db_Manager.createStatementDb().executeUpdate(query);
    }

    public static void insertStudents(int id, String lastName, String firstName, String country) throws SQLException {
        String insertQuery = "INSERT INTO students (idStudents, last_name, first_name, country) VALUES (" + id + ", '" + lastName + "', '" + firstName + "', '" + country + "')";
        Db_Manager.createStatementDb().executeUpdate(insertQuery);
    }
    public static void printDatabase () throws SQLException {
        String selectQuery = "SELECT * FROM students";
        Db_Manager.createStatementDb().executeQuery(selectQuery);
    }
}