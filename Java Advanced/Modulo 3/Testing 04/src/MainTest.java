import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    String text = "2023-03-01T13:00:00Z";
    @org.junit.jupiter.api.Test
    void getYear() {
        int year = Main.getYear(text);
        int result = 2023;
        assertEquals(result, year, "atteso anno corrispondente");
    }
    @org.junit.jupiter.api.Test
    void getMonth() {
        String month = Main.getMonth(text);
        String result = "MARCH";
        assertEquals(result, month, "atteso mese corrispondente");
    }
    @Test
    void getMonthNUll () {
        Exception e =assertThrows(NullPointerException.class,() -> Main.getMonth(null));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Error date is Null", e.getMessage());
    }
    @Test
    void getDayOfMonth() {
        int dayOfMonth = Main.getDayOfMonth(text);
        int result = 1;
        assertEquals(result, dayOfMonth, "atteso anno corrispondente");
    }
    @Test
    void getDayOfWeek() {
        String dayOfWeek = Main.getDayOfWeek(text);
        String result = "WEDNESDAY";
        assertEquals(result, dayOfWeek, "atteso giorno della settimana corrispondente");
    }
    @Test
    void dataParse() {
        OffsetDateTime textEspected =OffsetDateTime.parse(text);
        OffsetDateTime test = Main.dataParse(text);
        assertEquals(textEspected, test, "incorrect parse");
    }
    void dataParseNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main.dataParse(null));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Error data is null", e.getMessage());
    }
}