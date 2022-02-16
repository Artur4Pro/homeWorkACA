package company.day11;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);

    /**
     * Task 1
     * Write a java program to print all even numbers from a given range, from a to b. Input a and b from console.Example`
     * Input ` 2      Output ` 2 4
     */
    public void task1(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Task 2
     * Print all numbers on the segment from a to b that give the remainder of c when divided by d.
     * If such numbers do not exist, then you do not need to display anything.
     * Example ` Input` 2,5    Output` 2   4
     * a      2
     * b      5
     * c      0
     * d      2
     */
    public void task2(int a, int b, int c, int d) {
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Task 3
     * Integers a and b are entered. It is guaranteed that a does not   exceed b.
     * Print all numbers on the segment from a to b that are exact squares. If there are no such numbers, then you do not need to display anything.
     * Example`
     * Input` 2    Output ` 4
     * 8
     */

    public void task3(int a, int b) {
        if (a >= b) {
            System.out.println("a can't be <= b");
        }
        for (int i = a; i <= b; i++) {
            for (int j = 1; j < i; j++) {
                if (j == (double) i / j) {
                    System.out.println(i);
                }
            }

        }

    }

    /**
     * Task 4
     * .Enters 2 integer numbers : x and d from console
     * Count and print one number - how many times the digit d occurs in the representation of a natural number x.
     */

    public int task4(int x, int d) {
        int count = 0;
        for (int i = x; i != 0; i = i / 10) {
            if (i % 10 == d) {
                count++;
            }
        }
        return count;
    }

    /**
     * Task 5
     * Given an integer number x
     * Print the number consisting of the digits of the given number x in reverse order.
     * You do not need to output leading zeros.
     */


    public int task5(int num) {
        int reversed = 0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    /**
     * Task 6
     * Given an integer number x
     * Find the smallest natural divisor of x other than 1 (2 <= x <= 30000).
     * Example`
     * Input`  6   Output` 2
     */

    public void task6(int x) {
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    /**
     * Task 7
     * .Given an integer number x
     * Print all natural divisors of the number x in ascending order (including 1 and the number itself).
     * Example` Input ` 32  Output ` 1 2 4 8 16 32
     */

    public void task7(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Task 8
     * Given an integer x
     * Count the number of natural divisors of x (including 1 and the number itself; x≤2 ∗ 109).
     */

    public int task8(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Task 9
     * Calculate the sum of the given 10 natural numbers.
     * Input integers from console
     */

    public int task9() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter " + i + " number");
            sum += scanner.nextInt();
        }
        return sum;
    }

    /**
     * Task 10
     * Convert a natural number from binary to decimal  (no more than 10 digits in a binary number).
     * Example` Input ` 1001   Output` 9
     * 111     Output` 7
     */

    public void task10(int x) {
        int y = 0;
        int g = 1;
        int z=0;
        for (int i = x; i != 0; i /= 10) {
            z=i%10;
            y=y+z*g;
            g*=2;
        }
        System.out.println(y);
    }

    /**Task 11
     * 11.Enter the number N, followed by N integers.
     *
     * - Count how many zeros, positive numbers, negative numbers
     * among the given N numbers.
     *
     * - It is necessary to print first the number of zeros, then the number
     * of positive and negative numbers.
     */

    public void task11(int n){
        int zero = 0;
        int positive = 0;
        int negative = 0;
        for (int i = 1; i <= n; i++) {
            int x = scanner.nextInt();
            if (x<0){
                negative++;
            }else if (x>0){
                positive++;
            }else {
                zero++;
            }
        }
        System.out.println("zero - "+zero +" , positive - "+positive+" , negative - "+negative);
    }


    /**
     * Task 12
     *
     * @param num
     */

    public void task12(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
                count++;
                if (count == num) {
                    return;
                }
            }
        }
    }

    /**
     * Task 13
     * Write a Java program by using two for loops to produce the output shown below:
     * 1.Input N natural number, print picture like below in size N*N
     */

    public void task13(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Task 14
     * Write a program that prompts the user for the size (a non-negative integer in int);
     * and prints the following checkerboard pattern.
     */

    public void task14(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }

    /**
     * Task 15
     * 15. Write a program that prompts user for the size (a positive integer in int);
     * and prints the multiplication table as shown:
     */

    public void task15(int n) {
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.print(" * | ");
            } else {
                System.out.print(i + "   ");
            }
        }

        System.out.print("\n____________________________________________\n");
        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                System.out.print(" " + i + " |");
            } else {
                System.out.print(i + " |");
            }
            for (int j = 1; j <= n; j++) {
                if (i * j < 10) {
                    System.out.printf("%2d  ", (i * j));
                } else {
                    System.out.printf(" %2d ", (i * j));
                }
            }
            System.out.println();
        }
    }
    /**Task16
     *
     */
}
