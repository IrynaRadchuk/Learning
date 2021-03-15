package questions.questions11;

import java.util.HashSet;
import java.util.Set;

public class Generator {
    final static String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
    final static String numbers = "1234567890";

    final static java.util.Random rand = new java.util.Random();

    // consider using a Map<String,Boolean> to say whether the identifier is being used or not
    final static Set<String> identifiers = new HashSet<String>();
    public static String randomIP() {
        return randomIdentifier (numbers,1,2) + "." +
        randomIdentifier (numbers,1,2) + "." +
        randomIdentifier (numbers,1,2) + "." +
        randomIdentifier (numbers,1,2);
    }
    public static String randomName() {
return randomIdentifier(lexicon,5,10);
    }
    public static String randomIdentifier(String str, int min, int max) {
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = rand.nextInt(max-min)+min;
            for(int i = 0; i <= length; i++) {
                builder.append(str.charAt(rand.nextInt(str.length())));
            }
        }
        return builder.toString();
    }
}
