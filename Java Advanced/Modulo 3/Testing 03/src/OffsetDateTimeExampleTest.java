import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

public class OffsetDateTimeExampleTest {
    OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");


    @Test
    public void testOffsetDateTimeConversionAndFormatting() {
        String formattedDate = Main.dataFormat(data);
        assertEquals("01 marzo 2023", formattedDate);
    }

    @Test
    public void testOffsetDateTimeNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main.dataFormat(null));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("la data è null", e.getMessage());

    }
}

