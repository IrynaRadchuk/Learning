package lessons.lesson8.products.food;

public class CakeProduct extends SuperFoodProduct {
    private int candles;

    public CakeProduct(String name, int id, int expiration, int candles) {
        super(name, id, expiration);
        this.candles = candles;
    }
    public int getCandles () {
        return candles;
    }
    public void setCandles () {
        this.candles = candles;
    }
}
