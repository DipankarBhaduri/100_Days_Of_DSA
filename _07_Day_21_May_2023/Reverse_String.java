package _07_Day_21_May_2023;

public class Reverse_String {
    public static void main(String[] args) {
        char[] ch = { 'h', 'e', 'l', 'l', 'o' };
        Reverse_String1 reverse_String1 = new Reverse_String1();
        reverse_String1.reverseString(ch);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
}

class Reverse_String1 {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char ch1 = s[start];
            char ch2 = s[end];

            s[end] = ch1;
            s[start] = ch2;

            start++;
            end--;
        }
    }
}