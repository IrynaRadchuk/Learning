package lessons.lesson3;

import java.util.Arrays;

public class Lesson2Arrays {
    public static void main(String[] args) {
        int [] a = new int [10];
        a [0] = 6;
        a [1] = 2;
        a [2] = 10;
        a [3] = 15;
        int x = a [2];
        System.out.println("x = " + x);
        For(a);
        While(a);
    }

    private static void For(int[] a) {
        System.out.println("For1");

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        System.out.println("For2");
        for (int i1 = 0; i1 < a.length; i1++) {
            a[i1] = i1 * 2;
            System.out.println("a[" + i1 + "] = " + a[i1]);
        }
    }

    public static void While (int[] a) {
        System.out.println("While1");
        int i = 0;
        System.out.println(Arrays.toString(a));
        //int[] b = new int [6];
        while ( i < a.length) {
            a[i] = a[i] + 5;
            System.out.println("a[" + i + "] = " + a[i]);
            i++;
        }
    }
}
