package _12_Day_26_May_2023_Recursion;

public class Removing_vowels {
    public static void main(String[] args) {
        String s = "aabbcceeffuuii";
        Removing_vowels1 removing_vowels1 = new Removing_vowels1();
        String str = removing_vowels1.removeVowels(s);
        System.out.println(str);
    }

}

class Removing_vowels1 {
    public String removeVowels(String s) {
        if (s.length() == 0) {
            return "";
        }

        if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' ||
                s.charAt(0) == '0' || s.charAt(0) == 'u') {
            return removeVowels(s.substring(1));
        } else {
            return s.substring(0, 1) + removeVowels(s.substring(1));
        }
    }
}