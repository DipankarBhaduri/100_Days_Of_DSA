package _14_Day_28_May_2023;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9 } };
        Set_Matrix_Zeroes1 set_Matrix_Zeroes1 = new Set_Matrix_Zeroes1();
        set_Matrix_Zeroes1.setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Set_Matrix_Zeroes1 {
    public void setZeroes(int[][] arr) {
        int[] row = new int[arr.length];
        int[] column = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    row[i] = -1;
                    column[j] = -1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (row[i] == -1 || column[j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}