import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abbacca", "dog cat cat dog lion lion dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));

    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> patternMapToS = new HashMap<>();
        char[] charArray = pattern.toCharArray();
        String[] stringArray = s.split(" ");

        if (charArray.length != stringArray.length) {
            return false;
        }

        for (int i = 0; i < charArray.length; i++) {
            if (patternMapToS.containsKey(charArray[i])) {
                if (!patternMapToS.get(charArray[i]).equals(stringArray[i])) {
                    return false;
                }
            } else {
                if (patternMapToS.containsValue(stringArray[i])) {
                    return false;
                }
                patternMapToS.put(charArray[i], stringArray[i]);
            }
        }
        return true;
    }
}
