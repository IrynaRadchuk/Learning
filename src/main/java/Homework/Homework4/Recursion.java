package Homework.Homework4;

public class Recursion {
    public static void main(String[] args) {
        counts(5, 1);
        count(5);
//        System.out.println(drawRec(3, 4));
        drawRec(5, 44);
    }

    public static int count(int x) {
        if (x < 1) {
            return 0;
        }
        int i = 1 + count(x - 1);
        System.out.println(i);
        return i;
    }

    public static void drawRec(int width, int height) {
        if (height > 0) {
            height--;
            drawWidth(width);
            System.out.println();
            drawRec(width, height);
        }
    }

    private static void drawWidth(int width) {
        if (width > 0) {
            width--;
            drawWidth(width);
            System.out.print("+");
        }


    }
/*    public static String drawRec(int width, int height) {
        char c = '+';
        if (width < 1) {
            return "";
        }
        return c + drawRec(width - 1, height - 1);
    }*/

    public static void counts(int a, int i) {
        System.out.println(i++);
        if (i <= a) {
            counts(a, i);
        }
    }
}

