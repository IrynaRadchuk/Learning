package Lessons.lesson11;

public class SemaphoreExample {
    public static void main(String[] args) {
        SyncFileWriter syncFileWriter = new SyncFileWriter("files/lesson11/file.txt", true);
        syncFileWriter.write(Thread.currentThread().getName() + "\n");
        syncFileWriter.write(Thread.currentThread().getName() + "\n");
        syncFileWriter.write(Thread.currentThread().getName() + "\n");
        new Thread(() ->syncFileWriter.write(Thread.currentThread().getName() + "\n")).start();
        new Thread(() ->syncFileWriter.write(Thread.currentThread().getName() + "\n")).start();
        new Thread(() ->syncFileWriter.write(Thread.currentThread().getName() + "\n")).start();
    }
}
