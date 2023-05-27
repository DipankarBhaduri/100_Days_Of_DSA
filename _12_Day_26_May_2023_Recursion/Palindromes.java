package _12_Day_26_May_2023_Recursion;

public class Palindromes {
    public static void main(String[] args) {
        String str = "abcdedcb";
        Palindromes1 palindromes1 = new Palindromes1();
        boolean b = palindromes1.returnPalindrome(str);
        System.out.println(b);
    }
}

class Palindromes1 {
    public boolean returnPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        } else {
            return true && returnPalindrome(s.substring(1, s.length() - 1));
        }
    }
}