package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String userColor) {
        color = userColor;
    }

    public void setModel(String userModel) {
        model = userModel;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {
        int yearDif = inputYear - year;
        return Math.abs(yearDif);
    }
}
