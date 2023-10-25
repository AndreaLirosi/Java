
public class incremeto {
    public static void main(String[] args) {
        float x = 10;
        float y = 15;

        System.out.println(numIncremento(x, y));
    }
    //nella funzione mando in incremento x,y e poi faccio la moltiplicazione
    public static float numIncremento(float x, float y) {
        float addX = (x += 5);
        float addy = (y += 3);
        return (addX * addy);
    }
}