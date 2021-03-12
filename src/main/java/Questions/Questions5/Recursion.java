package Questions.Questions5;

public class Recursion {
    private static void drawTriangle(int x) {
        if (x > 0) {
            drawTriangle(x - 1);
            for (int i = 0; i < x; i++) {
                System.out.print("+"); //не System.out.println!!!
            }
            System.out.println();
        }

    }

    private static String generateTriangle(int x) {
        String result = "";
        if (x > 0) {
            result += generateTriangle(x - 1);
            for (int i = 0; i < x; i++) {
                result += "+";
            }
            result += "\n";

        }
        return result;
    }

    private static String generateTriangle2(int x) {
        String result = "";
        if (x > 0) {

            for (int i = 0; i < x; i++) {
                result += "+";

            }
            result += "\n";
            result += generateTriangle2(x - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        drawTriangle(5);
        System.out.println();
        System.out.println(generateTriangle(3));
        System.out.println(generateTriangle2(4));
        RecursionCircle circle = new RecursionCircle(8);
        circle.draw();
        System.out.println();
        RecursionCircle circle2 = new RecursionCircle(7);
        circle2.draw();
    }

}
