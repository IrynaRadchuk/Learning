package practiceCases;

public class StringCase {
    public static void main(String[] args) {
        String s0 = new String("cat");
        String s1 = new String("Cat");
        String s2 = new String("Cat");
        String s3 = new String(s1);
        String r1 = "Cat";
        String r2 = "Cat";
        String r3 = "cat";
        System.out.println("equals");

        System.out.println(s1.equals(s0));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(s1.equals(r1));
        System.out.println();
        System.out.println("=====");
        System.out.println(s1==s2);
        System.out.println(r1==r2);
        System.out.println(s1==s3);
        System.out.println(s1==r1);
        System.out.println();
        String s5 = s1.concat("asc");
        String s6 = s1.concat("asc");
        System.out.println(s5.equals(s6));
        System.out.println(s5==s6);
    }
}
