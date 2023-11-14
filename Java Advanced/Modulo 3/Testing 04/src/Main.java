import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {

        String text = "2023-03-01T13:00:00Z";
        System.out.println(dataParse(text));
        System.out.println(getYear(text));
        System.out.println(getMonth(text));
        System.out.println(getDayOfMonth(text));
        System.out.println(getDayOfWeek(text));
    }
    public static OffsetDateTime dataParse (String text) throws DateTimeParseException {
        if (text != null) {
            return OffsetDateTime.parse(text);
        } else {
            throw new NullPointerException("Error data is null");
        }
    }
    public static int getYear (String data) throws DateTimeParseException {
        return dataParse(data).getYear();
    }
    public static String getMonth (String data) throws DateTimeParseException {
        if (data != null) {
            return String.valueOf(dataParse(data).getMonth());
        } else {
            throw new NullPointerException("Error date is Null");
        }

    }
    public static int getDayOfMonth (String data) throws DateTimeParseException {
        return dataParse(data).getDayOfMonth();
    }
    public static String getDayOfWeek (String data) throws DateTimeParseException {
        return String.valueOf(dataParse(data).getDayOfWeek());
    }

}