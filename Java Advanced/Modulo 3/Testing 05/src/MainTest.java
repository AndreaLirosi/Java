import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {
    OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    @Test
    void dataplusYear() {
        String test = String.valueOf(Main.dataplusYear(data));
        String result = "2024-03-01T13:00Z";
        assertEquals(result, test, "l'anno non è cambiato");

    }

    @Test
    void dataminusMonth() {
        Exception e = assertThrows(NullPointerException.class,() -> Main.dataminusMonth(null));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Errore date Null", e.getMessage());
    }

    @Test
    void dataplusWeek() {
    }

    @Test
    void dataFormat() {
    }
}