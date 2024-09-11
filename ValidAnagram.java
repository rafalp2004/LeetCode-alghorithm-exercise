import java.util.*;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
//  SLOWER SOLUTION
//        Map<Character, Integer> sMap = new HashMap<>();
//        Map<Character, Integer> tMap = new HashMap<>();
//
//        for(int i=0; i<s.length(); i++){
//            char sChar = s.charAt(i);
//            char tChar = t.charAt(i);
//            sMap.put(sChar, sMap.getOrDefault(sChar, 0)+1);
//            tMap.put(tChar, tMap.getOrDefault(tChar, 0)+1);
//
//
//        }
//        if(sMap.equals(tMap)){
//            return true;
//        }
//        else return false;
//        ArrayList<Character> sList = new ArrayList<>(s.chars()
//                .mapToObj(c->(char) c)
//                .toList());
//        ArrayList<Character> tList = new ArrayList<>(t.chars()
//                .mapToObj(c->(char) c)
//                .toList());
//
//   FASTER SOLUTION:
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);


        if(Arrays.equals(sChars, tChars)){
            return true;
        }
        return false;

    }
}
