package lessons.lesson7;

import lessons.lesson7.animals.Animal;
import lessons.lesson7.animals.Cat;
import lessons.lesson7.animals.Snake;
import lessons.lesson7.animals.Wolf;

public class MainInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Puss", 10, 4);
        wolfExample();
        Snake snake = new Snake("Sss", 1, 3, 40);
        Snake snake2 = new Snake("Ttt", 2, 4);
        Snake snake3 = new Snake();

        System.out.println("snake length = " + snake.getLength());
        System.out.println("animal name = " + animal.getName());
        snakeExample(snake, snake2, snake3);
        catExample();
    }

    private static void wolfExample() {
        Wolf wolf = new Wolf("Rrr", 5,20);
        System.out.println("wolf age = " + wolf.getAge());
    }

    private static void snakeExample(Snake snake, Snake snake2, Snake snake3) {
        System.out.println("snake 1: ");
        System.out.println("\t name: " + snake.getName());
        System.out.println("\t age: " + snake.getAge());
        System.out.println("\t weight: " + snake.getWeight());
        System.out.println("\t length: " + snake.getLength());
        System.out.println("snake 2: ");
        System.out.println("\t name: " + snake2.getName());
        System.out.println("\t age: " + snake2.getAge());
        System.out.println("\t weight: " + snake2.getWeight());
        System.out.println("\t length: " + snake2.getLength());
        System.out.println("snake 3: ");
        System.out.println("\t name: " + snake3.getName());
        System.out.println("\t age: " + snake3.getAge());
        System.out.println("\t weight: " + snake3.getWeight());
        System.out.println("\t length: " + snake3.getLength());
    }
    public static void catExample () {
        Cat cat1 = new Cat("Kitty", 10, 10);
        Cat cat2 = new Cat("Pusheen", 5, 7);
        System.out.println("cat1:");
        System.out.println("\t name: " + cat1.getName());
        System.out.println("\t age: " + cat1.getAge());
        System.out.println("\t weight: " + cat1.getWeight());
        System.out.println("cat2:");
        System.out.println("\t name: " + cat2.getName());
        System.out.println("\t age: " + cat2.getAge());
        System.out.println("\t weight: " + cat2.getWeight());
    }
}
