package Lessons.Lesson3;

import java.util.Scanner;

public class Lesson2IfElse {
    public static void main(String[] args) {
        int a = 100;
        int b = 1000;
        boolean ab = a > b;
        if (ab) {
            System.out.println("Переменная А больше, чем В.");
            System.out.println("Уменьшение переменной А.");
            a = b - 1;
            System.out.println("Теперь переменная А = " + a);
        } else {
            System.out.println("Переменная B больше, чем A.");
            System.out.println("Уменьшение переменной B.");
            b = a - 1;
            System.out.println("Теперь переменная B = " + b);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите А");
        int a1 = sc.nextInt();
        System.out.println("Введите В");
        int b1 = sc.nextInt();
        boolean ab1 = a1 > b1;
        if (a1 > b1) {
            System.out.println("Переменная А больше, чем В.");
            System.out.println("Уменьшение переменной А.");
            a1 = b1 - 1;
            System.out.println("Теперь переменная А = " + a1);
        } else {
            System.out.println("Переменная B больше, чем A.");
            System.out.println("Уменьшение переменной B.");
            b1 = a1 - 1;
            System.out.println("Теперь переменная B = " + b1);
        }
        int max;
        if (a1 > b1) {
            max = a1;
        } else {
            max = b1;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Введите А2");
        int a2 = sc.nextInt();
        System.out.println("Введите В2");
        int b2 = sc.nextInt();
        sc.nextLine();
        int max2;
        if (a2 > b2) {
            max2 = a2;
        } else {
            max2 = b2;
        }
        System.out.println("Maximum2: " + max2);
        int min2;
        if (a2 < b2) {
            min2 = a2;
        } else {
            min2 = b2;
        }
        System.out.println("Minimum2: " + min2);
        int max3;
        int min3;
        max3 = a2 > b2 ? a2 : b2;
        min3 = a2 < b2 ? a2 : b2;
        System.out.println("Maximum 3:" + max3);
        System.out.println("Minimum 3:" + min3);
        boolean value = true;
        int x = value ? 1 : 10;
        System.out.println("x:" + x);
        boolean value2 = false;
        int x2 = value2 ? 1 : 10;
        System.out.println("x2:" + x2);
        String ab2 = a2 > b2 ? "A больше В" : "В больше А";
        System.out.println("ab2 = " + ab2);
        String str = "abc";
        if (str.equals("abc")) {
            System.out.println("result = " + true);
        } else {
            System.out.println("result = " + false);
        }
        String result = str.equals("abc") ? "really true" : "really false";
        System.out.println("result 2 = " + result);

       assertString(sc, str, str);
    }

    private static void assertString(Scanner scanst, String name, String surname) {
        System.out.println("sur" + surname);
        System.out.println("name" + name);
        System.out.println("enter 3 letters: ");
        String result2 = scanst.nextLine();
        if (result2.equals("abc")) {
            System.out.println("result = " + true);
        } else {
            System.out.println("result = " + false);
        }
        boolean abc = result2.equals("abc");
        System.out.println("result 2 = " + abc);
        System.out.println("enter 3 letters: ");
        String result3 = scanst.nextLine().equals("xyz") ? "wow" : "no";
        System.out.println(result3 + " - result3");
    }
}