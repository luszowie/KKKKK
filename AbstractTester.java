public class AbstractTester {
    public static void main(String[] args) {
        Shape s = new Rectangle();




    }
}
abstract class Shape {
    private String color;
    abstract double getArea();
}

class Rectangle extends Shape {

    private int legth;
    private int width;

    public int getLegth() {
        return legth;
    }

    public void setLegth(int legth) {
        this.legth = legth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return legth * width;
    }
}