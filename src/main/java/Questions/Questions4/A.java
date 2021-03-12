package Questions.Questions4;

public class A {
    public static int y = 0;
    public int x = 0;

    public static void showStatic() {
        System.out.println("y = " + y);
        // а так нельзя System.out.println("x = " + x);
    }

    public void show() {
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}
