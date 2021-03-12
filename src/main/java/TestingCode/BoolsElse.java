package TestingCode;

public class BoolsElse {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if (a) {
            System.out.println(1);
        }
        else if (a && b) {
            System.out.println(12);
        }
        else if (!b) {
            System.out.println(13);
        }
        else System.out.println(14);
    }

}
