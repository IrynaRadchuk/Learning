package Lessons.lesson8.products.food;

import Lessons.lesson8.products.NotSalable;

public class ColaProduct extends SuperFoodProduct implements NotSalable {
    public ColaProduct(String name, int id, int expiration) {
        super(name, id, expiration);
    }
}
