package questions.questions10;

public class Flower {
    public String name;
    public int price;

    public Flower(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
