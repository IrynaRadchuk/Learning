package Lessons.Lesson5;

public class ClassConstructor2 {
    public String name = "default"; //так будет, если не указать
    private int age = 0;

    public ClassConstructor2(String name, int age) {
        this.age = age; //this - выводит за пределы видимости
        this.name = name;
    }

    public ClassConstructor2() {
        //пустой конструктор, перегруженный метод
    }

    public ClassConstructor2(String name) {
        this(name, 1); //дублировать строки плохо, как внизу
        //this.name = name;
        //age = 1;
    }

    public ClassConstructor2(int age) {
        this("no name", age);
    }

    public void show() {
        System.out.println("name: \t" + name);
        System.out.println("age: \t" + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class Name {
        public String firstName;
        public String lastName;
    }
}
