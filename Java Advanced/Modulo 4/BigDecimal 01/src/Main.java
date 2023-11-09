import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        Operazione op1 = new Operazione(BigDecimal.valueOf(4.7), BigDecimal.valueOf(6.8),Operazione.Tipo.SOMMA);
        Operazione op2 = new Operazione(BigDecimal.valueOf(4.7), BigDecimal.valueOf(6.8),Operazione.Tipo.SOTTRAZIONE);
        Operazione op3 = new Operazione(BigDecimal.valueOf(4.7), BigDecimal.valueOf(6.8),Operazione.Tipo.MOLTIPLICAZIONE);
        Operazione op4 = new Operazione(BigDecimal.valueOf(4.7), BigDecimal.valueOf(6.8),Operazione.Tipo.DIVISIONE);
        Operazione op5 = new Operazione(BigDecimal.valueOf(4.7), BigDecimal.valueOf(6.8),Operazione.Tipo.MIN);
        Operazione op6 = new Operazione(BigDecimal.valueOf(4.7), BigDecimal.valueOf(6.8),Operazione.Tipo.MAX);

        System.out.println(op1.eseguiOperazione());
        System.out.println(op2.eseguiOperazione());
        System.out.println(op3.eseguiOperazione());
        System.out.println(op4.eseguiOperazione());
        System.out.println(op5.eseguiOperazione());
        System.out.println(op6.eseguiOperazione());
    }
}