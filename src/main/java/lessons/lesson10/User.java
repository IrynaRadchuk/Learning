package lessons.lesson10;

import java.util.Objects;

public class User {
    public String name;
    public Gender gender;
    public int age;


    public User(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return name.equals(user.name) &&
                gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }
}
