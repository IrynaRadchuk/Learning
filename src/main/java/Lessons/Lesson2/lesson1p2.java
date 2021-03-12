package Lessons.Lesson2;

import java.util.Scanner;

public class lesson1p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите текст");
        String line = sc.nextLine();
        System.out.println("вывод:" + line);
        System.out.println("введите число");
        int integer = sc.nextInt();
        System.out.println("вывод:" + integer);
    }
}
