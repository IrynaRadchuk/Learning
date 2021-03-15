package lessons.lesson6;

public class ClassA {
    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static int y = 0;
    public int x = 0;

    public static void stDemo() {
        System.out.println("static Demo");
    }

    public void demo() {
        System.out.println("Demo y = " + y + "," + "Demo x = " + x);
    }
    public static class ClassB {
        public String name;
    }
}
