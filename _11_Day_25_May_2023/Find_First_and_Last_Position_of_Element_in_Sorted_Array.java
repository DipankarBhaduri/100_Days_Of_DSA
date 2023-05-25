package _11_Day_25_May_2023;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        Find_First_and_Last_Position_of_Element_in_Sorted_Array1 find_First_and_Last_Position_of_Element_in_Sorted_Array1 = new Find_First_and_Last_Position_of_Element_in_Sorted_Array1();
        int[] ans = find_First_and_Last_Position_of_Element_in_Sorted_Array1.searchRange(nums, target);
        System.out.println(ans[0] + " <----> " + ans[1]);
    }
}

class Find_First_and_Last_Position_of_Element_in_Sorted_Array1 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = { -1, -1 };
        int lo = 0, hi = nums.length - 1;

        while (nums[lo] < nums[hi]) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) {
                hi = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                if (nums[lo] == nums[mid]) {
                    hi--;
                } else {
                    lo++;
                }
            }
        }
        if (nums[lo] == nums[hi] && nums[lo] == target) {
            res[0] = lo;
            res[1] = hi;
        }

        return res;
    }
}