import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.*;
//i testing servono a collaudare i metodi nei punti più fragili. la sintassi prevede:

class MainTest {
    //qui ho istanziato la data che andrà poi nei metodi

    String text = "2002-03-01T13:00:00Z";

    @org.junit.jupiter.api.Test
    void dataFull() {
        // in questi casi ho voluto testare se il formato, che il metodo DateTimeFormatter esegue, è quello Full
    String dataActual = Main.dataFull((text));
    // imposto il mio result
    String result = "venerdì 1 marzo 2002";
    // con assertEquals, dove nelle parentesi metto (risultato aspettato, il metodo, e un messaggio)
        assertEquals(result, dataActual, "Errore nel formato FUll");
    }
    @org.junit.jupiter.api.Test
    void dataFullNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main.dataFull(null));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("data is null", e.getMessage());
    }

    @org.junit.jupiter.api.Test
    void dataMedium() {
        String dataActual = Main.dataMedium((text));
        String result = "1 mar 2002";
        assertEquals(result, dataActual, "Errore nel formato Medium");
    }
    @org.junit.jupiter.api.Test
    void dataShort() {
        String dataActual = Main.dataShort((text));
        String result = "01/03/02";
        assertEquals(result, dataActual, "Errore nel formato Short");
    }
    @Test
    void dataParse() {
        OffsetDateTime expected = OffsetDateTime.parse(text);
        OffsetDateTime result = Main.dataParse(text);
        assertEquals(expected, result, "Parsing incorretto");
    }
    @Test
    void dataParseNull() {
        assertThrows(NullPointerException.class, () -> Main.dataParse(null));
    }
}