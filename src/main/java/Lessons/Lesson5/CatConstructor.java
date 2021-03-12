package Lessons.Lesson5;

import Lessons.Lesson5.CatData.CatData;

public class CatConstructor {
    public Name name = new Name();
    public CatData dataName = new CatData();
    public static class Name {
        public String firstName;
        public String lastName;
    }
    public void show () {
        System.out.println(name.firstName + "\t" + name.lastName );
        System.out.println(dataName.firstName + "\t" + dataName.lastName );
    }
}
