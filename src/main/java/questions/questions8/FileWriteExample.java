package questions.questions8;

import lessons.lesson7.animals.Animal;
import lessons.lesson7.animals.Cat;
import lessons.lesson7.animals.Snake;

import java.io.*;

public class FileWriteExample {
    private static final String FILE = "animals1.txt";
    private static final String PATH = "files/questions8/" + FILE;
    private static final String SEPARATOR = ";";

    static void saveAnimals(Animal[] animals) {
        try {
            FileWriter writer = new FileWriter(PATH);
            writer.write("" + animals.length + "\n");
            for (Animal animal : animals) {
                writer.write(animal.getClass().getSimpleName() + SEPARATOR);
                writer.write(animal.getName() + SEPARATOR);
                writer.write(animal.getAge() + SEPARATOR);
                writer.write(animal.getWeight() + SEPARATOR);
                if (animal instanceof Snake) {
                    Snake snake = (Snake) animal;
                    writer.write(snake.getLength() + SEPARATOR);
                }
                writer.write("\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Animal[] loadAnimals() {
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int count = Integer.parseInt(bufferedReader.readLine());
            Animal[] animals = new Animal[count];
            for (int i = 0; i < animals.length ; i++) {
                String line = bufferedReader.readLine();
                String[] data = line.split(SEPARATOR);
                String animalName = data[1];
                int animalAge = Integer.parseInt(data[2]);
                if (data[0].equals(Cat.class.getSimpleName())) {
                    animals [i] = new Cat(animalName, animalAge, Float.parseFloat(data[3]));
                }
                if (data[0].equals(Snake.class.getSimpleName())) {
                    animals [i] = new Snake(animalName,
                            animalAge,
                            Float.parseFloat(data[3]),
                            Float.parseFloat(data[4]));
                }
            }
            return animals;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Kitty", 10, 2),
                new Snake("Cobra", 5, 1, 18)
        };
        saveAnimals(animals);
        animals = null;
        animals = loadAnimals();
        printAnimals(animals);
    }

    private static void printAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
            System.out.println(animal.getAge());
            System.out.println(animal.getWeight());
            if (animal instanceof Snake) {
                Snake snake = (Snake) animal;
                System.out.println(snake.getLength());
            }
        }
    }
}
