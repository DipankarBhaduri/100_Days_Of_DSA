package _10_Day_24_May_2023;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        Intersection_of_Two_Arrays_II1 intersection_of_Two_Arrays_II1 = new Intersection_of_Two_Arrays_II1();
        int[] ans = intersection_of_Two_Arrays_II1.intersect(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

class Intersection_of_Two_Arrays_II1 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) {
                map.put(nums1[i], 1);
            } else {
                int value = map.get(nums1[i]);
                map.put(nums1[i], value + 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                list.add(nums2[i]);
                int value = map.get(nums2[i]);
                if (value == 1) {
                    map.remove(nums2[i]);
                } else {
                    map.put(nums2[i], value - 1);
                }
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;

    }
}