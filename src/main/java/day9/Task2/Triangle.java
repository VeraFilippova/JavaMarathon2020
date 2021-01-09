package day9.Task2;

public class Triangle extends Figure {

    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3, String color) {
        super(color);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double area() {
        return Math.sqrt((perimetr() / 2) * ((perimetr() / 2) - s1) * ((perimetr() / 2) - s2) * ((perimetr() / 2) - s3));
    }

    @Override
    public double perimetr() {
        return s1 + s2 + s3;
    }
}
