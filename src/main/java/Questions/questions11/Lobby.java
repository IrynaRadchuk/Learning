package Questions.questions11;

import java.util.ArrayList;

public class Lobby {

    public static ArrayList<User> generateUsers (int count) {
        ArrayList<User> users = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            users.add(new User(Generator.randomName(), Generator.randomIP()));
        }
        return users;
    }
    private Room room;

    public Lobby(String name) {
        room = new Room(name);
    }

    public void loginAll(ArrayList<User> users) {
        for (User newUser : users
        ) {
            final User tempUser = newUser;
            new Thread(() -> {
                try {
                    room.login(tempUser);
                    Thread.sleep(5000);
                    room.logout(tempUser);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

        }
    }
}
