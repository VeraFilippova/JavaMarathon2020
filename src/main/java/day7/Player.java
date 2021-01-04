package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    Player(int random) {
        if (countPlayers > 6) {
            System.out.println("Максимальное кол-во играков на поле");
        } else {
            this.stamina = random;
            countPlayers++;
        }


    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0)
            return;
        stamina--;
        if (stamina == 0)
            countPlayers--;

    }

    public static void info() {
        if (countPlayers < 6) {
            int players = 6 - countPlayers;
            System.out.println("Команды неполные. На поле еще есть " + players + " свободных мест");
        } else System.out.println("На поле нет свободных мест");
    }
}
