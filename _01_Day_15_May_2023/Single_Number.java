package _01_Day_15_May_2023;

import java.util.Scanner;

public class Single_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Single_Number1 single_Number1 = new Single_Number1();
        int ans = single_Number1.singleNumber(arr);
        System.out.println(ans);
        sc.close();
    }
}

class Single_Number1 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int x : nums) {
            ans = ans ^ x;
        }

        return ans;
    }
}