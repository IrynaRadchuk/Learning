package practice.practice2;

import java.util.Scanner;

public class Practice2p2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scan.nextInt();
        boolean equal = secondNumber == firstNumber;
        System.out.println(equal);
        int residue = firstNumber % secondNumber;
        boolean division = residue == 0;
        System.out.println(division);
        boolean big = firstNumber > secondNumber;
        System.out.println(big);
        System.out.println("Enter first number:");
        int firstInt = scan.nextInt();
        System.out.println("Enter second number:");
        int secondInt = scan.nextInt();
        System.out.println("Enter third number:");
        int thirdInt = scan.nextInt();
        int max;
        int temp;
        if (firstInt > secondInt) {
            temp = firstInt;
        } else {
            temp = secondInt;
        }
        if (thirdInt > temp) {
            max = thirdInt;
        } else {
            max = temp;
        }
        System.out.println("Maximum = " + max);
        boolean maximum1 = firstInt == max;
        System.out.println("Is First number maximum? " + maximum1);
        boolean maximum2 = secondInt == max;
        System.out.println("Is Second number maximum? " + maximum2);
        boolean maximum3 = thirdInt == max;
        System.out.println("Is Third number maximum? " + maximum3);
        int min;
        int temp1;
        if (firstInt < secondInt) {
            temp1 = firstInt;
        } else {
            temp1 = secondInt;
        }
        if (thirdInt < temp1) {
            min = thirdInt;
        } else {
            min = temp1;
        }
        System.out.println("Minimum = " + min);
        boolean minimum1 = firstInt == min;
        System.out.println("Is First number minimum? " + minimum1);
        boolean minimum2 = secondInt == min;
        System.out.println("Is Second number minimum? " + (secondInt < firstInt && secondInt < thirdInt));
        boolean minimum3 = thirdInt == min;
        System.out.println("Is Third number minimum? " + minimum3);
        boolean equal1 = firstInt == secondInt || firstInt == thirdInt;
        System.out.println("Does First number have any equals? " + equal1);
        boolean equal2 = secondInt == firstInt || secondInt == thirdInt;
        System.out.println("Does Second number have any equals? " + equal2);
        boolean equal3 = thirdInt == firstInt || thirdInt == secondInt;
        System.out.println("Does Third number have any equals? " + equal3);
        boolean notMin1 = firstInt != min;
        System.out.println("Is First number bigger then any else? " + notMin1);
        boolean notMin2 = secondInt != min;
        System.out.println("Is Second number bigger then any else? " + notMin2);
        boolean notMin3 = thirdInt != min;
        System.out.println("Is Third number bigger then any else? " + notMin3);
        boolean average1 = (firstInt > secondInt && firstInt < thirdInt) || (firstInt < secondInt && firstInt > thirdInt);
        System.out.println("Is First number average? " + average1);
    }
}
