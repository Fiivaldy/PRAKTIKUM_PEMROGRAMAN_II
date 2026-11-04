package Module5;

import Module5.shapes.Shape;

public class Paint {
    private double coverage;

    public Paint(double c)
    {
        coverage = c;
    }

    public double amount(Shape s){
        System.out.println("Computing amount for " + s);
        double amountOfGallons = s.area() / coverage;
        return amountOfGallons;
    }
}