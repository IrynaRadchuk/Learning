package lessons.lesson8;

import lessons.lesson8.products.NotSalable;
import lessons.lesson8.products.Sale;
import lessons.lesson8.products.SuperProduct;
import lessons.lesson8.products.clothes.DressProduct;
import lessons.lesson8.products.clothes.JeansProduct;
import lessons.lesson8.products.food.BananaProduct;
import lessons.lesson8.products.food.CakeProduct;

public class Polymorph {
    public static void main(String[] args) {
        SuperProduct[] products = new SuperProduct[]{
                new BananaProduct("fresh banana", 20, 100),
                new CakeProduct("kiev", 7000, 2, 7),
                new DressProduct("black", 122),
                new JeansProduct("blue jeans", 100)
        };
        for (SuperProduct product : products) {
            product.show();
            if (product instanceof CakeProduct) {
                CakeProduct cake1 = (CakeProduct) product;
                cake1.setName("new cake");
                product.show();
                System.out.println("cake has " + cake1.getCandles() + " candles");
            }
            if (product instanceof NotSalable) {
                System.out.println("This product is not for sale - " + product.getName());
            }
            if (product instanceof Sale) {
                Sale sale = (Sale) product;
                System.out.println("Congratulations! Sale! - " + (sale.salePercent()) * 100 + "%");
            }
        }
    }
}
