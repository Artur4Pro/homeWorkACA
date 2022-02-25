package company.day17;

public class Controller {

    /**
     * Task 1
     * Write a function add with these 3 types of overloading.
     * static void add();
     * Which prints which method is called and result
     */
    public void add(int a, int b) {
        System.out.println(a + " , " + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + " , " + b + " , " + c);
    }

    public void add(int a, float b) {
        System.out.println(a + " , " + b);
    }

    public void add(float a, int b) {
        System.out.println(a + " , " + b);
    }

    /**Task 2
     * Write 2 functions where first returns float second returns int,
     * and they have the same parameters for input.
     */


}
