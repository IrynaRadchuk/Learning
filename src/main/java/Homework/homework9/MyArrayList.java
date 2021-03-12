package Homework.homework9;

import java.lang.reflect.Array;

public class MyArrayList<T> {
    private T[] arrayList;

    public MyArrayList(T[] arrayList) {
        this.arrayList = arrayList;
    }

    public T[] getArrayList() {
        return arrayList;
    }

    public void setArrayList(T[] arrayList) {
        this.arrayList = arrayList;
    }

    public void add(T value) {
//        int i1 = arrayList.length + 1;
//        Class<?> aClass = value.getClass();
//        T[] newArrayList = (T[]) Array.newInstance(aClass, i1);
        T[] newArrayList = (T[]) new Object[arrayList.length + 1];
        for (int i = 0; i < arrayList.length; i++) {
            newArrayList[i] = arrayList[i];
        }
        newArrayList[arrayList.length] = value;
        arrayList = newArrayList;
    }
    public int size () {
        return arrayList.length;
    }

    public T get(int index) {
        if (index<arrayList.length) {
            return arrayList[index];
        }
        else return null;
    }
    public void remove (int index) {
        T[] newArrayList = (T[]) new Object[arrayList.length - 1];
        for (int i = 0; i < arrayList.length - 1; i++) {
            newArrayList[i] = arrayList[i];
        }
        for (int i = index; i < arrayList.length-1; i++) {
            newArrayList[i] = arrayList[i+1];
        }
        arrayList = newArrayList;
    }
    public void clear () {
        T[] newArrayList = (T[]) new Object[0];
        arrayList = newArrayList;
    }
}
