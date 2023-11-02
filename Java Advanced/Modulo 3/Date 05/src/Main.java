import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        OffsetDateTime dataNow = OffsetDateTime.now();

        System.out.println("data è precedente a data2? \n" + data.isBefore(data2));

        System.out.println("data2 è successiva a data? \n" + data2.isAfter(data));
        System.out.println("data è uguale a dataNow? \n" + data.isEqual(dataNow));
        System.out.println("data2 è uguale a dataNow? \n" + data2.isEqual(dataNow));
    }

}