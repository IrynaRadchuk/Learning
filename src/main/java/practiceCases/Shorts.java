package practiceCases;

public class Shorts {
    public String i(int s) {return "111";}
    public String i(long...s) {return "222";}

    public static void main(String[] args) {
        System.out.println(new Shorts().i( 2));
    }
}
