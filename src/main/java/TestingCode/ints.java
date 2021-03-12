package TestingCode;

public class ints {
    public static void main(String[] args) {
        int x = 1;
        Integer t = 1;
        int[] o = {1};
        h(x,t,o);
        System.out.println("" + x +""+ t +""+ o[0]);
    }
         static void h (int x, Integer t, int[]o){
             x++;
             t++;
             o[0]++;
        }
    }
