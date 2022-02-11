package company.day8;

import java.util.Random;

public class Controller {

    /**
     * Task 1
     * Write a Java program to allow the user to input his/her age.
     * Then the program will show if the person is eligible to vote.
     * A person who is eligible to vote must be older than or equal to 18 years old.
     */
    public void task1(int age) {
        if (age >= 18) {
            System.out.println("You can vote. Your age is " + age);
        } else {
            System.out.println("You can't vote. Your age is " + age);
        }
    }

    /**
     * Task 2
     * Write a Java program to determine whether an input number is an even number.
     */

    public void task2(int num) {
        if (num % 2 == 0) {
            System.out.println("Entered number is even. ");
        } else {
            System.out.println("Entered number is odd. ");
        }
    }

    /**
     * Task 3
     * Generate and print random integer number between 2 to 7(not using bound)
     */

    public int task3() {
        int randomNumber = (int) (Math.random() * 6 + 2);
        return randomNumber;
    }

    /**
     * Task 4
     * Write a Java program to determine whether an input number is a multiple of a 5.
     */

    public void task4(int x) {
        if (x % 5 == 0) {
            System.out.println("Entered number is multiple of a 5.");
        } else {
            System.out.println("Entered number is not multiple of a 5.");
        }
    }

    /**
     * Task 5
     * Take three numbers from the user and print the greatest number.
     */

    public int task5(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }

    /**
     * Task 6
     * Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
     * Otherwise, print "positive" or "negative".
     * Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000
     * (use Math.abs() for absolute value)
     */

    public void task6(float x) {
        if (x == 0) {
            System.out.println("zero");
        } else if (x < 0) {
            System.out.print("negativ ");
            if (Math.abs(x) < 1) {
                System.out.println("small");
            } else if (Math.abs(x) > 1_000_000) {
                System.out.println("large");
            }
        } else {
            System.out.print("positive ");
            if (Math.abs(x) < 1) {
                System.out.println("small");
            } else if (Math.abs(x) > 1_000_000) {
                System.out.println("large");
            }
        }
    }

    /**
     * Task 7
     * Write a Java program that keeps a number from the user and generates an integer
     * between 1 and 7 and displays the name of the weekday.
     */

    public void task7(int x) {
        int y = (x % 7) + 1;
        if (y == 1) {
            System.out.println("Mondey");
        } else if (y == 2) {
            System.out.println("Tuesday");
        } else if (y == 3) {
            System.out.println("Wednesday");
        } else if (y == 4) {
            System.out.println("Thursday");
        } else if (y == 5) {
            System.out.println("Friday");
        } else if (y == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sanday");
        }
    }

    /**
     * Task 8
     * The ice cream parlor sells three balls and five balls. Can you buy exactly k balls of ice cream?
     * In the cafe they sell an ice-cream with 3 balls and 5 balls.
     * Input K integer value from console, check  if you can buy exactly K balls ice-cream.
     */

    public void task8(int x) {
        if (x != 0 || x != 1 || x != 2 || x != 4 || x != 7) {
            System.out.println("Yes can!");
        } else {
            System.out.println("No can't!");
        }
    }

    /**
     * Task 9
     * LEAP YEAR
     * Write a Java program that takes a year from the user and print whether that year is a leap year or not.
     */
    public void task9(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    /**
     * Task 10
     * Generate random integer value, print true if random value corresponds these conditions, else print false(use boolean primitive type)
     * -input number is greater than -1000  and less than 1000
     * -input number is multiple of 3 or input number is multiple of  5
     */

    public boolean task10() {
        int randomNum = new Random().nextInt(3000) - 1500;
        if (randomNum > -1000 && randomNum < 1000
                && randomNum % 3 == 0 && randomNum % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Task 11
     * Input from console int a and int b, if a and b corresponds for following requirements print “Both a and b legal”,
     * if any of them does not correspond print about it like this “a is legal b is illegal ''. or vice versa
     * - a > 10 and b is not equal to 10
     * - both a and b is positive
     * - both a and b is negative
     * - a > 10 b < 1 both of them are odd
     * - a is a multiple of 5 OR b is a multiple of 5
     * - a is not a multiple of 5 but b is a multiple of 5
     */

    public void task11(int a, int b) {
        //a > 10 and b is not equal to 10
        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal ");
        } else if (a > 10 && b == 10) {
            System.out.println("a is legal b is illegal ");
        } else if (a <= 10 && b != 10) {
            System.out.println("a is illegal b is legal ");
        } else {
            System.out.println("Both a and b illegal ");
        }

        //both a and b is positive
        //both a and b is negative
        if (a >= 0 && b >= 0) {
            System.out.println("Both a and b positive ");
        } else if (a >= 0 && b < 0) {
            System.out.println("a is positive b is negative ");
        } else if (a < 0 && b >= 0) {
            System.out.println("a is negative b is positive ");
        } else {
            System.out.println("Both a and b negative ");
        }

        //a > 10 b < 1 both of them are odd
        if (a > 10 && b < 1 && a % 2 != 0 && b % 2 != 0) {
            System.out.println("Both a and b legal ");
        } else if (a > 10 && b == 10 || a % 2 != 0 && b % 2 == 0) {
            System.out.println("a is legal b is illegal ");
        } else if (a <= 10 && b != 10 || a % 2 == 0 && b % 2 != 0) {
            System.out.println("a is illegal b is legal ");
        } else {
            System.out.println("Both a and b illegal ");
        }

        //a is a multiple of 5 OR b is a multiple of 5
        //a is not a multiple of 5 but b is a multiple of 5
        if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("Both a and b multiple of 5 ");
        } else if (a % 5 == 0 && b % 5 != 0) {
            System.out.println("a is multiple of 5 b is not multiple of 5 ");
        } else if (a % 5 != 0 && b % 5 == 0) {
            System.out.println("a is not multiple of 5 b is multiple of 5 ");
        } else {
            System.out.println("Both a and b not multiple of 5 ");
        }
    }

    /**
     * Task 12
     * Input int values a and b from console
     * if one of them is multiple of 7, and both positive, and a greater than b, print all odd values between them
     * else print all even values between them
     */
    public void task12(int a, int b) {
        if ((a % 7 == 0 || b % 7 == 0) && a >= 0 && b >= 0 && a > b) {
            int y = b;
            if (b % 2 == 0) {
                ++y;
            } else {
                y += 2;
            }
            while (y < a) {
                System.out.println(y);
                y += 2;
            }
        } else {
            int y = 0;
            int z = 0;
            if (b < a) {
                y = b;
                z = a;
            } else if (b > a) {
                y = a;
                z = b;
            } else {
                System.out.println("Entered numbers is equal");
            }

            if (y % 2 == 0) {
                y += 2;
            } else {
                ++y;
            }

            while (y < z) {
                System.out.println(y);
                y += 2;
            }
        }
    }

    /**
     * Task 13
     * Given coordinates of two points in the coordinate plane.Write java program to check if the points lie in the same plane?(quarter)
     * Print In the same quarter , else print Not in the same quarter.
     * Input 4 coordinates from console, all 4 coordinates != 0.
     */

    public boolean task13(int a, int b, int c, int d) {
        return ((a > 0 == c > 0) && (b > 0 == d > 0));
    }

    /**
     * task 14
     * Given 3 positive numbers different from 0, Determine if there is a non-degenerate triangle with such sides.
     * Input numbers from console
     */

    public void task14(int x, int y, int z) {
        if (x + y >= z && x + z >= y && y + z >= x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * Task 15
     * Given 3 numbers, print count of numbers that equals to each other.(Input numbers from console)Example`
     * Input numbers`
     * 3
     * 1
     * 3
     * Output`2
     */

    public int task15(int x, int y, int z) {
        if (x == y && y == z) {
            return 3;
        } else if (x == y || x == z || y == z) {
            return 2;
        } else {
            return 0;
        }
    }

    /**
     * Task 16
     * Given 3 real numbers a , b , c .FInd all decisions for
     * ax2 + bx + c = 0.Print all decisions, if there is not a decision ,print “Can't be”.
     */

    public void task16(int a, int b, int c) {
        double x1;
        double x2;
        boolean logic = false;
        double D = b * b - 4 * a * c;
        if (D >= 0) {

            x1 = (-b + Math.sqrt(D)) / 2 * a;
            System.out.println("X1 value is : " + x1);

            x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("X2 value is : " + x2);

        } else System.out.println("Can't be: " + logic);
    }

    /**
     * Task 17
     * 15.Given 3 integer values arrange them in non-decreasing order. a<= b <= c.
     * Example`
     * Input
     * 3
     * 1
     * 1
     * Output
     * 1
     * 1
     * 3
     */

    public void task17(int a, int b, int c) {
        int max, min, med;
        if (a > b) {
            if (a > c) {
                max = a;
                if (b > c) {
                    med = b;
                    min = c;
                } else {
                    med = c;
                    min = b;
                }
            } else {
                med = a;
                if (b > c) {
                    max = b;
                    min = c;
                } else {
                    max = c;
                    min = b;
                }
            }
        } else {
            if (b > c) {
                max = b;
                if (a > c) {
                    med = a;
                    min = c;
                } else {
                    med = c;
                    min = a;
                }
            } else {
                med = b;
                max = c;
                min = a;
            }
        }
        System.out.println("sorted number \n" + min + "\n" + med + "\n" + max);
    }
}





