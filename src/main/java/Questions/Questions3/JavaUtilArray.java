package Questions.Questions3;

import java.util.Arrays;

public class JavaUtilArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 67, 4, 6, 32, 8};
        int[] clone = Arrays.copyOf(array, array.length);
        //int[] array = new int[]{1, 5, 67, 4, 6, 32, 8};
        //int[] clone = new int[array.length];
        //System.arraycopy(array, 0, clone, 0, array.length);
        for (int x : clone) //foreach = for (int i = 0; i < clone.length; i++)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        Arrays.sort(clone);
        for (int x : clone) //foreach = for (int i = 0; i < clone.length; i++)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(clone));
    }
}
