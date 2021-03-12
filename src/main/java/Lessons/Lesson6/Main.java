package Lessons.Lesson6;

public class Main {
    public static void main(String[] args) {
ClassA objectA = new ClassA();
objectA.demo();
objectA.x = 10;
        System.out.println(objectA.x);
        ClassA.y = 11;
        ClassA.stDemo();
        System.out.println(ClassA.y);
        ClassA.ClassB objectB = new ClassA.ClassB();
        ClassA objectA2 = new ClassA();
        ClassA objectA3 = new ClassA();
        ClassA objectA4 = new ClassA();
        ClassA objectA5 = new ClassA();
        objectA2.setY(1111);
        objectA3.setY(2222);
        objectA4.setY(3333);
        objectA5.setY(4444);
        objectA2.setX(99);
        objectA3.setX(88);
        objectA4.setX(77);
        objectA5.setX(66);
        objectA2.demo();
        objectA3.demo();
        objectA4.demo();
        objectA5.demo();
        ObjectsCount obj1 = new ObjectsCount();
        ObjectsCount obj2 = new ObjectsCount();
        ObjectsCount obj3 = new ObjectsCount();
        ObjectsCount obj4 = new ObjectsCount();
        ObjectsCount obj5 = new ObjectsCount();
        ObjectsCount obj6 = new ObjectsCount("name");
        ObjectsCount obj7 = new ObjectsCount (1);
        ObjectsCount obj8 = new ObjectsCount (45);
        ObjectsCount obj9 = new ObjectsCount (763);
        System.out.println(ObjectsCount.count);
        System.out.println(ObjectsCount.countFun);
        System.out.println(ObjectsCount.countTotal);
    }
}
