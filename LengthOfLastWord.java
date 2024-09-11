public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] sTab = s.split(" ");
        return sTab[sTab.length-1].length();
    }
}
