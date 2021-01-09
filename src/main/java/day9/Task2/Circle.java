package day9.Task2;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }
}