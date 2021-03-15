package practiceCases;

public class MethodsOrder {
    static int method() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            try {
                if (i == 1) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("EX!");
                return i;
            } finally {
                System.out.println("Final");
            }
        }
        return 1000;
    }
    public String tt() {
        return "deref";
    }

    public static void main(String[] args) {
        System.out.println("123 "+ new MethodsOrder().tt());
        System.out.println("start");
        System.out.println("method returns = " + method());
        System.out.println("end");
        MethodsOrder f = new MethodsOrder();
        ((((((new MethodsOrder())))))).tt();
    }
}

