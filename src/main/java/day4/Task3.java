package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        /*
        Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
        Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
        В консоль вывести индекс строки, сумма чисел в которой максимальна.
        Если таких строк несколько, вывести индекс последней из них.
        Пример сгенерированной матрицы (для простоты m=3, n=5):
         */
        int levelSum = 0;
        int indexLevelSum=0;
        int[][] array = new int[12][8];
        Random randomNumbers = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumbers.nextInt(50);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum >= levelSum) {
                levelSum = sum;
                indexLevelSum=i;
            }
        }
        System.out.println(indexLevelSum);
    }
}
