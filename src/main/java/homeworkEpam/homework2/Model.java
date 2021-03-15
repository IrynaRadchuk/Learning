package homeworkEpam.homework2;

public class Model {
    public static final int RAND_MAX = Integer.MAX_VALUE;

    public static int hiddenNumber(int min, int max) {
        double random = Math.random();
        int randomNumberInRange = (int) (random * ((max - min) + 1) + min);
        return randomNumberInRange;
    }

    public static int hiddenNumber() {
        double random = Math.random();
        int randomNumberInRange = (int) (random * RAND_MAX);
        return randomNumberInRange;
    }

    public boolean tryToGuess(int niceTry, int hiddenNumber) {
        return niceTry == hiddenNumber;
    }
}
