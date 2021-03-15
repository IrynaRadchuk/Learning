package homeworkJavaCourse.homework1;

public class View {
    private String number;
    public static final String ERROR = "Wrong input! Expected: \"%s\"";
    public void start (String number) {
        System.out.println("Enter " + number + " word");
    }
    public void printErrorMessage(String expected){
        System.out.println(String.format(ERROR, expected));
    }
    public void printResultMessage (String result) {
        System.out.println(result);
    }
}
