import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        System.out.println(dataFormat(data));
    }
    public static String dataFormat (OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }
}