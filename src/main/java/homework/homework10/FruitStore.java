package homework.homework10;

import com.alibaba.fastjson.JSON;

import java.io.FileWriter;
import java.io.IOException;


public class FruitStore {
    public Fruits fruitsOnStore = new Fruits();

    public void addFruits(String pathToJsonFile) {

        fruitsOnStore = JSON.parseObject(pathToJsonFile, fruitsOnStore.getClass());
    }
    public Fruits getFruitsOnStore() {
        return fruitsOnStore;
    }

    public void save(String pathToJsonFile) throws IOException {
        fruitsOnStore.fruits.add(new Fruit(FruitType.plum, 10, "10/12/2020", 2));
        fruitsOnStore.fruits.add(new Fruit(FruitType.pear, 12, "11/12/2020", 6));
        fruitsOnStore.fruits.add(new Fruit(FruitType.apple, 7, "10/12/2020", 72));
        String json = JSON.toJSONString(fruitsOnStore);
        System.out.println(json);
        FileWriter writer = new FileWriter(pathToJsonFile);
        writer.write(json);
        writer.flush();
        writer.close();
    }
}
