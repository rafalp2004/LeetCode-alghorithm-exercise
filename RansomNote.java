import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<ransomNote.length(); i++){
            char c =ransomNote.charAt(i) ;
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (int i = 0; i <magazine.length(); i++) {
            char c = magazine.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
            }
        }
        if( map.values().stream().mapToInt(s->s.intValue()).sum()==0){
            return true;
        }

        return false;


    }
}
