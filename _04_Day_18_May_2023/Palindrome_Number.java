package _04_Day_18_May_2023;

import java.util.ArrayList;

public class Palindrome_Number {
    public static void main(String[] args) {
        int x = 121;
        Palindrome_Number1 palindrome_Number1 = new Palindrome_Number1();
        Boolean boolean1 = palindrome_Number1.isPalindrome(x);
        System.out.println(boolean1);
    }
}

class Palindrome_Number1 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            while (x > 0) {
                int rem = x % 10;
                list.add(rem);
                x = x / 10;
            }

            int start = 0;
            int end = list.size() - 1;

            while (start < end) {
                if (list.get(start) != list.get(end)) {
                    return false;
                }

                start++;
                end--;
            }
        }

        return true;
    }
}