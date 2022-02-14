package company.day9;

import java.util.Scanner;

public class Model {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Controller1 controller = new Controller1();

//        System.out.println("Please enter number for detecting about square of 2 (Task)");
//        controller.task(scanner.nextInt());
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("Please enter 2 string (Task 1)");
//        controller.task1(scanner.next(), scanner.next());
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("Please enter 2 string (Task 2)");
//        controller.task2(scanner.next());
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("Please enter any number for detecting it's positiv or negative (Task 3)");
//        controller.task3(scanner.nextInt());
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("Please enter any number for detecting it's positiv or negative (Task 4)");
//        controller.task4(scanner.nextInt());
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("Enter 2 numbers for find max (Task 5)");
//        System.out.println(controller.task5(scanner.nextInt(), scanner.nextInt()));
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("Enter numbers for absolut function (Task 6)");
//        System.out.println(controller.task6(scanner.nextInt()));
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("Enter any text or not (Task 7)");
//        String str = "";
//        System.out.println(controller.task7(str);
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("Enter 3 numbers for find max (Task 8)");
//        System.out.println(controller.task8(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n");
//
//        System.out.println(" a. int 1x=10;\n" +
//                " b. int x=10;\n" +
//                " c. float x=10.0f;\n" +
//                " d. string x=\"10\";\n");
//
//        System.out.println("Please enter your answer a) b) c) d)");
//        String str = scanner.next();
//        char s = 0;
//        if (str.length()>1){
//            System.out.println("Wrong answere, enter character");
//        }else {s=str.charAt(0);}
//        controller.task9(s);
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("Enter a character (Task 10)");
//        String str = scanner.next();
//        char d = 0;
//        if (str.length()>1){
//            System.out.println("Wrong character");
//        }else {d=str.charAt(0);}
//        controller.task10(d);
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("Please enter any numbers from 0-9 (Task 11)");
//        controller.task11(scanner.nextInt());
//
//        System.out.println("\n____________________________\n");
//
//        System.out.println("Enter even ,for detecting Odd or Even (Task 12)");
//        controller.task12(scanner.nextInt());
//
//        System.out.println("\n____________________________\n");

        System.out.println("Enter first number than operation type than second number (Task 13)");
        String str = scanner.next();
//        char d = 0;
//        if (str.length()>1){
//            System.out.println("Wrong character");
//        }else {d=str.charAt(0);}
        controller.task13(scanner.nextInt(), scanner.next(), scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("Enter any number greater 0 (Task 14)");
        controller.task14(scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("Enter quiz, mid-term, final scores (Task 15)");
        controller.task15(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());


    }
}
