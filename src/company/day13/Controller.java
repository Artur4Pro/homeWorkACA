package company.day13;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);

    /**
     * Task 1
     * Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left corner are equal to 1;
     * - the other elements are 0;
     * - print matrix
     */


    public void task1(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
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
    public void task2(int n) {
        int[][] array = new int[n][n];
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
        int[][] matrix = {{1, 2, 3},
                          {2, 5, 4},
                          {3, 4, 1}};


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
}
