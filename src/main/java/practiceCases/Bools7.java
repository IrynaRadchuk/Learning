package practiceCases;

public class Bools7 {

    public static void main(String[] args) {
        boolean b = false;
        int i = 9;
        while (!b) {
            System.out.println(i);
            if (i % 7 == 0) {
                b = true;
            }
            i--;
        }
    }
}
