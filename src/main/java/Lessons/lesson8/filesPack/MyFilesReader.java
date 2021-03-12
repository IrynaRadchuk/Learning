package Lessons.lesson8.filesPack;

import java.io.*;
import java.util.Scanner;

public class MyFilesReader extends SuperFile{

    public MyFilesReader(String path) {
        super(path);
    }

    public void printFile() {
        try {
            FileReader fileReader = new FileReader(path);

            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String readLines(int countOfStrings) {
        try {
            Scanner scanner = new Scanner(new FileReader(path));
            String result = "";
            for (int i = 0; i < countOfStrings; i++) {
                result += scanner.nextLine() + "\n";
            }
            scanner.close();
            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
