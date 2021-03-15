package lessons.lesson6;

public class StaticExample {
    public int x = 0;

    public static void printX(StaticExample object) {
        System.out.println("x = " + object.x); //просто х нельзя, он не статик, нет объекта класса
        object.setY(100);
    }

    public void setY(int y) {
        System.out.println("y = " + y);
    }
}
