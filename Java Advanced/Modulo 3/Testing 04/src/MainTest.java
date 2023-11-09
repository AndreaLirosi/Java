import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    OffsetDateTime dataTesting = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @org.junit.jupiter.api.Test
    void getYear() {
        int year = Main.getYear(dataTesting);
        int result = 2023;
        assertEquals(result, year, "atteso anno corrispondente");
    }
    @org.junit.jupiter.api.Test
    void getMonth() {
        String month = Main.getMonth(dataTesting);
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
        int dayOfMonth = Main.getDayOfMonth(dataTesting);
        int result = 1;
        assertEquals(result, dayOfMonth, "atteso anno corrispondente");
    }
    @Test
    void getDayOfWeek() {
        String dayOfWeek = Main.getDayOfWeek(dataTesting);
        String result = "WEDNESDAY";
        assertEquals(result, dayOfWeek, "atteso giorno della settimana corrispondente");
    }
}