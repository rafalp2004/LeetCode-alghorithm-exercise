public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
                sb.append(s.charAt(i));
            }
        }
        s = sb.toString();
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }
        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return true;
            } else return false;
        }

        int firstIndex = 0;
        int lastIndex = s.length() - 1;

        while (s.charAt(firstIndex) == s.charAt(lastIndex)) {

            firstIndex++;
            lastIndex--;

            if (firstIndex >= lastIndex) {
                return true;
            }
        }
        return false;
    }
}
