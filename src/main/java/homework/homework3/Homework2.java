package homework.homework3;

import java.util.Scanner;

public class Homework2 {
    static Scanner scan = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Введите размер массива:");
        int x = scan.nextInt();
        int[] a = new int[x];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите " + i + " элемент массива:");
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        int max = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (max < a[i + 1]) {
                max = a[i + 1];
            }
        }
        System.out.println("Maximum " + max);
        int min = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (min > a[i + 1]) {
                min = a[i + 1];
            }
        }
        System.out.println("Minimum " + min);
        int five = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 5) {
                five++;
            }
        }
        System.out.println("Fives " + five);
        for (int j = 0; j < a.length; j++) {
            boolean isDone = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    isDone = false;
                }
            }
            if (isDone) {
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        repeat();
    }

    public static void repeat () {
        int[] a = new int[6];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 1;
        a[5] = 6;
        System.out.println("Максимум повторений 1: ");
        System.out.println(maxRepeatCounter(a));
        System.out.println("Минимум повторений 1: ");
        System.out.println(minRepeatCounter(a));
        int[] b = new int[6];
        b[0] = 1;
        b[1] = 1;
        b[2] = 1;
        b[3] = 4;
        b[4] = 6;
        b[5] = 6;
        System.out.println("Максимум повторений 2: ");
        System.out.println(maxRepeatCounter(b));
        System.out.println("Минимум повторений 2: ");
        System.out.println(minRepeatCounter(b));
        int[] c = new int[6];
        c[0] = 6;
        c[1] = 3;
        c[2] = 3;
        c[3] = 5;
        c[4] = 5;
        c[5] = 6;
        System.out.println("Максимум повторений 3: ");
        System.out.println(maxRepeatCounter(c));
        System.out.println("Минимум повторений 3: ");
        System.out.println(minRepeatCounter(c));

    }

    private static int maxRepeatCounter(int[] array) {
        int maxRepeat = 1;
        for (int j = 0; j < array.length; j++) {
            int t = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[j] == array[i]) {
                    t++;
                }
            }
            if (t > maxRepeat) {
                maxRepeat = t;
            }
        }
        return maxRepeat;
    }

    private static int minRepeatCounter(int[] array) {
        int minRepeat = array.length;
        for (int j = 0; j < array.length; j++) {
            int t = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[j] == array[i]) {
                    t++;
                }
            }
            if (t < minRepeat) {
                minRepeat = t;
            }
        }
        return minRepeat;
    }
    }