package Questions.questions11;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Room {
    private String name;
    private static final int MAX_COUNT_OF_USERS = 12;
    private Semaphore semaphore = new Semaphore(MAX_COUNT_OF_USERS);
    private ArrayList<User> users = new ArrayList<>();

    public void login(User user) throws InterruptedException {
        System.out.println(user.getName() + " " + user.getIp() + " trying to log... \t" + "available slots" + semaphore.availablePermits());
        semaphore.acquire();
        users.add(user);
        System.out.println(user.getName() + " " + user.getIp() + " logged in \t\t" + "available slots" + semaphore.availablePermits());
    }

    public void logout(User user) {
        System.out.println(user.getName() + " " + user.getIp() + " leaving... \t\t" + "available slots" + semaphore.availablePermits());
        users.remove(user);
        System.out.println(user.getName() + " " + user.getIp() + " logged OUT \t\t" + "available slots" + semaphore.availablePermits());
        semaphore.release();
    }

    public Room(String name) {
        this.name = name;
    }
}
