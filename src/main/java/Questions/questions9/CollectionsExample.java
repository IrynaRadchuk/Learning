package Questions.questions9;

import Questions.Questions5.utils.Dog;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsExample {
    private static final int BEAGLE = 0;
    private static final int TACKS = 1;
    public static void main(String[] args) {
        ArrayList<ArrayList<Dog>> dogs = new ArrayList<>();
        dogs.add(new ArrayList<Dog>()); //бигли index 0
        dogs.add(new ArrayList<Dog>()); //таксы index 1
        dogs.get(BEAGLE).add(new Dog("sima", 12));
        dogs.get(BEAGLE).add(new Dog("bars", 17));
        dogs.get(TACKS).add(new Dog("pup", 1));

        HashMap <String,ArrayList<Dog>> niceDogs= new HashMap<>();
        niceDogs.put("BEAGLE", new ArrayList<Dog>());
        niceDogs.put("TACKS", new ArrayList<Dog>());
        niceDogs.get("BEAGLE").add(new Dog("tom",3));
        niceDogs.get("TACKS").add(new Dog("jack",6));
        Dog dog = niceDogs.get("BEAGLE").get(0);
        HashMap<String,HashMap<String,ArrayList<Dog>>> groupDogs = new HashMap<>();
        //groupDogs.get("ROTTWEILER").get("BLACK").get(2);
    }
}
