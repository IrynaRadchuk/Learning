package Homework.homework9;

public class MainLists {
    public static void main(String[] args) {
        Integer[] elements = {1, 2, 3, 4, 5, 6, 7};
        MyArrayList<Integer> arr1 = new MyArrayList(elements);
        arr1.add(33);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i));
        }
        System.out.println("******");
        System.out.println(arr1.size());
        System.out.println("******");
        System.out.println(arr1.get(5));
        System.out.println("******");
        System.out.println(arr1.get(23));
        System.out.println("******");
        arr1.remove(4);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i));
        }
        System.out.println("******");
        System.out.println(arr1.size());
        System.out.println("******");
        arr1.clear();
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i));
        }
    }
}
