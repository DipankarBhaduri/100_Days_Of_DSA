
package _05_Day_19_May_2023;

import java.util.HashMap;

public class Sorting_the_Sentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        Sorting_the_Sentence1 sentence1 = new Sorting_the_Sentence1();
        String sortedSentence = sentence1.sortSentence(s);
        System.out.println(sortedSentence);
    }
}

class Sorting_the_Sentence1 {
    public String sortSentence(String s) {
        HashMap<Integer, String> map = new HashMap<>();
        int maxNumber = 0;
        String currString = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                currString += ch;
            } else {
                int number = currString.charAt(currString.length() - 1) - '0';
                map.put(number, currString.substring(0, currString.length() - 1));
                currString = "";
                maxNumber = number > maxNumber ? number : maxNumber;
            }
        }

        int number = currString.charAt(currString.length() - 1) - '0';
        map.put(number, currString.substring(0, currString.length() - 1));
        currString = "";
        maxNumber = number > maxNumber ? number : maxNumber;
        System.out.println("maxNumber : " + maxNumber);

        for (int i = 1; i <= maxNumber; i++) {
            currString += map.get(i);
            if (i != maxNumber) {
                currString += " ";
            }
        }
        return currString;
    }
}