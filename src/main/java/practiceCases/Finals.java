package practiceCases;

public class Finals {
    public static void main(String[] args) {
        for (final int i : new int[]{1, 2, 3, 4}) {
            System.out.println(i + 1);
        }
        Animal a = new Dog();
        Dog f = new Dog();
        a.bark();
        Animal.bark();
        a.meow();
        Dog.bark();
        f.bark();
        a.test2();
        System.out.println("*******");
        System.out.println(a.i);
        System.out.println(Animal.i);
        System.out.println(Dog.i);
        System.out.println(a.x);
        System.out.println(f.i);
        System.out.println(f.x);
        System.out.println("*******");
        Animal b = new Animal();
        System.out.println(b.str);
        Animal b2 = b;
        b2.str = "New Animal";
        System.out.println(b.str);
        String a1 = "Test";
        String a2 = "Test";
        System.out.println(a2==a1);
        a2 += "";
        System.out.println(a2==a1);
        a1 = "NO";
        System.out.println(a2);
        a2 = a1;
        System.out.println(a1);
        System.out.println(a2);

    }
}
