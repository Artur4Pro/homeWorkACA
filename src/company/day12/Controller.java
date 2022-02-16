package company.day12;

import java.util.Arrays;
import java.util.Random;

public class Controller {

    private int[] intArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        return array;
    }

    private void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }


    /**
     * Task 1
     * Print all elements of the array with even indices (that is, A [0], A [2], A [4]...)
     * Input natural integer N
     * define an array with size N,
     * Initialize it
     * Example ` Input` 1 2 3 4 5
     * Output` 1 3 5
     */

    public void task1(int n) {
        int[] a = intArray(n);
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    /**
     * Task 2
     * Print all even numbered items in the list.
     * Input natural integer N
     * define an array with size N,
     * Initialize it
     * Example ` Input` 1 2 3 4 5 10
     * Output` 2 4 10
     */
    public void task2(int n) {
        int[] a = intArray(n);
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    /**
     * Task 3
     * Find the number of positive elements in the given array.
     * Example` Input` 1 -1  2  3  -8
     * Output` 1 2 3
     */
    public void task3(int n) {
        int[] a = intArray(n);
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    /**
     * Task 4
     * A list of numbers is given. Print all the elements of the list that are larger than the previous element.
     * Example` Input ` 1 5 2 4 3   Output` 5 4
     */
    public void task4(int n) {
        int[] a = intArray(n);

        printArray(a);

        System.out.println();
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                System.out.print(a[i] + " ");
            }
        }
    }

    /**
     * Task 5
     * An array of numbers is given. If it has two adjacent(հարևան) elements of the same sign, print these numbers.
     * If there are no adjacent elements of the same character, do not print anything.
     * If there are several such pairs of neighbors, print the first pair.
     * Example`   Input` -1 2 3 -1 -2
     * Output` 2   3
     */

    public void task5(int n) {
        int[] a = intArray(n);

        printArray(a);

        System.out.println();

        for (int i = 0; i < a.length - 1; i += 2) {
            if (a[i] >= 0 && (a[i + 1] >= 0 || a[i - 1] >= 0)) {
                System.out.print(a[i] + " ");
            }
        }
    }

    /**
     * Task 6
     * An array of numbers is given. Print the value of the largest element in the array, and then the index of that element in the array. If there are several largest elements, print the index of the first of them.
     * Example` Input` 1 2 3 2 1
     * Output` The largest is 3    index is 2
     */

    public void task6(int n) {
        int[] a = intArray(n);

        printArray(a);
        int largest = a[0];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (largest < a[i]) {
                largest = a[i];
                index = i;
            }
        }
        System.out.println("The largest is " + largest + " index is " + index);
    }

    /**
     * Task 7
     * Print the value of the smallest of all positive elements in the list.
     * It is known that the list contains at least one positive element,
     * and the absolute value of all elements of the list does not exceed 1000.
     * Example ` Input ` 5  -4  3  -2  1
     * Output ` 1
     */

    public void task7(int n) {
        int[] a = intArray(n);

        printArray(a);

        int positivSmallest = 1000;

        for (int x : a) {
            if (x > 0 && positivSmallest > x) {
                positivSmallest = x;
            }
        }
        System.out.println(positivSmallest);
    }

    /**
     * Task 8
     * You are given a list sorted by non-decreasing elements in it. Determine how many different elements are in it.
     * Example ` Input ` 1 2 2 3 3 3
     * Output ` 3
     */

    public void task8(int n) {
        int[] a = Arrays.stream(intArray(n)).sorted().toArray();
        int count = 1;

        printArray(a);

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * Task 9
     * Print the elements of the given list in reverse order without changing the list itself.
     * Example ` Input `   1 2 3 4 5
     * Output ` 5 4 3 2 1
     */

    public void task9(int n) {
        int[] a = intArray(n);

        printArray(a);

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * Task 10
     * Rearrange the elements of this array in reverse order, then print the elements of the resulting array.
     * <p>
     * This task differs from the previous one in that you need to change the values ​​of the elements of
     * the array itself, swapping A [0] with A [n-1], A [1] with A [n-2], and then
     * display the elements of the array in a row.
     * Example ` Input ` 1 2 3 4 5
     * Output ` 5 4 3 2 1
     */

    public void task10(int n) {
        int[] a = intArray(n);
        printArray(a);
        int index = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
            index--;
        }
        printArray(a);
    }

    /**
     * Task 11
     * Rearrange the adjacent elements of the array (A [0] with A [1], A [2] with A [3], etc.).
     * If there is an odd number of elements, then the last element remains in its place.
     * <p>
     * Example ` Input ` 1 2 3 4 5
     * Output ` 2 1 4 3  5
     */

    public void task11(int n) {
        int[] a = intArray(n);
        printArray(a);
        int length;
        if (a.length % 2 == 0) {
            length = a.length / 2 + 2;
        } else {
            length = a.length / 2 + 1;
        }
        for (int i = 0; i < length; i += 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
        printArray(a);
    }

    /**Task 12
     * Cycle the elements of the array to the right (A [0] goes to A [1], A [1] to A [2], ..., the last element goes to A [0]).
     * Example ` Input `   1 2 3 4 5
     *                  Output ` 5 1 2 3 4
     */

}