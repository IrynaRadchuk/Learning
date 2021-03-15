package lessons.lesson7.animals;

public class Snake extends Animal {
private float length;
    public Snake(String name, int age, float weight, float length) {
        super(name, age, weight);
        this.length = length;
    }
    //variant 1 (without default)
//    public Snake (String name, int age, float weight) {
//        super(name, age, weight);
//    }
//variant 2 (with default)

    public Snake (String name, int age, float weight) {
        this (name, age, weight, 0);
    }
    public Snake () {
        this (null, 0, 0);
    }
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
