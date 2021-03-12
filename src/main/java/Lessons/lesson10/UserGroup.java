package Lessons.lesson10;

import java.util.ArrayList;

public class UserGroup {
    public ArrayList<User> users = new ArrayList<User>();
    public String name;

    public int getGroupSize() {
        return users.size();
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "users=" + users +
                ", name='" + name + '\'' +
                '}';
    }
}
