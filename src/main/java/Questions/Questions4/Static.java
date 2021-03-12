package Questions.Questions4;

public class Static {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        a.x = 10;
        a.y = 10;
        System.out.println("ay = " + a.y);
        a2.x = 20;
        a2.y = 20;
        System.out.println("ax = " + a.x);
        System.out.println("ay = " + a.y);
        System.out.println("a2x = " + a2.x);
        System.out.println("a2y = " + a2.y);
        A.y = 100;
        A.showStatic();
        a.show();
        a2.show();
    }
}
