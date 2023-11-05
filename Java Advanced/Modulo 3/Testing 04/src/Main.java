import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(getYear(data));
        System.out.println(getMonth(data));
        System.out.println(getDayOfMonth(data));
        System.out.println(getDayOfWeek(data));
    }
    public static int getYear (OffsetDateTime data) {
        return data.getYear();
    }
    public static String getMonth (OffsetDateTime data) {
        return String.valueOf(data.getMonth());
    }
    public static int getDayOfMonth (OffsetDateTime data) {
        return data.getDayOfMonth();
    }
    public static String getDayOfWeek (OffsetDateTime data) {
        return String.valueOf(data.getDayOfWeek());
    }

}