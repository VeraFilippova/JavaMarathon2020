package day5;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int userYear, String userColor, String userModel) {
        this.year = userYear;
        this.color = userColor;
        this.model = userModel;
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
}
