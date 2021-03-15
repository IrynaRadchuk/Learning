package questions.questions11;

import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class ThreadExample {
    public static void download(String loadFrom, String saveTo) {

        new Thread(() -> {
            try {
                URL website = new URL(loadFrom);
                ReadableByteChannel rbc = Channels.newChannel(website.openStream());
                FileOutputStream fos = new FileOutputStream(saveTo);
                fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void main(String[] args) throws InterruptedException {
        download("", "");
        download("", "");
        download("", "");
        Calendar calendar = new GregorianCalendar();
        while (true) {
            Thread.sleep(1000);
            calendar = new GregorianCalendar();
            System.out.println("" + calendar.get(Calendar.MINUTE) + "" + calendar.get(Calendar.SECOND));
        }
    }
}
