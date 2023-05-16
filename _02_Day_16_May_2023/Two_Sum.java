package _02_Day_16_May_2023;

import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        Two_Sum1 two_Sum1 = new Two_Sum1();
        int[] result = two_Sum1.twoSum(nums, target);
        System.out.println(result[0] + " + " + result[1] + " = " + target);
    }
}

class Two_Sum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> HashMap = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = 0;
        ans[1] = 0;

        for (int i = 0; i < nums.length; i++) {
            int curVal = nums[i];
            if (HashMap.containsKey(target - curVal)) {
                ans[0] = HashMap.get(target - curVal);
                ans[1] = i;
            } else {
                HashMap.put(curVal, i);
            }
        }

        return ans;
    }
}