package Lessons.lesson11;

public class LambdaExample {
    static void sum (int a,int b) {
        System.out.println("a+b=" + (a+b));
    }
    static void multiply (int a,int b) {
        System.out.println("a*b=" + (a*b));
    }
    static void calculate (Runnable task) {
        task.run();
    }
    public static void main(String[] args) {
        sum(2,3);
        calculate(() ->sum(4,5));
        calculate(() ->multiply(4,5));
        calculate(() -> {
            System.out.println("nenen");
        });
    }
}
