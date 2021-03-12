package Lessons.lesson8.products.clothes;

import Lessons.lesson8.products.Sale;

public class JeansProduct extends SuperClothingProduct implements Sale {
    public JeansProduct(String name, int id) {
        super(name, id);
    }

    @Override
    public float salePercent() {
        return 0.5f;
    }
}
