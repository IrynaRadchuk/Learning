package Lessons.lesson10;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericExtendsExample {
    public static void main(String[] args) {
        //DataGeneric<User> dataWrong = new DataGeneric<>();
        DataGeneric<ArrayList<User>, Float> dataReal = new DataGeneric<>();
        DataGeneric<LinkedList<User>, Integer> dataReal2 = new DataGeneric<>();
    }
}
