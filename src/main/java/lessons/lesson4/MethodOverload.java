package lessons.lesson4;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1, 5, 6, 7));
        System.out.println(sum(4, 6, 7));
        System.out.println(sum(1, 2));
        System.out.println(sum(new int[]{1, 3, 4, 5, 6, 6, 8, 68, 8}));
        System.out.println(sum("1", "2"));
    }

    static int sum(int a, int b, int c, int d) { //исходный метод
        return a + b * 2 + c + d;
    }

    static int sum(int a, int b, int c) { //оверлоады
        //return a + b + c;
        return sum(a, b, c, 0);
    }

    static int sum(int a, int b) { //оверлоады
        //return a + b + c;
        return sum(a, b, 0);
    }

    static int sum(int[] array) { //оверлоады
        int result = 0;
        for (int value : array) {
            result += value;
        }
        return result;
    }

    static String sum(String a, String b) { // а это уже не оверлоад называется, а уже новый метод с таким же названием
        return a + b;
    }
}
