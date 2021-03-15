package lessons.lesson7.animals.animalTypes;

public abstract class BaseAnimal implements InterfaceExample, Comparable {
        private String name;
        private int age;
        private float weight;
        private boolean vaccination;


    public BaseAnimal(String name, int age, float weight, boolean vaccination) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.vaccination = vaccination;
    }

    public BaseAnimal(String name, int age, float weight) {
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
    public boolean isVaccination() {
        return vaccination;
    }

    public void setVaccination(boolean vaccination) {
        this.vaccination = vaccination;
    }

    public abstract void movement ();
    @Override
    public void show() {
        System.out.println();
        System.out.println("\t name: " + name);
        System.out.println("\t age: " + age);
        System.out.println("\t weight: " + weight);
        System.out.println("\t vaccination: " + vaccination);
    }

    @Override
    public int compareTo(Object o) {
        BaseAnimal o1 = (BaseAnimal) o;
        if (this.age==o1.age) {
            return 0;
        }
        if (this.age > o1.getAge()){
            return 1;
        }else return -1;
    }
}
