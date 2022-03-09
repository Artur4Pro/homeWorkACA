package company.day22.task1;

import java.util.Scanner;

public class Convertor {
    Scanner scanner = new Scanner(System.in);

    public int convertor() {
        System.out.println("Enter digit text");
        int x;
        while (true) {
            try {
                x=Integer.parseInt(scanner.nextLine());
                System.out.print("☻ ");
                scanner.close();
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        }
    }
}
