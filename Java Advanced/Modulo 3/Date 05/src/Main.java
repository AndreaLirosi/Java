import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        OffsetDateTime dataNow = OffsetDateTime.now();

        System.out.println("data è precedente a data2? \n" + dataIsBefore(data,data2));

        System.out.println("data2 è successiva a data? \n" + data2IsAfter(data, data2));
        System.out.println("data è uguale a dataNow? \n" + dataIsEqual(data, dataNow));
        System.out.println("data2 è uguale a dataNow? \n" + data2IsEqual(dataNow, data2));
    }
public static boolean dataIsBefore (OffsetDateTime data, OffsetDateTime data2) {
    return data.isBefore(data2);
}
    public static boolean data2IsAfter (OffsetDateTime data, OffsetDateTime data2) {
        return data2.isAfter(data);
    }
    public static boolean dataIsEqual (OffsetDateTime data, OffsetDateTime dataNow) {
        return data.isEqual(dataNow);
    }
    public static boolean data2IsEqual (OffsetDateTime dataNow, OffsetDateTime data2) {
        return data2.isEqual(dataNow);
    }


}