package company.day13;

import java.util.Random;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public int[][] matrixGen(int n, int m) {
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }
        return matrix;
    }

    public void matrixPrint(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Task 1
     * Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left corner are equal to 1;
     * - the other elements are 0;
     * - print matrix
     */


    public void task1(int n, int m) {
        int[][] array = matrixGen(n, m);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == n - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Task 2
     * .Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left corner are equal to 1;
     * <p>
     * - numbers above this diagonal are equal to 0;
     * - the numbers below this diagonal are equal to 2
     * <p>
     * Input n from console
     */
    public void task2(int n, int m) {
        int[][] array = matrixGen(n, m);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j == n - 1) {
                    array[i][j] = 1;
                } else if (i + j > n - 1) {
                    array[i][j] = 2;
                } else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Task 3
     * Check if the two-dimensional array is symmetrical about the main diagonal.
     * The main diagonal is the one that goes from the upper left corner of the two-dimensional array to the lower right.
     * <p>
     * Example` Input` 3                            Input` 3
     * 0 1 2                                0 0 0
     * 1 5 3                                0 0 0
     * 2 3 4                                1 0 0
     * Output` YES                    Output` NO
     */

    public void task3() {
        int[][] matrix = {{1, 2, 3, 4, 5},
                {2, 5, 8, 5, 7},
                {3, 8, 1, 6, 8},
                {4, 5, 6, 5, 8},
                {5, 7, 8, 8, 0}};

        boolean sim = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == matrix[j][i]) {
                    sim = true;
                } else {
                    sim = false;
                    break;
                }
            }
        }
        if (sim == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    /**
     * Task 4
     * There are n athletes competing in hammer throw. Each of them made m throws.
     * The winner is the athlete who has the maximum result for all throws.
     * If the athletes are renumbered from 0 to n-1, and the attempts of each of them are from 0 to m-1, then the program
     * receives an array A [n] [m], consisting of non-negative integers, as input.
     * The program should determine the maximum amount of numbers in one line and display this amount and the line number for which this amount is reached.
     * Input` The program receives as input two numbers n and m, which are the number of rows and columns in the array.
     * Then in the input stream there are n lines containing m numbers each, which are the elements of the array.
     * <p>
     * Output` The program should display 2 numbers: the amount and the line number for which this amount is reached.
     * If there are several such lines, then the number of the smallest of them is displayed. Do not forget that line numbering (for athletes) starts at 0.
     * <p>
     * Example` Input` 2  2  (n and m)
     * 5  4
     * 3  2
     * Output`     9  0   (max is 9, line is 0)
     */
    public void task4(int n, int m) {
        int matrix[][] = matrixGen(n, m);
        matrixPrint(matrix);
        int sum = 0;
        int indx = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[0][j];
        }
        int sum2 = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum2 += matrix[i][j];
            }
            if (sum < sum2) {
                sum = sum2;
                indx = i;
                sum2 = 0;
            }
        }
        System.out.println("Sum is -> " + sum + " index is-> " + indx);
    }

    /**
     * Task 5
     * There are n athletes competing in hammer throw. Each of them made m throws. The winner of the competition is the
     * athlete who has the best result in all throws. Thus, the program must find the value of the maximum element in
     * the given array, as well as its indices (that is, the number of the athlete and the number of the attempt).
     * <p>
     * Input `
     * The program receives as input two numbers n and m, which are the number of rows and columns in the array.
     * Then in the input stream there are n lines containing m numbers each, which are the elements of the array.
     * Output`
     * The program prints out the value of the maximum element, then the row number and the column number in which
     * it occurs. If there are several maximum elements in the array, then you need to display the minimum line
     * number in which such an element occurs, and if there are several such elements in this line, then you need to
     * display the minimum column number. Remember that all rows and columns are numbered from 0.
     * <p>
     * Example` Input ` 3    3  (n and m)
     * 3   1   2
     * 1   3   4
     * 3   3   3
     * <p>
     * Output` 4
     * 1   2
     */

    public void task5(int n, int m) {
        int matrix[][] = matrixGen(n, m);
        matrixPrint(matrix);
        int max = matrix[0][0];
        int ind1 = 0;
        int ind2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    ind1 = i;
                    ind2 = j;
                }
            }
        }
        System.out.println("Max is -> " + max + " indexes of element are-> " + ind1 + "," + ind2);
    }

    public static int[][] generateSpiral(int n, int m) {
        int[][] array = new int[n][m];

        int k = 0;
        int i = 0, j = 0;
        while (k < n) {
            while (j < m - k - 1) {
                array[i][j] = 1;
                j++;
            }
            while (i < n - k - 1) {
                array[i][j] = 1;
                i++;
            }
            while (j >= 0 + k) {
                array[i][j] = 1;
                j--;
            }
            j = 0 + k;
            k += 2;
            while (i > k) {
                array[i][j] = 1;
                i--;
            }

        }

        return array;
    }


}
