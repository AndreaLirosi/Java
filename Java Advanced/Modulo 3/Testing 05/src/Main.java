import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        String text = "2023-03-01T13:00:00Z";
        OffsetDateTime dataplusYear = dataParse(text).plusYears(1);
        OffsetDateTime dataminusMonth = dataplusYear.minusMonths(1);
        OffsetDateTime dataplusWeek = dataminusMonth.plusWeeks(1);


        String dateString = dataParse(text).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(text);

        System.out.println(dataplusYear);
        System.out.println(dataminusMonth);
        System.out.println(dataplusWeek);
        System.out.println(dateString);
    }
    public static OffsetDateTime dataParse (String text) throws DateTimeParseException {
        if (text != null) {
            return OffsetDateTime.parse(text);
        } else {
            throw new NullPointerException("Error date is null");
        }
    }
    public static OffsetDateTime dataplusYear (String data) throws DateTimeParseException{
        return dataParse(data).plusYears(1);
    }
    public static OffsetDateTime dataminusMonth (String data) throws DateTimeParseException{
        if (data != null) {
            return dataParse(data).minusMonths(1);
        }else {
            throw new NullPointerException("Errore date Null");
        }
    }
    public static OffsetDateTime dataplusWeek (String data) throws DateTimeParseException{

            return dataParse(data).minusMonths(1);
        }

    public static OffsetDateTime dataFormat (String data) throws DateTimeParseException{
        return dataParse(data).plusWeeks(1);
    }

}