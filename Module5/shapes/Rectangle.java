package Module5.shapes;

public class Rectangle extends Shape {

    private double length;
    private double width;
    public Rectangle(double l, double w){
        super("Rectangle");
        this.length = l;
        this.width = w;
    }

    public double area() {
        return length * width;
    }
    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}