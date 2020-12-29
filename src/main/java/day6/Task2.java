package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane boeing  = new Airplane("boeing 737-800",2011, 40, 41410);
        boeing.info();
        boeing.setYear(2013);
        boeing.setLength(50);
        boeing.fillUp(40);
        boeing.fillUp(30);
        boeing.info();

    }
}
