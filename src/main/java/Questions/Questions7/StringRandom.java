package Questions.Questions7;

public class StringRandom {
    static String randomChar() {
        String result = " ";
        for (int i = 0; i < 10; i++) {
            char c = (char) ('a' + (Math.round(Math.random() * 25)));
            result += c;
        }
        return result;
    }
static String[] strings = new String[] {
        "aaa",
        "bbb",
        "ccc",
        "ddd",
        "eee"
};
    static String randomLine() {
        int index = (int)(Math.round(Math.random()*strings.length));
        return strings[index];
    }

    public static void main(String[] args) {
        System.out.println(randomChar());
        System.out.println(randomChar());
        System.out.println(randomLine());
        System.out.println(randomLine());
    }
}
