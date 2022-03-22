package company.sevagir;

public class Methods {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static boolean palindrom(String n) {
        int length = n.length();
        if (length == 1) {
            return true;
        }
        if (length == 2) {
            return true;
        }
        return n.charAt(0) == n.charAt(length - 1) && palindrom(n.substring(1, length-1));
    }
}
