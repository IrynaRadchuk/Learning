package homework.homework3;

import java.util.Scanner;

public class Homework2p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[0];
        System.out.println("Введите элементы массива:");
        for (int i = 0; scan.hasNextInt(); i++) {
            int input = scan.nextInt();
            int[] b = new int[i + 1];
            for (int j = 0; j < a.length; j++) {
                b[j] = a[j];
            }
            b[i] = input;
            a = b;
            System.out.println("b[" + i + "] = " + b[i]);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
