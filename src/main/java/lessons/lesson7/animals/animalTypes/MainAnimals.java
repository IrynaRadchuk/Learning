package lessons.lesson7.animals.animalTypes;


import java.util.PriorityQueue;

public class MainAnimals {
    public static void main(String[] args) {
        Birds bird1 = new Birds("crow", 2, 1,true);
        Snakes snake1 = new Snakes("serpent", 5,2, true);
        Mammals mammal1 = new Mammals("dog",12,7,true);
        BaseAnimal animal = new BaseAnimal("cat",5,1) {
            @Override
            public void movement() {
                System.out.println("paws");
            }
        };
        System.out.println("****************************");
        System.out.println(snake1.compareTo(animal));
        PriorityQueue<BaseAnimal> queue = new PriorityQueue<>();
        queue.add(bird1);
        queue.add(snake1);
        queue.add(mammal1);
        queue.add(animal);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        bird1.movement();
        snake1.movement();
        mammal1.movement();
        animal.movement();
        System.out.println(animal.isVaccination());
        bird1.show();
        snake1.show();
        mammal1.show();
        animal.show();
        InterfaceExample [] animals  = new InterfaceExample [] {bird1,snake1,mammal1,animal};
        for (InterfaceExample canShow: animals) {
            canShow.show();
        }
    }
}
