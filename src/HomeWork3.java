import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Task 1
         * Write java program, which has byte type variable(Input variables from console)
         * -Cast byte to short type, print both variables
         * -Cast short to int  type, print both variables
         * -Cast int to long, print both variables
         * -Cast long to float, print both variables
         * -Cast float to double type, print both variables
         */

//        System.out.println("Please enter byte type number");
//        byte a = scanner.nextByte();
//        short b = a;
//        int c = b;
//        long d = c;
//        float e = d;
//        double f = e;
//
//        System.out.println("byte - " + a
//                + "\n" + "short - " + b
//                + "\n" + "int - " + c
//                + "\n" + "long - " + d
//                + "\n" + "float - " + e
//                + "\n" + "double - " + f);

        /**
         * Task 2
         * Write java program, which has double type variable(Input variable from console)
         * -Cast double  to float,print both variables
         * -Cast float to long, print both variables
         * -Cast long to int, print both variables
         * -Cast int to short, print both results
         * -Cast short to byte, print both results
         */

//        System.out.println("Please enter double type number");
//        double a = scanner.nextDouble();
//        float b = (float) a;
//        long c = (long) b;
//        int d = (int) c;
//        short e = (short) d;
//        byte f = (byte) e;
//
//        System.out.println("double - " + a
//                + "\n" + "float - " + b
//                + "\n" + "long - " + c
//                + "\n" + "int - " + d
//                + "\n" + "short - " + e
//                + "\n" + "byte - " + f);

        /**
         * Task 3
         * Write a Java program to convert temperature from Fahrenheit to
         *  Celsius degree. (Input parameter from console)
         * -Print the result
         * -Cast the result to float type,print float type
         * -Cast result to int,print int type
         */

//        System.out.println("Please enter Fahrenheit temperature for convert to Celsius");
//        double fahrenheit = scanner.nextDouble();
//
//        double toCelsius = (fahrenheit - 32) * 5 / 9;
//        System.out.println("Converted result is -> " + toCelsius);
//
//        float toFloat = (float) toCelsius;
//        System.out.println("\nResult to floate converted result is -> " + toFloat);
//
//        int toInt = (int) toCelsius;
//        System.out.println("\nResult to int converted result is -> " + toInt);

        /**
         * Task 4
         * Compute area  and perimeter of circle.
         * (Input double type radius from console)(PI = 3.14159)
         */

//        System.out.println("Please enter radius of circle for compute area and perimeter");
//        double radius = scanner.nextDouble();
//        double area = Math.PI * Math.pow(radius, 2);
//        double perimeter = 2 * Math.PI * radius;
//        System.out.println("Computed results :\nArea -> " + area + "\nPerimeter -> " + perimeter);

        /**
         * Task 5
         * Print the result of this expression 1 / 3
         * -as a double
         * -as a float
         */

//        double a = (double) 1 / 3;
//        float b = (float) a;
//
//        System.out.println("1/3 result for: \nDouble is -> " + a + "\nFloat is -> " + b);

        /**
         * Task 6
         * Write java program to print your Name and year of birth
         * using only char primitive and int types.Output` (Ara 1996)
         */

//        char a = 'A';
//        char b = 'r';
//        char c = 'a';
//        int age = 1996;
//
//        System.out.println("Result : " + a + b + c + " " + age);

        /**
         * Task 7
         * Cast char to int
         */

//        char k = 'a';
//        int m = k;
//
//        System.out.println("Converted char to int is -> " + m);

        /**
         * Task 8
         * 8.	Write a java program which parses your name letters as a integers,
         * calculate average of them, Output  ` Ara -- 92.0
         */

//        System.out.println("Please enter your name : ");
//        String name = scanner.nextLine();
//
//        int sum = 0;
//        for (int i = 0; i < name.length(); i++) {
//            sum += name.charAt(i);
//        }
//        double average = sum / name.length();
//        System.out.println("The average of your name is -> " + average);

        /**
         * Task 9
         * Input int value from console, find char value corresponding to that int value.
         * Output ` 65 - A. (input int in range 32 to 127)
         */

//        System.out.println("Please enter number in range 32 to 127...");
//        int number = scanner.nextInt();
//        if (number >= 32 && number <= 127) {
//            char toChar = (char) number;
//            System.out.println("Entered number in character table is -> '" + toChar + "'");
//        } else {
//            System.out.println("Entered number out of range.");
//        }

        /**
         * Task 10
         *   String
         * - Define simple String variable, initialize it
         * - Define another String variable, initialize it
         * - Concatenate them , print output
         */

//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        String stringSum = str1 + str2;
//
//        System.out.println(stringSum);

        /**
         * Task 11
         * What happens if concatenate string and another primitive type
         * -concatenate integer + integer, print output
         * -concatenate String  + integer with other primitive types.
         * Example of output` 5 + 10 = 15
         */

//        System.out.println("Please enter first number.");
//        int num1 = scanner.nextInt();
//        System.out.println("Please enter second number.");
//        int num2 = scanner.nextInt();
//        System.out.println("Now text anything.");
//        String text = scanner.next();
//
//        System.out.println("Concatenate integer + integer result -> " + num1 + num2);
//        System.out.println("Concatenate String  + integer result -> " + num1 + " + " + num2 + " = " + text);

        /**
         * Task 12
         * Try to print this text
         * - String txt = "We are the so-called "Vikings" from the north.";
         * - There is problem with word “Vikings”
         * * How to solve 12 problem
         * - We can use backslash for word “Vikings”
         * - String txt = "We are the so-called \"Vikings"\ from the north.";
         * - \n New Line
         * - \r Carriage return
         * - \t Tab
         * - \b backslash
         * - try with this features print txt
         */

//        String txt = "We are the so-called \n \"Vikings\" from the north.";
//        String txt1 = "We are the so-called \r \"Vikings\" from the north.";
//        String txt2 = "We are the so-called \t \"Vikings\" from the north.";
//        String txt3 = "We are the so-called \b \"Vikings\" from the north.";
//
//        System.out.println(txt + "\n" + txt1 + "\n" + txt2 + "\n" + txt3);

        /**
         * Task 13
         * Swap 2 integers without using temp.
         */

//        System.out.println("Enter first number:");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter secomd number:");
//        int num2 = scanner.nextInt();
//
//        num1 += num2;
//        num2 = num1 - num2;
//        num1 -= num2;
//
//        System.out.println("Swapping result -> " + num1 + " " + num2);

        /**
         * TEST
         *
         * 1) Which data type would you use to represent the following values?
         *      a. Child age -> int
         *      b. Employee salary -> float or double,but in Armenia it's byte!:)
         *      c .Whether somebody has children or not -> boolean
         *      d. Apartment letter -> String
         *
         * 2) Find the errors in the following Java sentences:
         *      a) int a, b, c a = 0   -> int a, b, c, a = 0
         *      b) System.out.println('ab');    ->  System.out.println("ab");
         *      c) System.out.println( (3 + 2) – 1) ); -> System.out.println( ((3 + 2) – 1) );
         *      d) int a = 3.2; -> int a = 3;
         *      e) float a = 2.1; int c = a; -> int c = (int) a;
         *      f) int i = 10; float b; i = b; -> i = (int) b;
         *      g) int x; { x = 10; } System.out.println(x); -> int x;  x = 10; System.out.println(x);
         *      h) boolean a, b; a = false, b = true; -> boolean a, b; a = false; b = true;
         *      i) int x; x = 1; r = x + 1; -> int x; x = 1; int r = x + 1;
         *      j) String s = 'This is a string'; -> String s = "This is a string";
         *
         * 3)What will be output
         *     int i = 10;
         *     int n = i++ % 5; -> result is 2
         *
         * 4) Find the value of the variable result after executing the following sentences:
         * int a;
         * int b;
         * int result;
         *  a) a = 4; b = 12; result = a + b / 3; -> result is 5
         *  b) a = 3; a = a + 3; b = 2; result = a – b; -> result is 4
         *  c) a = 2; b = a + 1; a = b + 2; result = a + b + a; result = -result; -> result is -13
         *  d) a = 3; b = 11; result = (b % a) + 1; -> result is 3
         *  e) a = 3; b = a++; result = 1; result += a – b; -> result is 2
         */

    }
}
