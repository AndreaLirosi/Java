import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operazione {
    public enum Tipo {
        DIVISIONE,
        MOLTIPLICAZIONE,
        SOMMA,
        SOTTRAZIONE,
        MIN,
        MAX
    }

    private BigDecimal num1;
    private BigDecimal num2;
    private Tipo op;


    public Operazione(BigDecimal num1, BigDecimal num2, Tipo tipOperazione) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = tipOperazione;
    }

    public BigDecimal eseguiOperazione() {
        System.out.println("l'operazione è una: " + op + "\nI numeri sono: " + num1 + " " + num2);
        switch (op) {
            case SOMMA:
                return sum(num1,num2);

            case SOTTRAZIONE:
                return subtract(num1,num2);

            case MOLTIPLICAZIONE:
                return multiply(num1,num2);

            case DIVISIONE:
                return division(num1,num2);

            case MIN:
                return min(num1, num2);

            case MAX:
                return max(num1,num2);
        }
        return BigDecimal.ZERO;
    }
    public BigDecimal sum (BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }
    public BigDecimal subtract (BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }
    public BigDecimal multiply (BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }
    public BigDecimal division (BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2,10,RoundingMode.HALF_DOWN);
    }
    public BigDecimal min (BigDecimal num1, BigDecimal num2) {
        return num1.min(num2);
    }
    public BigDecimal max (BigDecimal num1, BigDecimal num2) {
        return num1.max(num2);
    }

}
