package Lessons.lesson8.filesPack;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter extends SuperFile {
    private boolean append = false;

    public MyFileWriter(String path) {
        super(path);
        this.append = false;
    }

    public MyFileWriter(String path, boolean append) {
        super(path);
        this.append = append;
    }

    public void write(String text) {
        try {
            FileWriter writer = new FileWriter(path, true);
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
