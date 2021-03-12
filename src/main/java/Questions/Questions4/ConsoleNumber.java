package Questions.Questions4;

import java.util.Scanner;

public class ConsoleNumber {
    static int a;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
        try {
//            a = Integer.valueOf(s);
            a =scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Это не число!!!");
          //  System.err.println(s + " - Это не число!!!");
        }
        System.out.println(a);
    }
}
