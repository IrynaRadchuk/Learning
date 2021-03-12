package Homework.homework8;

import java.util.Arrays;

public class MainStore {
    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        System.out.println(Arrays.toString(store.sell(4, 5, 6)));
        System.out.println(Arrays.toString(store.sellSequence(3, 5, 7)));
        System.out.println(store.wallet());
    }
}
