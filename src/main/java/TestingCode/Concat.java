package TestingCode;

public class Concat {
    public static void main(String[] args) {

        String s = new String("!23");
        String f = new String(s);
        String g = s;
        s.concat("fwgfwgwgggggggggggggggggggg");
        String t = s.concat("wtt");
        System.out.println(s);
        System.out.println(t);
        char [] ch = {'!','2','3'};
        System.out.println(ch);
        System.out.println(ch.equals(s));
        System.out.println(g==s);
        System.out.println(f==s);
        System.out.println(g.equals(s));
        System.out.println(f.equals(s));
        System.out.println(f.equals(g));
        int d = 1;
        System.out.println((char)d);
        int z = '1';
        System.out.println((char)z);
        System.out.println(z);
        char t1 = '1';
        char t2 = '\u0031';
        char t3 = 49;
        int t4 = t2;
        int t5 = t1;
        int t6 = t3;
        System.out.println("***************************");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t1+t2+t3);
        System.out.println("***************************");
    }
}
