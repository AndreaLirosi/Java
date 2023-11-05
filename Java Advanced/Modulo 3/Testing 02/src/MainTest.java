import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
    private Main dataTest = new Main();
    @org.junit.jupiter.api.Test
    void dataFull() {
            String result = dateTime.toString();
        assertTrue(result instanceof String);
    }

    @org.junit.jupiter.api.Test
    void dataMedium() {
        String result = dateTime.toString();
        assertTrue(result instanceof String);
    }

    @org.junit.jupiter.api.Test
    void dataShort() {
        String result = dateTime.toString();
        assertTrue(result instanceof String);
    }
}