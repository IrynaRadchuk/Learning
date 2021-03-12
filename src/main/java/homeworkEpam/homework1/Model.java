package homeworkEpam.homework1;

public class Model {
    private String result;
    public String returnResult (String firstWord,String secondWord){
        result = firstWord + ", " + secondWord;
        return result;
    }
}
