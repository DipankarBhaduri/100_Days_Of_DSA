package _07_Day_21_May_2023;

import java.util.Stack;

public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s = "the sky is blue";
        Reverse_Words_in_a_String2 reverse_Words_in_a_String2 = new Reverse_Words_in_a_String2();
        String reverseString = reverse_Words_in_a_String2.reverseWords(s);
        System.out.println(reverseString);
    }
}

class Reverse_Words_in_a_String2 {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String currentString = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                currentString += ch;
            } else {
                if (currentString.length() > 0) {
                    stack.push(currentString);
                    currentString = "";
                }
            }
        }

        if (currentString.length() > 0) {
            stack.push(currentString);
            currentString = "";
        }

        while (!stack.isEmpty()) {
            currentString += stack.pop();
            if (!stack.isEmpty()) {
                currentString += " ";
            }
        }

        return currentString;
    }
}