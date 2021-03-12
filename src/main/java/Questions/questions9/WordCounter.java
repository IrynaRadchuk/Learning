package Questions.questions9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordCounter {
    static String clearText(String text) {
        return text
                .toLowerCase()
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\n", "")
                .replaceAll("\r", "");
    }
static HashMap <String,Integer> calcWordRepeats (String text) {
HashMap<String,Integer> result = new HashMap<>();
String [] words = text.split(" ");
    for (String word:words
         ) {
        result.put(word, result.getOrDefault(word,0)+1);
    }
    return result;
}
    public static void main(String[] args) throws FileNotFoundException {
        String text = new Scanner(new File("files/questions9/text.txt")).useDelimiter("\\z").next();
        text = clearText(text);
        System.out.println(text);
        HashMap <String,Integer> result = calcWordRepeats(text);
        for (String word:result.keySet()
             ) {
            int count = result.get(word);
            System.out.println(""+count+"\t\t\t\t"+word);
        }
    }
}
