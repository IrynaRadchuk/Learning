package Lessons.Lesson3;

import java.util.Random;

public class Lesson2Sorting {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10); //лимит чисел
            System.out.println("a[" + i + "] = " + a[i]);
        }
        System.out.println("Bubble Sort");
        for (int j = 0; j < a.length; j++) {
            boolean isDone = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    isDone = false;
                }
                // полный цикл System.out.println("a[" + i + "] = " + a[i]);
            }
            System.out.println(j);
            if (isDone) {
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
