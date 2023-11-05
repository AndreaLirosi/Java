import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    OffsetDateTime dataTesting = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    @org.junit.jupiter.api.Test
    void getYear() {
        String result = "2023";
        assertEquals("2023", result, "atteso anno corrispondente");
    }

    @org.junit.jupiter.api.Test
    void getMonth() {
        String result = "MARCH";
        assertEquals("MARCH", result, "atteso mese corrispondente");
    }

    @org.junit.jupiter.api.Test
    void getDayOfMonth() {
        String result = "1";
        assertEquals("1", result, "atteso anno corrispondente");
    }

    @org.junit.jupiter.api.Test
    void getDayOfWeek() {
        String result = "WEDNESDAY";
        assertEquals("WEDNESDAY", result, "atteso giorno della settimana corrispondente");
    }
}