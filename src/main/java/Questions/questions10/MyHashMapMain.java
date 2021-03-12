package Questions.questions10;

public class MyHashMapMain {
    public static void main(String[] args) {
        MyHashMap <String, Flower> flowers = new MyHashMap<>();
        flowers.add("bad", new Flower("ambrosia", -20));
        flowers.add("good", new Flower("rose", 120));
        System.out.println(flowers.get("good"));
        MyHashMap <String, Integer> numbers = new MyHashMap<>();
        numbers.add("B", 100);
        numbers.add("A", 200);
        numbers.add("C", 300);
        System.out.println(numbers.get("B"));
    }
}
