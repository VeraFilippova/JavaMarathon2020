package day4;

import java.util.Random;
import java.util.Scanner;

/*
1. С клавиатуры вводится число n - размер массива.
Необходимо создать массив указанного размера и заполнить его
случайными числами от 0 до 10. Затем вывести содержимое массива в консоль,
а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
 */

public class Task1 {
    public static void main(String[] args) {

        int eight = 0;
        int one = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        Random randomNumbers = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNumbers.nextInt(10);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 8) {
                eight++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                one++;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumber++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumber++;
            }
        }
        for (int arraySum : numbers) {
            sum = sum + arraySum;
        }
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количестве чисел больше 8 = " + eight);
        System.out.println("Количестве чисел равных 1 = " + one);
        System.out.println("Количество четных чисел = " + evenNumber);
        System.out.println("Количестве нечетных чисел = " + oddNumber);
        System.out.println("Сумма = " + sum);
    }

}
