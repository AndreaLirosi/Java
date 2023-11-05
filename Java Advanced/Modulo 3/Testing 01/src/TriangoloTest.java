import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangoloTest {
    private Triangolo testAreaTriangolo = new Triangolo(2,5);

    @Test
    void calcolaArea() {
        double result = testAreaTriangolo.calcolaArea(2,5);
        assertEquals(5, result, "L'area del triangolo, \n avente base 2 e altezza 5, \n deve essere uguale a 5");
    }
}