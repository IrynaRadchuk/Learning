package questions.questions3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        System.out.println(line);
        for (String number : numbers) {
            System.out.println(number);
        }
        int [] array = new int[numbers.length];
        for (int i = 0; i < numbers.length ; i++) {
            array [i] = Integer.parseInt(numbers[i]);
        }
        for (int arrayNumber : array) {
            System.out.println(arrayNumber);
        }
        Arrays.sort(array);
        for (int arrayNumber : array) {
            System.out.println(arrayNumber);
        }
    }
}
