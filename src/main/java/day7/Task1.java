package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane boeng = new Airplane("boeing", 1998, 40, 500);
        Airplane superjet = new Airplane("superjet", 2001, 35, 340);
        Airplane.compareAirplanes(boeng, superjet);
    }
}