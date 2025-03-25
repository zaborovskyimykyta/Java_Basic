package edu.ntudp.pzks.LR_2;

import java.util.Scanner;
import java.util.Random;

public class Basics {
    private static final int MAX_SIZE = 20;
    private static final int RANDOM_MIN = -100;
    private static final int RANDOM_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix width (max 20): ");
        int width = scanner.nextInt();
        System.out.print("Enter matrix height (max 20): ");
        int height = scanner.nextInt();

        if (width > MAX_SIZE || height > MAX_SIZE || width <= 0 || height <= 0) {
            System.out.println("Invalid matrix size.");
            return;
        }

        int[][] matrix = new int[height][width];
        System.out.print("Do you want to fill the matrix manually? (yes/no): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("yes")) {
            fillMatrixManually(matrix, scanner);
        } else {
            fillMatrixRandomly(matrix);
        }

        printMatrix(matrix);
        System.out.println("Min element: " + findMin(matrix));
        System.out.println("Max element: " + findMax(matrix));
        System.out.println("Arithmetic mean: " + calculateArithmeticMean(matrix));
        System.out.println("Geometric mean: " + calculateGeometricMean(matrix));
    }

    // Fill matrix manually
    private static void fillMatrixManually(int[][] matrix, Scanner scanner) {
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Fill matrix with random values
    private static void fillMatrixRandomly(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RANDOM_MIN + random.nextInt(RANDOM_MAX - RANDOM_MIN + 1);
            }
        }
    }

    // Print the matrix
    private static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " \t");
            }
            System.out.println();
        }
    }

    // Find minimum element
    private static int findMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }
        return min;
    }

    // Find maximum element
    private static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    // Calculate arithmetic mean
    private static double calculateArithmeticMean(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
                count++;
            }
        }
        return (double) sum / count;
    }

    // Calculate geometric mean
    private static double calculateGeometricMean(int[][] matrix) {
        double product = 1.0;
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                product *= Math.abs(num) > 0 ? Math.abs(num) : 1; // Avoid zero values
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }
}

