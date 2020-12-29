package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int levelSum = 0;
        int indexLevelSum = 0;

        int[] numbers = new int[100];
        Random randomNumbers = new Random();
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = randomNumbers.nextInt(10000);

        for (int i = 0; i < numbers.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += numbers[j];
            }
            if (sum > levelSum) {
                levelSum = sum;
                indexLevelSum = i;
            }
        }
        System.out.println(levelSum);
        System.out.println(indexLevelSum);
    }
}

