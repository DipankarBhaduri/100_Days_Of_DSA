package _08_Day_22_May_2023;

import java.util.Scanner;

public class HollowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();

        HollowPattern1 HollowPattern1 = new HollowPattern1();
        HollowPattern1.printPattern(column);
    }
}

class HollowPattern1 {
    public void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == n + i || j == n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == i || j == 2 * n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
