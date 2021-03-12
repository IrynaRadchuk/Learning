package Questions.questions10;

import Lessons.lesson8.filesPack.MyFileWriter;
import Lessons.lesson8.filesPack.MyFilesReader;

import java.util.ArrayList;

public class FlowerStore {
    public ArrayList<Flower> flowers = new ArrayList<>();
    private static final String SEPARATOR = ";";

    public String getPricesPath(String filePath) {
        int index = filePath.lastIndexOf("/");
        String firstPart = filePath.substring(0, index + 1);
        String secondPart = filePath.substring(index + 1, filePath.length());
        return firstPart + "prices_" + secondPart;
    }

    public void save(String filePath) {
        String filePricesPath = getPricesPath(filePath);
        MyFileWriter dataWriter = new MyFileWriter(filePath);
        MyFileWriter pricesWriter = new MyFileWriter(filePricesPath);
        String names = "";
        for (Flower flower : flowers
        )
            names += flower.name + SEPARATOR;
        {
        }
        dataWriter.write(names);
        String prices = "";
        for (Flower flower : flowers
        )
            prices += flower.price + SEPARATOR;
        {
        }
        pricesWriter.write(prices);
    }

    public void load(String filePath) {
        String filePricesPath = getPricesPath(filePath);
        MyFilesReader dataReader = new MyFilesReader(filePath);
        MyFilesReader pricesReader = new MyFilesReader(filePricesPath);
        String names = dataReader.readLines(1);
        String prices = pricesReader.readLines(1);
        String [] arrayNames = names.split(SEPARATOR);
        String [] arrayNPrices = prices.split(SEPARATOR);
        flowers.clear();
        for (int i = 0; i < arrayNames.length-1; i++) {
            flowers.add(new Flower(arrayNames[i],Integer.parseInt(arrayNPrices[i])));
        }
    }

    @Override
    public String toString() {
        return "FlowerStore{" +
                "flowers=" + flowers +
                '}';
    }
}

