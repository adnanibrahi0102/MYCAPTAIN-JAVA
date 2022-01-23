package com.captain;

public class Matrixaddmul {
    public static void main(String[] args) {
        int a[][] = {{1, 3, 4}, {2, 3, 4}, {4, 6, 7}};
        int b[][] = {{3, 4, 5}, {4, 9, 6}, {5, 8, 7}};
        int c[][] = new int[3][3];
        System.out.println("FOR ADDITION");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("FOR MULTIPLICATION");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] * b[i][j];
                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }
    }
}