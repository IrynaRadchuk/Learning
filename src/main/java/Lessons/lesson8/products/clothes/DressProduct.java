package Lessons.lesson8.products.clothes;

import Lessons.lesson8.products.NotSalable;

public class DressProduct extends SuperClothingProduct implements NotSalable {
    public DressProduct(String name, int id) {
        super(name, id);
    }
}
