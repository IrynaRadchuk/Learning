package Lessons.lesson8.products;

public class SuperProduct {
    private String name;
    private int id;

    public SuperProduct(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("\n[" + id + "] " + name);
    }
}
