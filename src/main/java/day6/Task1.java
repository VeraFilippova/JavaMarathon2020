package day6;

public class Task1 {
    public static void main(String[] args) {
    Car auto = new Car();
    auto.info();
    Motorbike bike = new Motorbike(2017, "grey","yamaha");
    bike.info();
    System.out.println(bike.yearDifference(2020));

    }
}
