import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) {
        // Test cases to check if the function isIsomorphic works correctly
        System.out.println(isIsomorphic("paper", "title")); // true, because "paper" and "title" are isomorphic
        System.out.println(isIsomorphic("foo", "bar"));     // false, because "foo" and "bar" are not isomorphic
    }

    /**
     * This method checks if two strings s and t are isomorphic.
     * Two strings are isomorphic if each character in the first string can be
     * replaced to get the second string, with each character mapping uniquely.
     *
     * @param s the first input string
     * @param t the second input string
     * @return true if the strings are isomorphic, false otherwise
     */
    public static boolean isIsomorphic(String s, String t) {
        // If the strings have different lengths, they can't be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Maps to store character mappings from s to t and t to s
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        // Iterate through the characters of both strings
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i); // character from string s
            char tChar = t.charAt(i); // character from string t

            // Check if sChar has already been mapped to a character in t
            if (sToT.containsKey(sChar)) {
                // If it has, and the mapped character does not match tChar, return false
                if (sToT.get(sChar) != tChar) {
                    return false;
                }
            } else {
                // If sChar is not yet mapped, create the mapping to tChar
                sToT.put(sChar, tChar);
            }

            // Check if tChar has already been mapped to a character in s
            if (tToS.containsKey(tChar)) {
                // If it has, and the mapped character does not match sChar, return false
                if (tToS.get(tChar) != sChar) {
                    return false;
                }
            } else {
                // If tChar is not yet mapped, create the mapping to sChar
                tToS.put(tChar, sChar);
            }
        }
        // If all character mappings are valid, return true (the strings are isomorphic)
        return true;
    }
}
