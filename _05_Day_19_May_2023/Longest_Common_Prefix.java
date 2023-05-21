package _05_Day_19_May_2023;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String strs[] = { "abab", "aba", "" };
        Longest_Common_Prefix1 longest_Common_Prefix1 = new Longest_Common_Prefix1();
        String response = longest_Common_Prefix1.longestCommonPrefix(strs);
        System.out.println(response);
    }
}

class Longest_Common_Prefix1 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        String currString = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String curr = strs[i];
            int length = Math.min(curr.length(), currString.length());
            if (length == 0) {
                currString = "";
                break;
            }

            for (int j = 0; j < length; j++) {
                if (curr.charAt(j) != currString.charAt(j)) {
                    currString = curr.substring(0, j);
                    break;
                }

                if (j == length - 1) {
                    if (curr.length() < currString.length())
                        currString = curr;
                }
            }
        }

        return currString;
    }
}