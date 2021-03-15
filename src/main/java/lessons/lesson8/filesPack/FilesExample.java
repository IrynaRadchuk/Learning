package lessons.lesson8.filesPack;

public class FilesExample {
    public static void main(String[] args) {
MyFilesReader reader = new MyFilesReader("files/lesson8/data1.txt");
reader.printFile();
        System.out.println("\n**************************************");
        System.out.println(reader.readLines(3));
        MyFileWriter writer = new MyFileWriter("files/lesson8/dataNew.txt");
        writer.write("my text\n138719487\n90ldgh$#^");
    }
}
