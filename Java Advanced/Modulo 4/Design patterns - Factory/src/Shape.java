public class Shape {

    public static void drawShape (Type type, double side, double height) {
        if (type == Type.TRIANGLE) {
            Triangle triangle = new Triangle(side, height);
            double area = Triangle.areaTriangle(side,height);
            System.out.println("il Triangolo " + triangle + "\n" + "di Area: " + area);
        } else if (type == Type.RECTANGLE) {
            Rectangle rectangle = new Rectangle(side, height);
            double area = Rectangle.areaRectangle(side, height);
            System.out.println("il Triangolo " + rectangle + "\n" + "di Area: " + area);
        }else {
            System.out.println("forma non trovata");
        }

    }
}
