package day7;

public class Airplane {
    private String producer; //(изготовитель)
    private int year; //(год выпуска)
    private int length; //(длина)
    private int weight; //(вес)
    private int fuel; //(количество топлива в баке)


    public Airplane(String userProducer, int userYear, int userLength, int userWeight) {
        this.producer = userProducer;
        this.year = userYear;
        this.length = userLength;
        this.weight = userWeight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getProducer() {
        return producer;
    }

    public int getLength() {
        return length;
    }

    public int getFuel() {
        return fuel;
    }

    public int fillUp(int n) {
        fuel += n;
        return fuel;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", " + "год выпуска: " + year + ", " + "длина: " + length + ", " + "вес: " + weight + ", " + " количество топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Длина " + airplane1.getProducer() + " больше чем " + airplane2.getProducer());
        } else {
            System.out.println("Длина " + airplane2.getProducer() + " больше чем " + airplane1.getProducer());
        }

    }

}

