package lessons.lesson9;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet <String> hset = new HashSet<>();
        hset.add("Apple");
        hset.add("Banana");
        hset.add("Mango");
        hset.add("Peach");
        hset.add("Fig");
        hset.add("Apple");
        hset.add(null);
        hset.add(null);
        System.out.println(hset);
    }
}
