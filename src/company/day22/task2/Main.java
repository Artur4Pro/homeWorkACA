package company.day22.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DefaultStack defaultStack = new DefaultStack();
        defaultStack.push(1);
        defaultStack.push(2);
        defaultStack.push(3);
        defaultStack.push(4);
        defaultStack.push(5);

        defaultStack.pop();
        defaultStack.pop();
        defaultStack.pop();
        defaultStack.pop();
        defaultStack.pop();



    }
}
