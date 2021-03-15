package homework.homework8;

public class Flowers {
    private int quantity;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Flowers(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }
    public void makeBouquet () {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
