package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        Затем, используя циклы for each вывести в консоль:
        наибольший элемент массива
        наименьший элемент массива
        количество элементов массива, оканчивающихся на 0
        сумму элементов массива, оканчивающихся на 0

         */
        int max = 0;
        int[] numbers = new int[100];
        Random randomNumbers = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNumbers.nextInt(10000);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int maxData : numbers) {
            if (maxData > max) {
                max = maxData;
            }
        }

        int min = max;
        for (int minData : numbers) {
            if (minData < min) {
                min = minData;
            }
        }

        int count = 0;
        int sum = 0;
        for (int number : numbers) {
            if (number % 10 == 0) {
                count++;
                sum = sum + number;

            }
        }
        System.out.println();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0 " + count);
        System.out.println("Cумма элементов массива, оканчивающихся на 0" + sum);
    }

}

