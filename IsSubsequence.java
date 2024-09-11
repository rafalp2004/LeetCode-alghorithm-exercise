public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int n= s.length();
        int m= t.length();
        int index =0;
        for (int i = 0; i < m; i++) {
            if(index==n){
                return true;
            }
            if(t.charAt(i)==s.charAt(index)){
                index++;
            }

        }
        return index==n;
    }
}
