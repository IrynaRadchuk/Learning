package Questions.questions10;

import com.alibaba.fastjson.JSON;

public class SaveHistory {
    public static void main(String[] args) {
        Product potato = new Product("potato");
        potato.price.priceSet(10.50);
        potato.price.priceSet(11.50);
        potato.price.priceSet(15.00);
        potato.price.priceSet(12.00);
        String json = JSON.toJSONString(potato);
        System.out.println(json);
        Product potatoLoaded = JSON.parseObject(json,Product.class);
        System.out.println(potato);
    }
}
