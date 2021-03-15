package questions.questions9;

public class Person {
    public String name;
    private static int counter = 1;

    public static void refreshCounter() {
        counter = 1;
    }

    public Person() {
        this.name = "" + counter++;
        System.out.println("Mr." + name + " comes in queue");
    }
}
