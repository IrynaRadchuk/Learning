package lessons.lesson7.animals.animalTypes;

public class Snakes extends BaseAnimal {
    public Snakes(String name, int age, float weight, boolean vaccination) {
        super(name, age, weight, vaccination);
    }

    @Override
    public void movement() {
        System.out.println("body");
    }
    @Override
    public void show() {
        super.show();
        System.out.println("\t movement: " + "body");
    }
}
