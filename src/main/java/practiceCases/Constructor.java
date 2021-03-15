package practiceCases;

public class Constructor {

    private static int j = 12;
    public static int y = 7;
    private int g = 3;
    public int u = 90;

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        Constructor.j = j;
    }

    Constructor (int r) {
        j = 333;
        System.out.println("ttt");
    }
}
