package questions.questions4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                System.out.println("value (int) = " + value);
            }
            else {
                String value = scanner.next();
                System.out.println("value (str) = " + value);
            }
        }
    }
}
