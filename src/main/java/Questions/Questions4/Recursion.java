package Questions.Questions4;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(recursion(5));
        System.out.println(recursion(10, 20));
        System.out.println(recursion(30, 15));
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(recursion(a, b));
        countdown(a);
    }

    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }

    public static String recursion(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(b);
            }
            return a + " " + recursion(a + 1, b);
        }

    }

    public static void countdown(int i) {
        if (i < 1)
        {
            return;
        }
        System.out.print (i + " ");
        countdown(i - 1);
    }
}
