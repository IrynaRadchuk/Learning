package lessons.lesson4;

public class Recursion {
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        int x = fact(n - 1);
        return n * x;
    }

    public static void main(String[] args) {
        System.out.println("F(3)= " + fact(3));
        System.out.println("F(5)= " + fact(5));
        System.out.println("F(0)= " + fact(0));
    }
}
