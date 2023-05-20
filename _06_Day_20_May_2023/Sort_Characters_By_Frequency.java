package _06_Day_20_May_2023;

import java.util.HashMap;
import java.util.Map;

public class Sort_Characters_By_Frequency {
    public static void main(String[] args) {
        String s = "tree";
        Sort_Characters_By_Frequency1 sort_Characters_By_Frequency1 = new Sort_Characters_By_Frequency1();
        String response = sort_Characters_By_Frequency1.frequencySort(s);
        System.out.println(response);
    }
}

class Sort_Characters_By_Frequency1 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int max = 0;
        char maxChar = ' ';
        String result = "";

        while (map.size() > 0) {
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() > max) {
                    max = e.getValue();
                    maxChar = e.getKey();
                }
            }

            while (max > 0) {
                result += maxChar;
                max--;
            }

            map.remove(maxChar);
        }
        return result;

    }
}