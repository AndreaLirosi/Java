import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeExampleTest {

    @Test
    public void testOffsetDateTimeConversionAndFormatting() {
        String dateTimeString = "2023-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTimeString);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = offsetDateTime.format(formatter);
        
        assertEquals("01 marzo 2023", formattedDate);
    }
}

