package lessons.lesson8.products.clothes;

import lessons.lesson8.products.NotSalable;

public class DressProduct extends SuperClothingProduct implements NotSalable {
    public DressProduct(String name, int id) {
        super(name, id);
    }
}
