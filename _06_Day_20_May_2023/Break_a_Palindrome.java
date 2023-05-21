package _06_Day_20_May_2023;

public class Break_a_Palindrome {
    public static void main(String[] args) {
        String str = "abccba";
        Break_a_Palindrome1 break_a_Palindrome1 = new Break_a_Palindrome1();
        String newNonPalindrome = break_a_Palindrome1.breakPalindrome(str);
        System.out.println(newNonPalindrome);
    }
}

class Break_a_Palindrome1 {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1) {
            return "";
        }

        char ch[] = palindrome.toCharArray();

        for (int i = 0; i < ch.length / 2; i++) {
            if (ch[i] != 'a') {
                ch[i] = 'a';
                return new String(ch);
            }
        }

        ch[ch.length - 1] = 'b';
        return new String(ch);
    }
}