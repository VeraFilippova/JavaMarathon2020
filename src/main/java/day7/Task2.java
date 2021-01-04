package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player igor = new Player(random.nextInt(10) + 90);
        Player igorr = new Player(random.nextInt(10) + 90);
        Player.info();
        Player igorrr = new Player(random.nextInt(10) + 90);
        Player igorq = new Player(random.nextInt(10) + 90);
        Player igorss = new Player(random.nextInt(10) + 90);
        Player.info();
        Player igorrrt = new Player(random.nextInt(10) + 90);
        Player.info();
        igor.run();
        Player.info();


    }
}
