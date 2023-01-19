package Stack.MatchingParentheses;

import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s1 = "(<[ ]>)";
        String s2 = "[<incre>ment]";
        String s3 = "<increment>";
        String s4 = "()incre<>ment<>[]";

        String s5 = "<increment(";
        String s6 = "[)incr]ement(";
        String s7 = "<i(ncr>e)ment";
        String s8 = "(<increment>";

        // first solution
//        System.out.println(matches(s1));
//        System.out.println(matches(s2));
//        System.out.println(matches(s3));
//        System.out.println(matches(s4));
//        System.out.println(matches(s5));

        // second solution : the right one
        System.out.println(matchingParentheses(s1));
        System.out.println(matchingParentheses(s2));
        System.out.println(matchingParentheses(s3));
        System.out.println(matchingParentheses(s4));
        System.out.println(matchingParentheses(s5));
        System.out.println(matchingParentheses(s6));
        System.out.println(matchingParentheses(s7));
        System.out.println(matchingParentheses(s8));

    }

    public static boolean matches(String str) {
        if (str.contains("(") && str.contains(")") ||
                str.contains("<") && str.contains(">") ||
                str.contains("{") && str.contains("}")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean matchingParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> blockedSymbols = Map.of(')', '(', ']', '[', '>', '<');

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (blockedSymbols.containsValue(current)) {
                stack.push(current);
                continue;
            }
            if (blockedSymbols.containsKey(current) && (stack.isEmpty() || blockedSymbols.get(current) != stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
