package homeworkJavaCourse.homework1;

import java.util.Scanner;

public class Controller {
    private Scanner sc = new Scanner(System.in);
    private Model model = new Model();
    private View view = new View();
    private String firstCheck = "Hello";
    private String secondCheck = "World";

    public String writeHello(String expected, String requestNumber) {
        String word;
        do {
            view.start(requestNumber);
            word = sc.nextLine();
            if (!word.equals(expected)) {
                view.printErrorMessage(expected);
            }
        }
        while (!word.equals(expected));
        return word;
    }

    public String result() {
        return model.returnResult(writeHello(firstCheck,"first" ), writeHello(secondCheck,"second" ));
    }
    public void printResult () {
        view.printResultMessage(result());
    }

}
