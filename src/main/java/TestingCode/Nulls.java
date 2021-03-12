package TestingCode;

public class Nulls {
    static String s;
    static int i;
    static double d;
    static boolean b;
    static Object o;
    static Integer n;
    //***
    static float f;
    static byte bt;
    static long l;
    static char c;
    static Character ch;
    static Long ll;
    static Short sh;
    static short dt;

    static void meth(float i) {
        System.out.println("float");
    }

    static void meth(Float dd) {
        System.out.println("Float");
    }

    static void meth2(int ddr) {
        System.out.println("int");
    }

    static void meth2(long ddr) {
        System.out.println("long");
    }

    static void meth2(short ddr) {
        System.out.println("short");
    }

    static void meth2(Integer dd) {
        System.out.println("integer");
    }

    static void meth4(Double ddr) {
        System.out.println("Double");
    }

    static void meth4(Integer ddr) {
        System.out.println("integer");
    }

    static void meth4(Long ddr) {
        System.out.println("Long");
    }

    static void meth2(Object ddt) {
        System.out.println("ob");
    }

    static void meth3(Dog dog) {
        System.out.println("dog");
    }

    static void meth3(Animal an) {
        System.out.println("an");
    }
//    static void meth3 (Cat cat) {
//        System.out.println("cat");
//    }

    public static void main(String[] args) {
        System.out.println(s);
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(o);
        System.out.println(n);
        System.out.println(f);
        System.out.println(bt);
        System.out.println(l);
        System.out.println("***");
        System.out.println("!" + c + "@");
        System.out.println("***");
        System.out.println(ch);
        System.out.println(ll);
        System.out.println(sh);
        System.out.println(dt);
        System.out.println("***");
        meth(1.8f);
        meth2(354);
        meth3(null);
        meth4(17);
        char c2 = '\u0003';
        byte c3 = (byte) c2;
        final char c1 = '\u0002';
        byte c11 = c1;
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1);
        System.out.println(c11);
    }
}