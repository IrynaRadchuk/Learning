package lessons.lesson4;

public class Methods2 {
    public static void main(String[] args) {
        hello(10, 25, "text");
        int calculator = sum(3, 6, 7);
        System.out.println(calculator);
        System.out.println(drawing(5, 3,'+'));
        System.out.println(drawing(2, 4,'0'));
    }

    public static void hello(int x, int y, String str) { //тут назыв аргументы
        System.out.println("hello" + " " + x + " " + y + " " + str);
    }

    static int sum(int a, int b, int c) {
        //int calc = a + b + c;
        // return calc;
        return a + b + c;
    }
    static String drawing (int height, int width, char c) {
        String result = "";
        for (int i = 0; i < height; i++) {
            String line = "";
            for (int j = 0; j < width; j++) {
                line += c;
            }
            result += line + "\n";
        }
        return result;
    }
}

