import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RettangoloTest {
    private Rettangolo testing = new Rettangolo(2,5);

    @Test
    void calcolaArea() {
        Double result = (double) testing.calcolaArea(2,5);
        assertEquals(10, result, "L'area del rettangolo di base 2 e altezza 5 è uguale a: 10" );
    }
}