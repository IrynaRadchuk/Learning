package Homework.homework10;


public class Fruit {
    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private FruitType type;
    private int shelfLife;
    private String date;
    private int price;

    public Fruit(FruitType type, int shelfLife, String date, int price) {
        this.type = type;
        this.shelfLife = shelfLife;
        this.date = date;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", shelfLife=" + shelfLife +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
