import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()")); //true
        System.out.println(isValid("()[]{}")); //true
        System.out.println(isValid(")[")); //false
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(']', '[');
        brackets.put('}', '{');
        brackets.put(')', '(');


        char[] chars = s.toCharArray();
        if (chars.length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (brackets.containsValue(chars[i])) {
                stack.push(chars[i]);
            }
            if (brackets.containsKey(chars[i])) {
                if (!stack.isEmpty()) {
                    if (stack.peek() == brackets.get(chars[i])) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else return false;
            }

        }
        return stack.isEmpty();
    }
}