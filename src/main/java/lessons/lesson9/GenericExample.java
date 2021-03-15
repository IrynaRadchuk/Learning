package lessons.lesson9;

import lessons.lesson9.generics.Data;
import lessons.lesson9.generics.GenericData;
import questions.questions5.utils.Dog;

public class GenericExample {
    public static void main(String[] args) {
        Data data = new Data();
        data.dataName = "Animal";
        data.dataSize = 100;
        data.data = new Dog("dog",5);
        ((Dog)data.data).setName("Lucky");
        GenericData <Dog, String> genericData = new GenericData<>();
        genericData.dataName = "Animal";
        genericData.dataSize = 100;
        genericData.data = new Dog("dog",5);
        genericData.data.setName("Lucky");
        genericData.data2 = "String";
    }
}
