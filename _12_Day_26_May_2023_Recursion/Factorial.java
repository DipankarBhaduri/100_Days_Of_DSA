package _12_Day_26_May_2023_Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        Factorial1 factorial1 = new Factorial1();
        int ans = factorial1.returnFactorial(n);
        System.out.println(ans);
    }
}

class Factorial1 {
    public int returnFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * returnFactorial(n - 1);
    }
}