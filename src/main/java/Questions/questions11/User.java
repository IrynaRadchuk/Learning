package Questions.questions11;

public class User {
    private final String name;
    private final String ip;

    public User(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }

    public User(String name) {
        this (name, "126.0.0.1");
    }

    public String getName() {
        return name;
    }

    public String getIp() {
        return ip;
    }
}
