package TestingCode;

public class ConstructorEx extends Constructor{
    ConstructorEx(int r) {
        super(r);
        setJ(55);
        setG(66);
        Constructor.y = 633;
        super.u = 75;
        System.out.println("fff");
    }

    public static void main(String[] args) {
        System.out.println(Constructor.getJ());
        System.out.println(Constructor.y);
        new ConstructorEx(2);
        System.out.println(Constructor.getJ());
        System.out.println(Constructor.y);
        ConstructorEx uy  = new ConstructorEx(8);
        System.out.println(uy.getG());
        System.out.println(uy.u);
        Constructor tt = new ConstructorEx(77);
        System.out.println(tt.getG());
        System.out.println(tt.u);
        System.out.println(tt.getJ());
        System.out.println(tt.y);
        System.out.println(Constructor.getJ());
        System.out.println(Constructor.y);
        Constructor gh = new Constructor(4);
        System.out.println(gh.getG());
        System.out.println(gh.u);
        System.out.println(gh.getJ());
        System.out.println(gh.y);
    }
}
