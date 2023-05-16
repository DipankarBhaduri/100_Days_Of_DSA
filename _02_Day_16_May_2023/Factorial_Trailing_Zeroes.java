package _02_Day_16_May_2023;

public class Factorial_Trailing_Zeroes {
    public static void main(String[] args) {
        Factorial_Trailing_Zeroes1 factorial_Trailing_Zeroes1 = new Factorial_Trailing_Zeroes1();
        int countZero = factorial_Trailing_Zeroes1.trailingZeroes(13);
        System.out.println(countZero);
    }
}

class Factorial_Trailing_Zeroes1 {
    public int trailingZeroes(int n) {
        int countZero = 0;
        int fact = 1;
        boolean b = true;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);

        while (fact > 0) {
            int rem = fact % 10;
            if (rem == 0 && b) {
                countZero++;
            } else {
                b = false;
            }

            fact = fact / 10;
        }

        return countZero;
    }
}