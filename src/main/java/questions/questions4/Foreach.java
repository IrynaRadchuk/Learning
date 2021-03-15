package questions.questions4;

public class Foreach {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 3, 3, 1, 0, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * 2 + " ");
        }
        for (int x : array) {
            System.out.println(x * 2 + " ");
        }
    }
}
