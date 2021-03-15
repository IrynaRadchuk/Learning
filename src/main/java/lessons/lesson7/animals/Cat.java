package lessons.lesson7.animals;

import java.util.Objects;

public class Cat extends Animal {
    public Cat(String name, int age, float weight) {
        super(name, age, weight);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return getAge() == cat.getAge() &&
                Float.compare(cat.getWeight(), getWeight()) == 0 &&
                Objects.equals(getName(), cat.getName());
    }
    @Override
    public float getWeight() {
        return super.getWeight()+5;
    }
}
