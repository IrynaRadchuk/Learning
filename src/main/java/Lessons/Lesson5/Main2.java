package Lessons.Lesson5;

import Lessons.Lesson5.CatData.CatData;
import Lessons.Lesson5.Watch.Parts.Gear;
import Lessons.Lesson5.Watch.Rolex;

public class Main2 {
    public static void main(String[] args) {
        ClassConstructor2 dog1 = new ClassConstructor2("Bob", 3);
        ClassConstructor2 dog2 = new ClassConstructor2("Tuz", 5);
        ClassConstructor2 dog3 = new ClassConstructor2();
        ClassConstructor2 dog4 = new ClassConstructor2("Shar");
        ClassConstructor2 dog5 = new ClassConstructor2(6);
        dog2.name = "Barsik";
        dog2.setAge(100);
        System.out.println("dog1 \t " + dog1.name + "\t \t" + dog1.getAge());
        System.out.println("dog2 \t " + dog2.name + "\t \t" + dog2.getAge());
        System.out.println("dog3 \t " + dog3.name + "\t" + dog3.getAge());
        System.out.println("dog4 \t " + dog4.name + "\t \t" + dog4.getAge());
        System.out.println("dog5 \t " + dog5.name + "\t" + dog5.getAge());
        CatData data = new CatData();
        CatConstructor.Name name = new CatConstructor.Name();
        CatConstructor cat = new CatConstructor();
        cat.name.firstName = "First1";
        cat.name.lastName = "Last1";
        cat.dataName.firstName = "First2";
        cat.dataName.lastName = "Last2";
        System.out.println();
        cat.show();
        System.out.println();
        dog1.show();
        dog2.show();
        dog3.show();
        dog4.show();
        dog5.show();
        Rolex rol = new Rolex("8955hrw",
                new Gear[]{
                        new Gear("platinum", 12),
                        new Gear("silver", 14),
                        new Gear("gold", 11),
                        new Gear("platinum", 10),

                });
        rol.show();
        rol.show();
    }
}
