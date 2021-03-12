package TestingCode;

import java.util.ArrayList;

public class Animal {
    int x = 1;
    public static int i = 2;
    public void meow () {
        System.out.println("an-m");
    }
    public static void bark(){
        System.out.println("animal-bark");
    }
    public void test1 () {
        System.out.println("T1 animal");
    }
    public void test2 () {
        test1();
    }
    public Animal () {
        str = "ANIMAL";
    }
    public String str;
}
