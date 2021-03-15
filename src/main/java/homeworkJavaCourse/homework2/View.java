package homeworkJavaCourse.homework2;

import java.util.HashSet;

public class View {
    public static final int RAND_MAX = Integer.MAX_VALUE;
    public static final int MIN = 0;
    public void triesUsed(HashSet<Integer> tries) {
        System.out.println("Tries used " + tries.toString());
    }

    public void lastTry(String lastTry) {
        System.out.println(lastTry);
    }

    public void tryToGuess(int min, int max) {
        System.out.println("Try to guess the number between " + min + " and " + max);
    }
    public void tryToGuess() {
        System.out.println("Try to guess the number between " + MIN + " and " + RAND_MAX);
    }

    public void numberUsed() {
        System.out.println("This number was used. Try again!");
    }

    public void youWin() {
        System.out.println("You win!");
    }

    public void notNumber() {
        System.out.println("Not a number!");
    }
    public String falseTry() {
        return "Last try was false. Try again! ";
    }
    public void wrongNumber() {
        System.out.println("Wrong number!");
    }
}
