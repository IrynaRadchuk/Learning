package lessons.lesson8.products.food;

import lessons.lesson8.products.NotSalable;

public class BananaProduct extends SuperFoodProduct implements NotSalable {
    public BananaProduct(String name, int id, int expiration) {
        super(name, id, expiration);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("mmm...banana");
    }
}
