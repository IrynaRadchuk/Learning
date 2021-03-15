package lessons.lesson9;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        int [] array = new int [] {100,20,-30};
        ArrayList <Integer> list = new ArrayList();
        System.out.println(list.size()) ;
        list.add(100);
        list.add(20);
        list.add(-30);
        list.add(1,0);
        list.add(3,0);
        System.out.println(list.size()) ;
        show(list);
        System.out.println();
        while (list.remove((Integer)0)){};
        show(list);
        System.out.println("index of -30 = " + list.indexOf(-30));
    }

    private static void show(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "]" + " list " + list.get(i));
        }
    }
}
