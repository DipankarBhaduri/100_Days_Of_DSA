package _04_Day_18_May_2023;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        Remove_Duplicates_from_Sorted_Array1 remove_Duplicates_from_Sorted_Array1 = new Remove_Duplicates_from_Sorted_Array1();
        int index = remove_Duplicates_from_Sorted_Array1.removeDuplicates(nums);
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Remove_Duplicates_from_Sorted_Array1 {
    public int removeDuplicates(int[] nums) {
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {

            } else {
                index++;
                nums[index] = nums[i];
            }
        }

        return ++index;
    }
}