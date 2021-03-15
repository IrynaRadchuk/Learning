package practiceCases;

public class StaticBlocks2 {
    //one
    /*two*/
    {
        System.out.println(1);
    }

    StaticBlocks2() {
        System.out.println(2);
    }

    public static void letters() {
        System.out.println("method");
    }

    public static void main(String[] args) {
        System.out.println(3);
        StaticBlocks2 block = new StaticBlocks2();
        System.out.println(4);
    }

    static {
        System.out.println(5);
    }
}
