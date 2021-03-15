package questions.questions3;

import java.util.Arrays;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 67, 4, 6, 32, 8};
        System.out.println(Arrays.toString(a));
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x");
        int x = scanner.nextInt();
        switch (x) {
            case 0:
                x++;
                break;
            case 10:
                x--;
                break;
            case 5:
                x = x * 5;
                break;
        }
        System.out.println(x);
    }
}
