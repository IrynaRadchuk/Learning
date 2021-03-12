package TestingCode;

public class StaticBlocks {
    {
        System.out.println("one");
    }
    StaticBlocks () {

        System.out.println("two");
    }
    static {
        System.out.println("three");
    }
    {
        System.out.println("four");
    }

    public static void main(String[] args) {
        System.out.println("five");
        new StaticBlocks();
    }
}
