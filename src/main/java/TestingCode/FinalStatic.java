package TestingCode;

public class FinalStatic {
    static int a = FinalStatic.b;
    static final int jk = FinalStatic.b;
    static final int b = 3;
    static int c = FinalStatic.d;
    static int d = 1;
    static int g = d;
    int u = d;
    int y = 12;
    int z = y;
    static int r;
    static int f;

    public static void main(String[] args) {
        r = f;
        f = 12;
        System.out.println("a " + a);
        System.out.println("j " + jk);
        System.out.println("b " + b);
        System.out.println("c " + c);
        System.out.println("d " + d);
        System.out.println("r " + r);
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
        Class c1 = new Dog().getClass();
        Class c2 = new Dog().getClass();
        System.out.println(c1==c2);

     }
}
