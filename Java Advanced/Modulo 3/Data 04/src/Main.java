import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dataplusYear = data.plusYears(1);
        OffsetDateTime dataminusMonth = dataplusYear.minusMonths(1);
        OffsetDateTime dataplusWeek = dataminusMonth.plusWeeks(1);


        String dateString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(data);

        System.out.println(dataplusYear);
        System.out.println(dataminusMonth);
        System.out.println(dataplusWeek);
        System.out.println(dateString);
    }
    public static OffsetDateTime dataplusYear (OffsetDateTime data){
        return data.plusYears(1);
    }
    public static OffsetDateTime dataminusMonth (OffsetDateTime data){
        return data.minusMonths(1);
    }
    public static OffsetDateTime dataplusWeek (OffsetDateTime data){
        return data.plusWeeks(1);
    }
    public static OffsetDateTime dataFormat (OffsetDateTime data){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss", Locale.ITALY);
        String dataFormattata = data.format(formatter);
        return OffsetDateTime.parse(dataFormattata, formatter);

    }
}