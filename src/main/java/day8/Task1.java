package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String number = " ";
        for (int i=0; i<=20000; i++){
            number+=i+" ";
        }
       System.out.println(number);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);

        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            numbers.append(i).append(" ");
        }
        System.out.println(numbers);
    }
}
