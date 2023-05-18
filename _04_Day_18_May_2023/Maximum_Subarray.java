package _04_Day_18_May_2023;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        Maximum_Subarray1 maximum_Subarray1 = new Maximum_Subarray1();
        int maxSum = maximum_Subarray1.maxSubArray(nums);
        System.out.println(maxSum);
    }
}

class Maximum_Subarray1 {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = currSum > maxSum ? currSum : maxSum;

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}