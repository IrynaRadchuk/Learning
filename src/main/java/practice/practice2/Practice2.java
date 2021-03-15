package practice.practice2;

import java.util.Scanner;

public class Practice2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scan.nextInt();
        System.out.println("Sum = " + (firstNumber + secondNumber));
        System.out.println("Enter first rectangle side:");
        int firstSide = scan.nextInt();
        System.out.println("Enter second rectangle side:");
        int secondSide = scan.nextInt();
        System.out.println("S = " + firstSide * secondSide);
        System.out.println("Enter first triangle side:");
        int firstTriangle = scan.nextInt();
        System.out.println("Enter second triangle side:");
        int secondTriangle = scan.nextInt();
        System.out.println("Enter third triangle side:");
        int thirdTriangle = scan.nextInt();
        double pTriangle = (double) (firstTriangle + secondTriangle + thirdTriangle) / 2;
        System.out.println(pTriangle);
        double sTriangle = Math.sqrt((pTriangle * (pTriangle - firstTriangle) * (pTriangle - secondTriangle) * (pTriangle - thirdTriangle)));
        System.out.println("S = " + sTriangle);
    }
}
