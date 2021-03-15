package lessons.lesson5;

import lessons.lesson5.catData.CatData;

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
