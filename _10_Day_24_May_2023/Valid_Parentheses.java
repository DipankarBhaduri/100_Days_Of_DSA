package _10_Day_24_May_2023;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        Valid_Parentheses1 valid_Parentheses1 = new Valid_Parentheses1();
        boolean b = valid_Parentheses1.isValid(s);
        System.out.println(b);
    }
}

class Valid_Parentheses1 {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stk.push(')');
            } else if (ch == '[') {
                stk.push(']');
            } else if (ch == '{') {
                stk.push('}');
            } else {
                if (stk.size() == 0) {
                    return false;
                } else if (stk.peek() != ch) {
                    return false;
                } else {
                    stk.pop();
                }
            }
        }

        if (stk.size() == 0) {
            return true;
        } else {
            return false;
        }

    }
}