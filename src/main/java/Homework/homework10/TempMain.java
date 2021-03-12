package Homework.homework10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TempMain {
    public static void main(String[] args) throws FileNotFoundException {
        FruitStore store = new FruitStore();
        store.addFruits(new Scanner(new File("files/homework10/fruitDelivery.json")).useDelimiter("\\Z").next());
        System.out.println(store.fruitsOnStore);
    }
}
