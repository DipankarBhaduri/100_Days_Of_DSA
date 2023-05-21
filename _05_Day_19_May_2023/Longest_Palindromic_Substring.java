package _05_Day_19_May_2023;

public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        String string = "bbbb";
        Longest_Palindromic_Substring1 longest_Palindromic_Substring1 = new Longest_Palindromic_Substring1();
        String response = longest_Palindromic_Substring1.longestPalindrome(string);
        System.out.println(response);
    }
}

class Longest_Palindromic_Substring1 {
    public String longestPalindrome(String s) {

        int n = s.length();
        String longestPalindrome = "";
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String ss = s.substring(i, j);
                if (checkPalindrome(ss) && ss.length() > longestPalindrome.length()) {
                    longestPalindrome = s.substring(i, j);
                }
            }
        }

        return longestPalindrome;
    }

    public boolean checkPalindrome(String s) {
        char ch[] = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            if (ch[start] != ch[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}