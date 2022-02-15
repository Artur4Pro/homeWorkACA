package company.day10;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);

    /**
     * Task 1
     * Print all integer numbers from 1 to 10.
     */
    public void task1() {
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " , ");
            ++num;
        }
    }

    /**
     * Task 2
     * Print all even integer numbers from 1 to 20
     */
    public void task2() {
        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.print(num + " , ");
                num += 2;
            } else {
                ++num;
            }
        }
    }

    /**
     * Task 3
     * Print all exact squares of natural numbers that are not exceeding a given positive integer N. Input N from console.
     */
    public void task3(int a) {
        int num = 1;
        while (num * num <= a ) {
            System.out.print(num * num + " , ");
            ++num;
        }
    }

    /**
     * Task 4
     * Given an integer number, greater than 2.
     * Find and print the smallest natural divisor other than 1 for a given number.Input number from console
     */
    public int task4(int x) {
        int z = 2;
        while (x % z != 0) {
            ++z;
            System.out.println(z);
        }
        return z;
    }

    /**
     * Task 5
     * Print all integer powers of two not exceeding N in ascending order.Input N from console.
     * Example ` Input 50(You can not use Math.pow())
     */
    public void task5(int n) {
        int m = 1;
        while (m <= n) {
            System.out.print(m  + " ");
            m <<= 1;
        }
    }

    /**
     * Task 6
     * For a given integer number N,print all integers in descending order.
     */
    public void task6(int n) {
        int m = n;
        while (m >= 0) {
            System.out.print(m + " ");
            m--;
        }
    }

    /**
     * Task 7
     * For a given integer number N,print all integers that are multiple of 2 in descending order.
     */
    public void task7(int n) {
        int m = n;
        if (m % 2 != 0) {
            m--;
        }
        while (m >= 2) {
            System.out.print(m + " ");
            m -= 2;
        }
    }

    /**
     * Task 8
     * Input N natural number till N would be the exact power of 2.If N is the exact power of 2 .
     * Print N
     * Print count of input integers
     * break loop
     */

    public boolean squareOf2(int a) {
        int num = a;
        while (num % 2 == 0 && num >= 1) {
            num /= 2;
        }
        return num == 1;
    }

    public void task8() {
        int count = 0;
        while (true) {
            int z = scanner.nextInt();
            count++;
            if (squareOf2(z)) {
                System.out.print(z + " ");
                break;
            }
        }
        System.out.println(count);
    }

    /**
     * Task 9
     * For a given natural N print the smallest integer k that`
     * Math.pow(2,k)≥N.(You can not use Math.pow())
     */
    public int task9(int n) {
        int num = 1;
        int k = 0;
        while (num < n) {
            num *= 2;
            k++;
        }
        return k;
    }

    /**
     * Task 10
     * 10.Write Java program to print the table of characters that are equivalent to the Ascii codes from 32 to 122.
     * Print 10 characters at each line.
     */

    public void task10() {
        int start = 32;
        int end = 122;

        while (start <= end) {
            char ch = (char) start;
            System.out.print(ch + " ");
            start++;
            if (start % 10 == 2) {
                System.out.print("\n");
            }

        }
    }

    /**
     * Task 11
     * Print all integer numbers from 1 to N, except that are multiple of 3(Input N from console)
     */
    public void task11(int n) {
        int m = 0;
        while (m <= n) {
            if (m % 3 == 0) {
                m++;
                continue;
            } else {
                System.out.println(m);
                m++;
            }

        }
    }

    /**
     * Task 12
     * Given integer number A > 1,define what is the Fibonacci number is A, i.e  print such number n that  φn=A.
     * If A is not a Fibonacci number print -1. Example
     */

    public int task12(int a) {
        int firstNum = 0;
        int secondNum = 1;
        int n = 3;
        while (!(firstNum + secondNum > a)) {
            if (firstNum + secondNum == a) {
                return n;
            }
            int temp = secondNum;
            secondNum += firstNum;
            firstNum = temp;
            n++;
        }
        return -1;
    }
}
