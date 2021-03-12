package Lessons.Lesson3;

import java.util.Scanner;

public class Lesson2ContinueBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x:");
        int x = scan.nextInt();
        int [] a = new int [10];
        for (int i = 0; i < a.length; i++) {
            a [i] = i+1;
            System.out.println("a[" + i + "] = " + a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("number " + i);
            if (a[i] == x) {
                System.out.println("X");
                break;
            }
            else {
                System.out.println("not X");
            }
        }
        Cont(scan);
    }

    public static void Cont (Scanner scan) {
        System.out.println("Вывести все кроме:");
        int x = scan.nextInt();
        int [] a = new int [10];
        System.out.println("continue example");
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            if (a[i] == x) {
                continue;
            }
            System.out.println(a[i]);
        }
            System.out.println("break example");
            for (int i = 0; i < a.length; i++) {
                a[i] = i + 1;
                if (a[i] == x) {
                    break;
                }
                System.out.println(a[i]);
        }
    }
}
