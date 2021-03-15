package questions.questions11;

public class SemaphoreExample {
    public static void main(String[] args) {
        Lobby lobby = new Lobby("Lobby1");
        lobby.loginAll(Lobby.generateUsers(20));
    }
}
