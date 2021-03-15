package lessons.lesson9;

import questions.questions5.utils.Dog;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap <String,String> commands = new HashMap<>();
        commands.put("-h", "help");
        commands.put("-i", "info");
        commands.put("-o", "options");
        commands.put("-q", "quit");

        String command = "-i";
        System.out.println(commands.get(command));

        HashMap <String, Dog> dogs = new HashMap<>();
        dogs.put("toy", new Dog("Lucky", 11));
        dogs.put("mops", new Dog("Fedor", 1));
        dogs.put("mops", new Dog("Hog", 7));
        for (String type:dogs.keySet()) {
            System.out.println(dogs.get(type).getName());
        }
    }
}
