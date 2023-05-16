package _02_Day_16_May_2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        Find_All_Duplicates_in_an_Array1 find_All_Duplicates_in_an_Array1 = new Find_All_Duplicates_in_an_Array1();
        List<Integer> listOfInteger = find_All_Duplicates_in_an_Array1.findDuplicates(nums);
        for (int val : listOfInteger) {
            System.out.println(val + " ");
        }
    }
}

class Find_All_Duplicates_in_an_Array1 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> lists = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            if (map.containsKey(val)) {
                int fre = map.get(val);
                map.put(val, fre + 1);
                if (map.get(val) == 2) {
                    lists.add(val);
                }
            } else {
                map.put(val, 1);
            }
        }

        // for (Entry<Integer, Integer> e : map.entrySet()) {
        // if (e.getValue() > 1) {
        // lists.add(e.getKey());
        // }
        // }

        return lists;
    }
}