package Homework.Homework4;

import java.util.Scanner;

public class Homework4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        count(4); //1231412414
        System.out.println(drawRectangle(2, 33));
        System.out.println(drawRectangle(5));
        System.out.println("Maximum = " + Max(7, 9));
        System.out.println("Maximum = " + Max(1.4f, 1.3f));
        System.out.println("Maximum = " + Max(1, 1.00001f));
        getMax();
    }

    public static void count(int x) {           //this task can be solved without array creation.
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    public static String drawRectangle(int height, int width) {     //for such operations string builder or string
        // buffer is much more effective https://www.journaldev.com/538/string-vs-stringbuffer-vs-stringbuilder
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

    public static String drawRectangle(int width) { //reuse already written code
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
        //return drawRectangle(width, width);
    }

    public static int Max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
        //try to write it in 1 row (ternarnui operator)
    }

    public static float Max(float a, float b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
    public static float Max(int a, float b) {
        if (a >= b) {
            System.out.println("aa");
            return a;
        } else {
            System.out.println("bb");
            return b;
        }
    }

    public static void getMax() {
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
}
