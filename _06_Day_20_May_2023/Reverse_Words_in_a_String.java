package _06_Day_20_May_2023;

import java.util.Stack;

public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s = "the sky is blue";
        Reverse_Words_in_a_String1 reverse_Words_in_a_String1 = new Reverse_Words_in_a_String1();
        String reverseString = reverse_Words_in_a_String1.reverseWords(s);
        System.out.println(reverseString);
    }
}

class Reverse_Words_in_a_String1 {
    public String reverseWords(String s) {
        Stack<String> stk = new Stack<>();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str += ch;
            } else {
                if (str.length() > 0) {
                    stk.push(str);
                    str = "";
                }
            }
        }

        if (str.length() > 0) {
            stk.push(str);
            str = "";
        }

        String ans = "";
        while (!stk.isEmpty()) {
            ans += stk.peek();
            stk.pop();
            if (!stk.isEmpty()) {
                ans += " ";
            }
        }

        return ans;

    }
}