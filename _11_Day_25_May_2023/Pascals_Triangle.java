package _11_Day_25_May_2023;

import java.util.Scanner;

public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pascals_Triangle1 pascals_Triangle1 = new Pascals_Triangle1();
        pascals_Triangle1.printPattern(n);
        sc.close();
    }
}

class Pascals_Triangle1 {
    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("1");
                } else if (j % 2 != 0) {
                    System.out.print(i - 1);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
