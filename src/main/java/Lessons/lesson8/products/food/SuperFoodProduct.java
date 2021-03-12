package Lessons.lesson8.products.food;

import Lessons.lesson8.products.SuperProduct;

public class SuperFoodProduct extends SuperProduct {
    private int expiration;

    public SuperFoodProduct(String name, int id, int expiration) {
        super(name, id);
        this.expiration = expiration;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("expire after " + expiration + " days");
    }
}
