package _07_Day_21_May_2023;

import java.util.Arrays;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        Valid_Anagram1 valid_Anagram1 = new Valid_Anagram1();
        System.out.println("Both the strings are anagram : " + valid_Anagram1.isAnagram(s, t));
    }
}

class Valid_Anagram1 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }

        return true;
    }
}
