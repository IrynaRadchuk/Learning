package homework.homework10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainFruit {
    public static void main(String[] args) throws IOException {
        FruitStore store = new FruitStore();
        store.addFruits(new Scanner(new File("files/homework10/fruitDelivery.json")).useDelimiter("\\Z").next());
        System.out.println(store.fruitsOnStore);
        store.save("files/homework10/newFruits.json");
    }
}
