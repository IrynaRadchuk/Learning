package Lessons.Lesson7.Animals.AnimalTypes;

public class Mammals extends BaseAnimal {
    public Mammals(String name, int age, float weight, boolean vaccination) {
        super(name, age, weight, vaccination);
    }

    @Override
    public void movement() {
        System.out.println("legs");
    }
    @Override
    public void show() {
    super.show();
        System.out.println("\t movement: " + "legs");
    }

}
