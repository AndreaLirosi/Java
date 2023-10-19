public class Main {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 8;
        char carattere = 'a';
    // Integer è una classe wrapper che rappresenta un tipo di primitivo
// ad entrambe le classi assegno un valore
        Integer numeri1 = 12;
        Integer numeri2 = 18;
        Character carattere2 = 'b';

        int primitivoInt = 1;
        double primitivoDouble = 3.287;
        char primitivoChar = 'c';
// l'Autoboxing è l'operazione che converte un tipo di dato primitivo in un oggetto
    // converto quindi le variabili sopra nei corrispettivi oggetti wrapp
        Integer primitivoIntWrapp = primitivoInt;
        Double primitivoDoubWrapp = primitivoDouble;
        Character primitivoCharWrapp = primitivoChar;
// l'Unboxing, invece, trasforma un oggetto in un tipo di primitivo
        Integer numeroIntWrapp = 10;
        Double numeroDoubWrapp = 3.14;
        Character charWrapp = 'd';
    //faccio la conversione nelle rispettive primitive
        int numeroIntPrimitivo = numeroIntWrapp;
        double numeroDoubPrimitivo = numeroDoubWrapp;
        char charPrimitivo = charWrapp;


        somma(numero1,numero2);
        stampChar(carattere);
        sumInteger(numeri1,numeri2);
        stampCharacter(carattere2);
        System.out.println("Integer = " + primitivoIntWrapp + "\nDouble = " + primitivoDoubWrapp + "\nChar = " +primitivoCharWrapp);
        System.out.println("numeroIntPrimitivo = " + numeroIntWrapp + "\nnumeroDoubPrimitivo = " + numeroDoubWrapp + "\ncharPrimitivo = " +charWrapp);
    }

    public static void somma(int num1, int num2) {
        System.out.println("La somma è: " + num1 + num2);
    }

    public static void stampChar(char test) {
        System.out.println("Il char è: " + test);
    }

    public static void sumInteger(Integer n1, Integer n2) {
        int sum = n1 + n2;
        System.out.println("La somma degli Integer è: " + sum);
    }
    public static void stampCharacter(Character test) {
        System.out.println("Il Character è: " + test);
    }

}