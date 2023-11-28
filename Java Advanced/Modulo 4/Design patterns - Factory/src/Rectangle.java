public class Rectangle extends Shape {
    private double side;
    private double height;

    public Rectangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public static double areaRectangle (double side, double height) {
        return side*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + side +
                ", height=" + height +
                '}';
    }
}
