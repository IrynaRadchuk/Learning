package Homework.homework8;

import java.io.FileWriter;
import java.io.IOException;

public abstract class FlowersSaver {
    public final String path;
    private static final String SEPARATOR = ";";

    public FlowersSaver(String path) {
        this.path = path;
    }

    public static void save(String path, Flowers[] bouquet) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write("" + bouquet.length + "\n");
            for (Flowers flowers:bouquet) {
                writer.write(flowers.getClass().getSimpleName()+SEPARATOR);
            }
            writer.flush();
            writer.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    ;

    public static void main(String[] args) {
        FlowerStore bouquet = new FlowerStore();
        save("files/homework/flowers.txt", bouquet.sell(3, 7, 8));
    }
}
