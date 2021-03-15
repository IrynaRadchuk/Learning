package lessons.lesson10;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JSONExample {
    static void simpleExample() {
        User user = new User("Pete", Gender.male, 12);
        String json = JSON.toJSONString(user);
        System.out.println("Simple");
        System.out.println(json);
        System.out.println();
    }

    static void groupExample() {
        System.out.println();
        System.out.println("Group");
        System.out.println();
        UserGroup group = new UserGroup();
        group.name = "Class A";
        group.users.add(new User("Pete", Gender.male, 12));
        group.users.add(new User("Ted", Gender.male, 15));
        group.users.add(new User("Mary", Gender.female, 11));
        group.users.add(new User("Alex", Gender.unknown, 13));
        String json = JSON.toJSONString(group);
        System.out.println(json);
    }

    static void userReadExample() throws FileNotFoundException {
        System.out.println();
        System.out.println("Reader");
        System.out.println();
        String json = new Scanner(new File("files/lesson10/user.json")).useDelimiter("\\Z").next();
        User user = JSON.parseObject(json, User.class);
        System.out.println(json);
        System.out.println(user);
    }
static void groupReadExample () throws FileNotFoundException {
    System.out.println();
    System.out.println("Group Reader");
    System.out.println();
    String json = new Scanner(new File("files/lesson10/group.json")).useDelimiter("\\Z").next();
    UserGroup group = JSON.parseObject(json, UserGroup.class);
    System.out.println(json);
    System.out.println(group);
}
    public static void main(String[] args) throws FileNotFoundException {
        simpleExample();
        groupExample();
        userReadExample();
        groupReadExample();
    }
}
