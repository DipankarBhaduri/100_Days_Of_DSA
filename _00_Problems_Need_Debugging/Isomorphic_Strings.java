package _00_Problems_Need_Debugging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        Isomorphic_Strings1 isomorphic_Strings1 = new Isomorphic_Strings1();
        String s = "egg", t = "add";
        boolean b = isomorphic_Strings1.isIsomorphic(s, t);
        System.out.println(b);
    }
}

class Isomorphic_Strings1 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        HashMap<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }

        int[] arr1 = new int[map.size()];
        int[] arr2 = new int[map1.size()];
        int index1 = 0;
        int index2 = 0;

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            arr1[index1++] = e.getValue();
        }

        for (Map.Entry<Character, Integer> e : map1.entrySet()) {
            arr2[index2++] = e.getValue();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;

    }
}