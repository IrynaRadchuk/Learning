package Lessons.Lesson2;

public class lesson1 {
    public static void main(String[] args) {
        byte by = 20;
        short sh = 150;
        int i = 10;
        long l = 5850958;
        float fl = 234.9889f;
        float fl2 = 234; //fl =234.0f
        double d1 = 36.877f;
        double d2 = 46.66;
        char ch = '4';
        char c2 = 'r';
        char c3 = 1; //так фуфу писать, будет символ
        System.out.println(c3);
        System.out.println(c2);
        System.out.println(ch);
        boolean bool = true;
        boolean bool2 = false;
        int i3 = 34+355+53+25;
        System.out.println(i3);
        System.out.println (Math.round(4.66));
        int i4 = (int) 4.897f;
        System.out.println(i4);
        float f4 = 100f / 150;
        System.out.println(f4);
        float f5 = 100 / 150;
        System.out.println(f5);
        int i5 = 100 / 150;
        System.out.println(i5);
        int i6 = 10;
        System.out.println(i6);
        i6 = i6 + 5; //так фу
        System.out.println(i6);
        i6 += 7; // так хорошо
        System.out.println(i6);
        int i7 = 2;
        i7 += 4;
        i7 *=5;
        i7 -=1;
        System.out.println(i7);
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("a--   = " +  (a--));
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));
        int i8 = 10;
        i8++;
        System.out.println(i8);
        int i9 = 10;
        System.out.println(i9++);
        int i10 = 10;
        System.out.println(++i10);
        System.out.println(i9);
        int i11 = 10;
        System.out.println("EEE " + i11++ + "JJJ " + i11 +  "HHH " + ++i11);
        int i12 = 100;
        int i13 = i12++;
        System.out.println(i13);
        System.out.println(i13);
        System.out.println(i12);
        System.out.println(i13);
        String st = "1string1";
        st = "2string2";
        System.out.println(st);
        st = "3string3" + "100";
        System.out.println(st);
        st += 20;
        st += "yy";
        System.out.println(st);
        System.out.println("word " + st);
        System.out.println("word " + (st));
        System.out.println("word " + "st");
        boolean b2 = i12 == i13;
        System.out.println(b2);
        boolean tt = true;
        boolean ff = false;
        boolean result = tt && ff;
        System.out.println(result);
        System.out.println("true+false: " + (true && false));
        System.out.println("false+true: " + (false && true));
        System.out.println("true+true: " + (true && true));
        System.out.println("false+false: " + (false && false));
// true if all true
        System.out.println("true+false: " + (true || false));
        System.out.println("false+true: " + (false || true));
        System.out.println("true+true: " + (true || true));
        System.out.println("false+false: " + (false || false));
//true if 1 at least true
        boolean bb = false;
        System.out.println(! bb);
        boolean aa = true;
        System.out.println(! aa);
    }
}
