package homework.homework8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public abstract class FlowerLoader {
    public final String path;
    private static final String SEPARATOR = ";";

    protected FlowerLoader(String path) {
        this.path = path;
    }

    public static Flowers[] load(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int count = Integer.parseInt(bufferedReader.readLine());
            Flowers[] bouquet = new Flowers[count];
            int rosesCount = 0;
            int tulipsCount = 0;
            int camomilesCount = 0;
            String line = bufferedReader.readLine();
            String[] data = line.split(SEPARATOR);
            for (int i = 0; i < bouquet.length; i++) {
                if (data[i].equals(Roses.class.getSimpleName())) {
                    rosesCount++;
                    bouquet[i] = new Roses(rosesCount);
                }
                if (data[i].equals(Tulips.class.getSimpleName())) {
                    tulipsCount++;
                    bouquet[i] = new Tulips(tulipsCount);
                }
                if (data[i].equals(Camomiles.class.getSimpleName())) {
                    camomilesCount++;
                    bouquet[i] = new Camomiles(camomilesCount);
                }
            }
            return bouquet;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void printFlowers(Flowers[] bouquet) {
        for (Flowers flower : bouquet) {
            System.out.println(flower.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        Flowers [] bouquet = load("files/homework/flowers.txt");
        if (bouquet != null) {
            printFlowers(bouquet);
        }
    }
}
