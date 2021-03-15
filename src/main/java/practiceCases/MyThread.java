package practiceCases;

public class MyThread extends Thread{
    public void run(){
        System.out.println("r1");
    }

    public static void main(String[] args) {
        System.out.println("r2");
        new MyThread().start();
        Character c1 = 'c';
        Character c2 = 'c';
        Character c3 = new Character('c');
        Character c4 = new Character('c');
        System.out.println("Characters");
        System.out.println(c1==c2);
        System.out.println(c1=='c');
        System.out.println(c3==c4);
        System.out.println(c3.equals(c4));
        double f1 = 0.2;
        double f2 = 0.2;
        System.out.println("doubles");
        System.out.println(f1==f2);
        System.out.println(f1==0.2);
        Float h1 = 0.8f;
        Float h2 = 0.8f;
        System.out.println("Floats");
        System.out.println(h1==h2);
        System.out.println(h1==0.8f);
        System.out.println(h1.equals(h2));
        System.out.println("Longs");
        long l1 = 777;
        long l2 = 777;
        System.out.println(l1==l2);
        System.out.println(l1==777);
        float z1 = 0.8f;
        float z2 = 0.8f;
        System.out.println("floats");
        System.out.println(z1==z2);
        System.out.println(z1==0.8f);
        Double t1 = 0.2;
        Double t2 = 0.2;
        System.out.println("Doubles");
        System.out.println(t1==t2);
        System.out.println(t1==0.2);
        System.out.println(t1.equals(t2));
        System.out.println("Integers");
        Integer ui = new Integer(10);
        Integer uj = new Integer(10);
        System.out.println(ui.equals(uj));
    }
}
