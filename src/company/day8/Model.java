package company.day8;

import java.util.Random;
import java.util.Scanner;

public class Model {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.println("Task 1 : Please enter age : ");
        controller.task1(scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("Task 2 : Please enter number for determine even or not");
        controller.task2(scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("It's Task 3 : ");
        System.out.println(controller.task3());

        System.out.println("\n____________________________\n");

        System.out.println("Task 4 : Please enter number for determan it multiple of a 5 or note ");
        controller.task4(scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("Task 5 : Please enter 3 numbers and we print the gretist of them ");
        System.out.println(controller.task5(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));

        System.out.println("\n____________________________\n");

        System.out.println("Task 6 : Please enter FLOAT number ");
        controller.task6(scanner.nextFloat());

        System.out.println("\n____________________________\n");

        System.out.println("Task 7 : Please enter number and program generate name of weekday");
        controller.task7(scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("Task 8 : IceCream :) You know what to do ;) ");
        controller.task8(scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("Task 9 : Please enter year ant we will detect it LeapYear or not");
        controller.task9(scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("Task 10 :");
        System.out.println(controller.task10());

        System.out.println("\n____________________________\n");

        System.out.println("Task 11 : Please enter 2 number ");
        controller.task11(scanner.nextInt(),scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("Task 12 : Please enter 2 numbers ");
        controller.task12(scanner.nextInt(),scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("Please enter 2 cordination for x and 2 cordination for y ");
        System.out.println(controller.task13(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));;

        System.out.println("\n____________________________\n");

        System.out.println("Please enter 3 sides of triangle ");
        controller.task14(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("Please enter 3 numbers for detecting count of equals numbers ");
        System.out.println(controller.task15(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));

        System.out.println("\n____________________________\n");

        System.out.println("Enter 3 numbers ");
        controller.task16(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("\n____________________________\n");

        System.out.println("PLease enter 3 numbers ");
        controller.task17(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
}
