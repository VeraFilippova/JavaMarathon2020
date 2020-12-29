package day5;

public class Task1 {
    public static void main(String[] args) {

        Car auto = new Car();
        auto.setYear(2015);
        auto.setColor("white");
        auto.setModel("toyota corolla");

        System.out.println("Model : " + auto.getModel());
        System.out.println("Color : " + auto.getColor());
        System.out.println("Year : " + auto.getYear());


    }
}
