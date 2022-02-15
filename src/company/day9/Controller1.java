package company.day9;

import java.util.Scanner;

public class Controller1 {
    Scanner scanner = new Scanner(System.in);

    public void task(int num) {
        int num1 = num;
        while (num1 % 2 == 0 && num1 >= 1) {
            num1 /= 2;
        }
        if (num1 == 1) {
            System.out.println("It's square of 2");
        } else {
            System.out.println("It isn't square of 2");
        }
    }

    /**
     * Task 1
     * Write a java program, which has 2 String variables, initialize them from console.
     * - Compare them with == assignment
     * - Compare them with equals to
     */
    public void task1(String a, String b) {
        System.out.println("First string == second");
        boolean y = a == b;
        System.out.println(y);
        System.out.println("First string equals() second");
        boolean z = a.equals(b);
        System.out.println(z);
    }

    /**
     * Task 2
     * Write a java program, which has 2 String variables, initialize them, One with literal, another using new keyword
     * - Compare them with == assignment
     * - Compare them with equals to
     */

    public void task2(String a) {
        String txt = a;
        String txt2 = new String(txt);

        System.out.println("First string == second");
        boolean y = txt == txt2;
        System.out.println(y);
        System.out.println("First string equals() second");
        boolean z = txt.equals(txt2);
        System.out.println(z);
    }

    /**
     * Task 3
     * Input integer value from console, if value greater than 0 print n positive, else print negative.
     */

    public void task3(int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative");
    }

    /**
     * Task 4
     * Input integer value from console, if value greater than 0 print positive, else print negative, else if 0 print 0
     */

    public void task4(int a) {
        System.out.println(a > 0 ? "Positive" : a < 0 ? "Negative" : "Equal 0");
    }

    /**
     * Task 5
     * achieve Math.max(a,b) function
     */

    public int task5(int x, int z) {
        return (x > z ? x : z);
    }

    /**
     * Task 6
     * achieve Math.abs(a) function
     */

    public int task6(int x) {
        return (x < 0 ? x * -1 : x);
    }

    /**
     * Task 7
     * Using ternary operator check if the given String
     * is a null so return -1
     * if given String is  “ ” return  0
     * else return 1
     */

    public int task7(String s) {
        return (s.equals("") ? -1 : s.equals(" ") ? 0 : 1);
    }

    /**
     * Task 8
     * Write a java program to find maximum from a given 3  integer numbers using ternary operator.
     * Input numbers from console
     */

    public int task8(int a, int b, int c) {
        return task5(a, b) >= task5(b, c) ? task5(a, b) : task5(b, c);
    }

    /**
     * Task 9
     * Write a Java program that allows the user to choose the correct
     * answer of a question.If he choose correct answer Print “Congratulation”,
     * in case of illegal choice print “Invalide choice”.
     */

    public void task9(char x) {
        switch (x) {
            case 'c', 'C':
                System.out.println("Congratulation");
                break;
            default:
                System.out.println("Invalide choice");
        }
    }

    /**
     * Task 10
     * Write Java Program to check Vowel or Consonant using Switch Case.
     */

    public void task10(char a) {
        char b = 0;
        if (a >= 65 && a <= 90 || a >= 97 && a <= 122) {
            b = a;
        }
        switch (b) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(a + " is  a Vowel");
            case 0 -> System.out.println("Wrong char");
            default -> System.out.println(a + " isn't  a Vowel");
        }
    }

    /**
     * Task 11
     * If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed,
     * otherwise, the program will show "Not allowed".
     */

    public void task11(int a) {
        switch (a) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 -> System.out.println("You pressed " + a);
            default -> System.out.println("Not allowed");
        }
    }

    /**
     * Task 12
     * Using switch statements determine if the number is even or odd.
     * Input number from console
     */

    public void task12(int n) {
        int a = n % 2;
        switch (a) {
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
        }
    }

    /**
     * Task 13
     * Program to make a calculator using switch case in Java
     * In this Program we are making a simple calculator that performs
     * addition, subtraction, multiplication and division based on the user input.
     * The program takes the value of both the numbers (entered by user) and then
     * user is asked to enter the operation (+, -, * and /), based on the input program performs
     * the selected operation on the entered numbers using switch case.
     */

    public void task13(double a, double b) {
        String str = scanner.next();
        char d = 0;
        if (str.length() > 1) {
            System.out.println("Wrong character");
        } else {
            if (str.charAt(0)==42) {
            } d = str.charAt(0);
        }


        if (b == 0) {
            System.out.println("Tivy 0 vra chi kareli bajanel Jana");
            return;
        }
        //42 43 45 47
        double output = 0;
        switch (d) {
            case '+' -> output = a + b;
            case '-' -> output = a - b;
            case '/' -> output = a / b;
            case '*' -> output = a * b;
            default -> {
                System.out.println("wrong operation or number");
                return;
            }
        }
        System.out.println(a + " " + b + " " + b + " = " + output);
    }

    /**
     * Task 14
     * Given the String variable day holding the name of the weekday
     * Sunday, Monday,etc.,set an int variable to 1, 2, etc.
     */

    public void task14(int a) {
        int b = a;
        if (a > 7) {
            b = a % 7 ;
        }
        String weekDay = "";
        switch (b) {
            case 1 -> weekDay = "Monday";
            case 2 -> weekDay = "Tuesday";
            case 3 -> weekDay = "Wednesday";
            case 4 -> weekDay = "Thursday";
            case 5 -> weekDay = "Friday";
            case 6 -> weekDay = "Saturday";
            case 7 -> weekDay = "Sunday";
            default -> {
                System.out.println("Entered negative number or equal 0");
                return;
            }
        }
        System.out.println(weekDay);
    }

    /**
     * Task 15
     * The program will read three types of scores(quiz, mid-term, and final scores)
     * and determine the grade based on the following rules:
     * -if the average score >= 80% =>grade=A
     * -if the average score >= 60% and <80% => grade=B
     * -if the average score>=40% and < 60% =>grade=C
     * -else =>grade=F
     */

    public void task15(double quiz, double mid_term, double _final) {
        double average = (quiz + mid_term + _final) / 3;
        if (average >= 80) {
            System.out.println("Your grade is A");
        } else if (average >= 60 && average < 80) {
            System.out.println("Your grade is B");
        } else if (average >= 40 && average < 60) {
            System.out.println("Your grade is C");
        } else {
            System.out.println("Your grade is F");
        }
    }
}



