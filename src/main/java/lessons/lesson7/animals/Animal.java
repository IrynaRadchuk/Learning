package lessons.lesson7.animals;

import java.util.Objects;

public class Animal {
        private String name;
        private int age;
        private float weight;
        private boolean vaccination;

    public Animal(String name, int age, float weight, boolean vaccination) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.vaccination = vaccination;
    }

    public Animal(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        vaccination = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }



    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getWeight(), vaccination);
    }
}
