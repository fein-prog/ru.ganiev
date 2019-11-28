package ru.ganiev.task21;

public class ToLeft {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        printMatrix(matrix);
        System.out.println();

        toLeft(matrix);
        printMatrix(matrix);
        System.out.println();

        toLeft(matrix);
        printMatrix(matrix);
        System.out.println();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] matrix2 : matrix) {
            for (int matrix3 : matrix2) {
                System.out.print(matrix3 + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix() {
        int[][] matrix = new int[3][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j + 1;
            }
        }
        return matrix;
    }

    private static void toLeft(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    matrix[i][j] = matrix[i][j + 1];
                }
                matrix[i][matrix[i].length - 1] = 0;
        }
    }
}