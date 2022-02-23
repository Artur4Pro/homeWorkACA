package company.day16;

import java.util.Locale;

public class Controller {
    /**
     * Task 1
     * A natural number N is given (entered from the keyboard). Calculate two to the power of N
     * Display the calculated value (1 <= N <= 15).
     */
    public int power(int n) {
        if (n < 0 || n > 15) {
            System.out.print("false number ");
            return -1;
        }
        return (int) Math.pow(2, n);
    }

    /**
     * Task 2
     * Given number n. N minutes have passed since the beginning of the day.
     * Determine how many hours and minutes the digital clock will show at this moment.
     * The program should print two numbers: the number of hours (from 0 to 23) and the number of minutes (from 0 to 59).
     * Note that the number n can be more than the number of minutes in a day.
     * <p>
     * Example` 150    2   30
     * 1441   0   1
     */
    public void timeFromStartToN(int n) {
        int hour;
        int min;
        int day;
        if (n > 59) {
            hour = n / 60;
            if (hour > 23) {
                day = hour / 24;
                hour %= 24;
                System.out.print("day " + day + " , ");
            }
            min = n % 60;
            System.out.print("hour " + hour + " , " + "min " + min);
        } else {
            min = n;
            System.out.println(n + "min");
        }
    }

    /** Task 3
     * How many times will the body of the loop be executed?
     * -        for (int i = 2; i <= 15; i ++) - 14 times
     *      {...}
     * -        for (int i = 10; i <= 100; i = i+7) - 13 times
     * {...}
     * -       for (float i = 1.5; i <= 10.3; i = i+0.4) - 23 times
     * {...}
     */

    /**
     * Task 4
     * Write a java program to determine whether the number is prime or not.
     */

    public boolean isPrime(int n) {
        if (n == 1) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i < n / 2; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Task 5
     * You are given two four-digit numbers A and B. Print all four-digit numbers on the segment from A to B, the record of which is a palindrome.
     * Example` 1600                1661
     * 2100                1771
     * 1881
     * 1991
     * 2002
     */

    public void palindromFromAToB(int a, int b) {
        while (a <= b) {
            if ((a / 1000) == (a % 10) && ((a / 100) % 10) == (a / 10) % 10) {
                System.out.println(a);
            }
            a++;
        }
    }

    /**
     * Task 6
     * A three-letter word is given. The word consists only of Latin letters, small and large.
     * Print the same word, where the first letter is capitalized, the rest are small.
     * <p>
     * Example` dog	Dog
     * CAT Cat
     * Lip Lip
     */

    public String firstLetterToUpper(String s) {
        return s.substring(0, 1).toUpperCase(Locale.ROOT) + s.substring(1).toLowerCase(Locale.ROOT);
    }

    /**
     * Task 7
     * .Enter the number N and draw an NxN checkerboard where the top left is white. Designate white margins O, black margins X. Use a for loop.
     * <p>
     * Input ` 3
     * Output`
     * OXO
     * XOX
     * OXO
     * <p>
     * Input` 8
     * <p>
     * OXOXOXOX
     * XOXOXOXO
     * OXOXOXOX
     * XOXOXOXO
     * OXOXOXOX
     * XOXOXOXO
     * OXOXOXOX
     * XOXOXOXO
     */

    public void xo(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(" O ");
                    } else {
                        System.out.print(" X ");
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print(" O ");
                    } else {
                        System.out.print(" X ");
                    }
                }
            }
            System.out.println();
        }
    }

    /**
     * Task 8
     * The first term and the denominator of the geometric progression are given (real numbers b1 and q, q! = 0).
     * An integer n is also given. Print the n-th term of a geometric progression. Don't use the pow function,
     * use a for loop. Print the answer with precision exactly two characters after the period.
     * <p>
     * Example` Input ` 2   2           32.0
     * 5
     * 3.2   1.5          10.80
     * 4
     */

    public double geoProgress(double number, double multipl, int steps) {
        double den = number;
        for (int i = 0; i < steps - 1; i++) {
            den *= multipl;
        }
        return den;
    }

    /**
     * Task 9
     * A natural number> = 2 is specified. Expand it into prime factors.
     * Example` Input` 120            2*2*2*3*5
     */

    public void task9(int num) {
        StringBuilder out = new StringBuilder();
        int n = num;
        int i = 2;
        while (!isPrime(n)) {
            if (n % i == 0 && isPrime(i)) {
                out.append(i).append("*");
                n = n / i;
            } else i++;
        }
        System.out.println(out.toString() + n);
    }
}


