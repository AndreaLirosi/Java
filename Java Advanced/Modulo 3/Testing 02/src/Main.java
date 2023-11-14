import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        String text = "2002-03-01T13:00:00Z";
        System.out.println(dataParse(text));

        System.out.println(dataFull((text)));
        System.out.println(dataMedium((text)));
        System.out.println(dataShort((text)));
    }
    public static OffsetDateTime dataParse (String text) throws DateTimeParseException {
        if(text != null) {
            return OffsetDateTime.parse(text);
        }else {
            throw new NullPointerException("text is null");
        }

    }
    public static String dataFull (String data) throws DateTimeParseException {
        if (data != null) {
            return dataParse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        }else {
            throw new NullPointerException("data is null");
        }

    }
    public static String dataMedium (String data) throws DateTimeParseException {
        return dataParse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }
    public static String dataShort (String data) throws DateTimeParseException {
        return dataParse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }

}