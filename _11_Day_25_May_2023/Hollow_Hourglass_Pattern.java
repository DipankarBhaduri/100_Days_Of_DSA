package _11_Day_25_May_2023;

import java.util.Scanner;

public class Hollow_Hourglass_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hollow_Hourglass_Pattern1 hollow_Hourglass_Pattern1 = new Hollow_Hourglass_Pattern1();
        hollow_Hourglass_Pattern1.printPattern(n);
        sc.close();
    }
}

class Hollow_Hourglass_Pattern1 {
    public void printPattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                if (i == 0) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (j == 0 + i || j == 2 * n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= 2 * n; j++) {
                if (i == 0) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (j == 0 + i || j == 2 * n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}