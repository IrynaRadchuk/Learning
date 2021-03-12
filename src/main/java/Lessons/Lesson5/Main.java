package Lessons.Lesson5;

public class Main {
    public static void main(String[] args) {
        ClassConstructor dog = new ClassConstructor(); //объект класса
        dog.age = 7;
        System.out.println(dog.name);
        System.out.println(dog.age);
        dog.age = 17;
        System.out.println(dog.age);
    }
}
