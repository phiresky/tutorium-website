package test;

import java.io.IOException;
import java.util.Arrays;

public class MatrixUtil {
    static double average(String line) {
        int sum = 0;
        String[] split = line.split(",");
        for (int i = 0; i < split.length; i++) {
            sum += Integer.parseInt(split[i]);
        }
        double avg = ((double) sum) / split.length;
        return avg;
    }

    static int[][] add(int[][] a, int[][] b) {
        int width = a.length;
        int height = a[0].length;
        int[][] c = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int size = a.length;
        int[][] c = new int[size][size];
        Integer.parseInt("5");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    static void printMatrix(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.println(Arrays.toString(c[i]));
        }
    }

    public static void main(String[] args) throws IOException {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] b = { { -1, -2, -3 }, { 0, 0, 0 }, { 0, 0, 0 } };

        System.out.println("a =");
        printMatrix(a);
        System.out.println("b =");
        printMatrix(b);
        System.out.println("a + b =");
        printMatrix(add(a, b));

        System.out.println("a*b =");
        printMatrix(multiply(a, b));
    }
}
