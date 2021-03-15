package lessons.lesson4;

public class Methods {
    public static void main(String[] args) {
        hello(10, 25, "text"); //тут назыв параметры
        hello(4,12,"hu");
        int x = 55;
        int y = 66;
        String str = "ssssss";
        hello(x, y, str);
    }


    public static void hello(int x, int y, String str) { //тут назыв аргументы
        x= x+1;
        y=y/2;
        str = "Q" + str;
        System.out.println("hello" + " " + x + " " + y + " " + str);
    }
}
