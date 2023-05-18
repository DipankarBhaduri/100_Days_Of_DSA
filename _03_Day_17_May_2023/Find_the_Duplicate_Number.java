package _03_Day_17_May_2023;

import java.util.Arrays;

public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };

        Find_the_Duplicate_Number1 find_the_Duplicate_Number1 = new Find_the_Duplicate_Number1();
        int duplicateNumber = find_the_Duplicate_Number1.findDuplicate(nums);
        System.out.println(duplicateNumber);
    }
}

class Find_the_Duplicate_Number1 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int curr = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (curr == nums[i]) {
                ans = curr;
                break;
            } else {
                curr = nums[i];
            }
        }

        return ans;

    }
}