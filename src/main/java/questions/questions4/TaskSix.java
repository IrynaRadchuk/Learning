package questions.questions4;

import java.util.Scanner;

public class TaskSix {
    public static String drawRectangle(int l, int h, int t) {
        if (l > 0) {
            return drawRectangle(l - 1, h, t) + "+";
        } else {
            if (h > 1) {
                return drawRectangle(t, h - 1,t) + "\n";
            }
        }
        return "ваш прямогульник: \n";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину ");
        int l = scanner.nextInt();
        System.out.println("введите высоту ");
        int h = scanner.nextInt();

        int t = l;

        System.out.println(drawRectangle(l, h, t));
    }
}