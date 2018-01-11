package lesson1.src.Ex5;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cor;
        int nrow = in.nextInt();
        int ncol = in.nextInt();
        int[][] matr = new int[nrow][ncol];
        int k = 1;
        int corInt;

        InputMatrix(nrow, ncol, matr, k);
        writeMatrix(nrow, ncol, matr);


        corInt = getMathSqrt(nrow, ncol, matr);
        int fact = getFact(corInt);
        System.out.printf("fact = %d", fact);
    }

    public static void writeMatrix(int nrow, int ncol, int[][] matr) {
        int i;
        int j;
        for (i = 0; i < nrow; i++) {
            for (j = 0; j < ncol; j++) {
                System.out.printf("%3d", matr[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void InputMatrix(int nrow, int ncol, int[][] matr, int k) {
        int i;
        int j;
        for (i = 0; i < nrow; i++) {
            for (j = 0; j < ncol; j++) {
                matr[i][j] = k;
                k++;
            }
        }
    }

    public static int getMathSqrt(int nrow, int ncol, int[][] matr) {
        int sqrtInt;
        int i;
        int j;
        double sqrt;
        sqrtInt = 0;
        for (i = 0; i < nrow; i++) {
            for (j = 0; j < ncol; j++) {
                sqrt = Math.sqrt(matr[i][j]);
                if (sqrt == (int) sqrt) {
                    System.out.printf("cell[%d][%d]  has value %d ,it root is %f \n",
                            i, j, matr[i][j], Math.sqrt(matr[i][j]));
                    sqrtInt = (int) sqrt;
                }
            }
        }
        return sqrtInt;
    }

    public static int getFact(int corInt) {
        int i;
        int fact = 1;
        for (i = 2; i <= corInt; i++) {
            fact *= i;
        }
        return fact;
    }
}
