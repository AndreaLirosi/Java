import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Fruit fruit1 = new Fruit("Apple");
        Fruit fruit2 = new Fruit("Pear");
        Fruit fruit3 = new Fruit("Banana");
        Fruit fruit4 = new Fruit("Coconut");

        LinkedList<Fruit> listFruits = new LinkedList<>();

        listFruits.add(fruit1);
        listFruits.add(fruit2);
        listFruits.add(fruit3);
        listFruits.add(fruit4);

        System.out.println("lista Fruit: \n" + listFruits);

        listFruits.addFirst(new Fruit("Avocado"));
        listFruits.addLast(new Fruit("Cherry"));

        System.out.println("Nuova lista Fruit: \n" + listFruits);

    }
}