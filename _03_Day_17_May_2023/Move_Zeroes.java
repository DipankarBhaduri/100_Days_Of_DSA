package _03_Day_17_May_2023;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };

        Move_Zeroes1 move_Zeroes1 = new Move_Zeroes1();
        move_Zeroes1.moveZeroes(nums);
        for (int val : nums) {
            System.out.print(val + " ");
        }
    }
}

class Move_Zeroes1 {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}