package Lessons.lesson9.generics;

public class GenericData <T, K>{
    public int dataSize;
    public String dataName;
    public T data;
    public K data2;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
