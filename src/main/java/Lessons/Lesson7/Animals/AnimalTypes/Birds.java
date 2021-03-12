package Lessons.Lesson7.Animals.AnimalTypes;

public class Birds extends BaseAnimal implements InterfaceExample {
    public Birds(String name, int age, float weight, boolean vaccination) {
        super(name, age, weight, vaccination);
    }

    @Override
    public void movement() {
        System.out.println("wings");
    }

    @Override
    public void show() {
        System.out.println("bird:");
        System.out.println("\t name: " + getName());
        System.out.println("\t age: " + getAge());
        System.out.println("\t weight: " + getWeight());
        System.out.println("\t vaccination: " + isVaccination());
        System.out.println("\t movement: " + "wings");
    }
}
