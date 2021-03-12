package Questions.Questions5;

import Questions.Questions5.utils.Dog;

import java.util.Arrays;

public class ObjectsArray {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog("Shar", 13),
                new Dog("Bob", 5),
                new Dog("Tuz", 7)};
        Dog dog1 = dogs[0];
        Dog dog = null;
        System.out.println(dog1.getName());
        Dog[] tempDogs = new Dog[dogs.length + 1];
        for (int i = 0; i < dogs.length; i++) {
            tempDogs[i] = dogs[i];
        }
        dogs = tempDogs;
        dogs[3] = new Dog("Rex", 9);
        System.out.println(Arrays.toString(dogs));
        Dog dog2 = dogs[1];
        System.out.println(dog2.getName());
        Dog young = SmallDog(dogs);
        System.out.println("Young dog name: " + young.getName());
    }

    private static Dog SmallDog(Dog[] dogs) {
        Dog minimum = dogs[0];
        for (int i = 1; i < dogs.length; i++) {
            if (minimum.getAge() > dogs[i].getAge()) {
                minimum = dogs[i];
            }
        }
        return minimum;
    }
}
