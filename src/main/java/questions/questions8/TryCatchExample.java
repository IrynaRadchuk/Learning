package questions.questions8;

public class TryCatchExample {
    public static void main(String[] args) {

        try {
            boolean problem = true;
            if (problem) throw new MyException();
            Integer.parseInt("2134u");
            Object obj = new Object();
            obj = null;
            String str = obj.toString();
            System.out.println(str);
            System.out.println("Done");

        } catch (NullPointerException e) {
            System.out.println("mistake is caught!");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Wrong input! Try only numbers!");
        } catch (MyException e) {
            System.out.println("my ex");
        }
        System.out.println("Shut down");
    }
}
