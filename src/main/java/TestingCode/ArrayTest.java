package TestingCode;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(2);
        arr.add(5);
        arr.add(6);
        arr.add(1,7);
        System.out.println(arr.indexOf(6));
        arr.remove(1);
        System.out.println(arr.indexOf(6));
    }
}
