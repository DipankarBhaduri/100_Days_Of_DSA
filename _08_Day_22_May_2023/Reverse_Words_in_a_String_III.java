package _08_Day_22_May_2023;

public class Reverse_Words_in_a_String_III {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        Reverse_Words_in_a_String_III1 reverse_Words_in_a_String_III1 = new Reverse_Words_in_a_String_III1();
        String reverseString = reverse_Words_in_a_String_III1.reverseWords(s);
        System.out.println(reverseString);
    }
}

class Reverse_Words_in_a_String_III1 {
    public String reverseWords(String s) {
        String resultantString = "";
        String currString = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                currString += ch;
            } else {
                String str = helperReverseWord(currString);
                currString = "";
                resultantString += str + " ";
            }
        }

        String str = helperReverseWord(currString);
        currString = "";
        resultantString += str;
        return resultantString;
    }

    public String helperReverseWord(String str) {
        int start = 0;
        int end = str.length() - 1;
        char[] ch = str.toCharArray();

        while (start < end) {
            char ch1 = ch[start];
            char ch2 = ch[end];

            ch[start] = ch2;
            ch[end] = ch1;

            start++;
            end--;
        }

        return new String(ch);
    }
}