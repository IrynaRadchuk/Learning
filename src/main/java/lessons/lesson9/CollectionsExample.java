package lessons.lesson9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CollectionsExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("ttt");
        list.add("eee");
        list.add("rrr");
        Iterator <String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println();
        PriorityQueue <String>queue = new PriorityQueue();
        queue.add("13124t");
        queue.add("000");
        queue.add("234");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        queue.add("555");
        queue.add("5000");
        System.out.println(queue.poll());
        queue.add("39");
        queue.add("99");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
