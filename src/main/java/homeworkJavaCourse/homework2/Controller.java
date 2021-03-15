package homeworkJavaCourse.homework2;

import java.util.HashSet;
import java.util.Scanner;

public class Controller {

    public void newGame(int min, int max) {
        Model model = new Model();
        View view = new View();
        Scanner scanner = new Scanner(System.in);
        int niceTry;
        int hiddenNumber = Model.hiddenNumber(min, max);
        String lastTry = "";
        HashSet<Integer> tries = new HashSet<>();
        int tempTry = 0;
        do {
            view.triesUsed(tries);
            view.lastTry(lastTry);
            view.tryToGuess(min, max);
            boolean isItInteger = scanner.hasNextInt();
            String niceString = scanner.next();
            if (isItInteger) {
                niceTry = Integer.parseInt(niceString);
                tempTry = niceTry;
                if (niceTry > max || niceTry < min) {
                    view.wrongNumber();
                } else {
                    tries.add(niceTry);
                }
                for (Integer doneTry : tries) {
                    if (doneTry == niceTry) {
                        view.numberUsed();
                    }
                }

                if (niceTry != hiddenNumber) {
                    lastTry = view.falseTry();
                }
                if (niceTry == hiddenNumber) {
                    view.youWin();
                }

            } else {
                view.notNumber();
            }
        }
        while (!model.tryToGuess(tempTry, hiddenNumber));
    }

    public void newGame() {
        Model model = new Model();
        View view = new View();
        Scanner scanner = new Scanner(System.in);
        int niceTry;
        int hiddenNumber = Model.hiddenNumber();
        String lastTry = "";
        HashSet<Integer> tries = new HashSet<>();
        int tempTry = 0;
        do {
            view.triesUsed(tries);
            view.lastTry(lastTry);
            view.tryToGuess();
            boolean b = scanner.hasNextInt();
            String niceString = scanner.next();
            if (b) {
                niceTry = Integer.parseInt(niceString);
                tempTry = niceTry;
                if (niceTry > view.RAND_MAX || niceTry < view.MIN) {
                    view.wrongNumber();
                } else {
                    tries.add(niceTry);
                }
                for (Integer doneTry : tries) {
                    if (doneTry == niceTry) {
                        view.numberUsed();
                    }
                }
                tries.add(niceTry);
                if (niceTry != hiddenNumber) {
                    lastTry = view.falseTry();
                }
                if (niceTry == hiddenNumber) {
                    view.youWin();
                }

            } else {
                view.notNumber();
            }
        }
        while (!model.tryToGuess(tempTry, hiddenNumber));
    }
}
