package _03_Day_17_May_2023;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        Search_in_Rotated_Sorted_Array1 search_in_Rotated_Sorted_Array1 = new Search_in_Rotated_Sorted_Array1();
        int index = search_in_Rotated_Sorted_Array1.search(nums, target);
        if (index != -1)
            System.out.println("The target : " + target + " found at index : " + index);
        else {
            System.out.println("The target : " + target + " not found in this array!");
        }
    }
}

class Search_in_Rotated_Sorted_Array1 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            if (nums[mid] <= nums[end]) {
                if (nums[mid] <= target && nums[end] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}