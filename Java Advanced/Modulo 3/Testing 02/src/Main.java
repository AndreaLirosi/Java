import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String text = "2002-03-01T13:00:00Z";
        System.out.println(data);

        System.out.println(dataFull(data));
        System.out.println(dataMedium(data));
        System.out.println(dataShort(data));
    }
    public static OffsetDateTime dataParse (String text) {
        return OffsetDateTime.parse(text);
    }
    public static String dataFull (OffsetDateTime data) {
        if (data != null) {
            return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        }else {
            throw new NullPointerException("data is null");
        }

    }
    public static String dataMedium (OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }
    public static String dataShort (OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }

}