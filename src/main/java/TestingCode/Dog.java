package TestingCode;

public class Dog extends Animal{
    int x = 3;
    public static int i = 10;
    public void meow () {
        System.out.println("dog-m");
    }
    public static void bark(){
        System.out.println("doggo-bark");
    }
    @Override public void test1 () {
        System.out.println("T1 DOG");
    }
    @Override public void test2 () {
        super.test2();
    }
}
