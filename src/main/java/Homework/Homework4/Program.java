package Homework.Homework4;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String c;
        do {
            doSmth();
            scanner.nextLine();
            System.out.println("Other task y/n");
            c = scanner.nextLine();
        }
        while (c.equals("y"));
        }

    private static void doSmth() {
        System.out.println("Task #");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                System.out.println("Enter number");
                count(scanner.nextInt());
                break;
            case 2:
                System.out.println("Enter height and width");
                System.out.println(drawRectangle(scanner.nextInt(), scanner.nextInt()));
                break;
            case 3:
                System.out.println("Enter width");
                System.out.println(drawRectangle(scanner.nextInt()));
                break;
            case 4:
                getMax(scanner);
                break;
            case 5:
                System.out.println("Enter number");
                counts(scanner.nextInt());
                break;
            default:
                System.out.println("Wrong input (enter 1-6)");
                break;
        }
    }

    public static void count(int x) {
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    public static String drawRectangle(int height, int width) {
        String rectangle = "";
        char c = '+';
        for (int i = 0; i < height; i++) {
            String line = "";
            for (int j = 0; j < width; j++) {
                line += c;
            }
            rectangle += line + "\n";
        }
        return rectangle;
    }

    public static String drawRectangle(int width) {
        String rectangle = "";
        char c = '+';
        for (int i = 0; i < width; i++) {
            String line = "";
            for (int j = 0; j < width; j++) {
                line += c;
            }
            rectangle += line + "\n";
        }
        return rectangle;
    }

    public static void getMax(Scanner scanner) {
        System.out.println("Enter A");
        int a = scanner.nextInt();
        System.out.println("Enter B");
        int b = scanner.nextInt();
        int max;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("Max = " + max);
    }

    public static int counts(int x) {
        if (x < 1) {
            return 0;
        }
        int i = 1 + counts(x - 1);
        System.out.println(i);
        return i;
    }

}
