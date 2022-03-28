package company.day25;

public class Methods {
    /**
     * 1.Write a recursive function
     * to find the sum of a given array.
     * to find the factorial of a given natural N.
     **/

    public static int sumOfArrayElements(int[] array, int length) {
        if (length == 0) {
            return 0;
        }
        return array[length - 1] + sumOfArrayElements(array, length - 1);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * 2.Write a fib(int) function which returns n-th fibonacci number.
     **/

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fib(n - 2) + fib(n - 1);
    }

    /**
     * 3.We have triangles made of blocks. The topmost row has 1 block, the next
     * row down has 2 blocks, the next row has 3 blocks, and so on. Compute
     * recursively (no loops or multiplication) the total number of blocks in
     * such a triangle with the given number of rows.
     * <p>
     * Example` triangle(0) -> 0
     * triangle(1) -> 1
     * triangle(2) -> 3
     **/

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }


    /**
     * 4.Given a non-negative int n, return the sum of its digits recursively (no
     * loops).
     **/

    public static int digitsSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + digitsSum(n / 10);
    }

    /**
     * 5.Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
     **/

    public static int countOf7(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + countOf7(n / 10);
        }
        return countOf7(n / 10);
    }

    /**
     * 6.Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
     * Example`
     * countX("xxhixx") → 4
     * countX("xhixhix") → 3
     * countX("hi") → 0
     **/

    public static int countOfX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.startsWith("x")) {
            return 1 + countOfX(str.substring(1));
        }
        return countOfX(str.substring(1));
    }

    /**
     * Given a string, compute recursively a new string where all the 'x' chars
     * have been removed.
     * Use`  str.substring()
     **/

    public static StringBuilder xDeleter(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() == 0) {
            return stringBuilder;
        }
        if (str.startsWith("x")) {
            return xDeleter(str.substring(1));
        }
        return stringBuilder.append(str.charAt(0)).append(xDeleter(str.substring(1)));
    }

    /**
     * 8.Write recursive function that reverses the given String.
     * Example` HELLO -> OLLEH
     **/

    public static StringBuilder revers(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() == 0) {
            return stringBuilder;
        }
        return stringBuilder.append(str.charAt(str.length() - 1)).append(revers(str.substring(0, str.length() - 1)));
    }

    /**
     * 9.Given a string, compute recursively a new string where all the lowercase 'x'
     * chars have been moved to the end of the string.
     * EXample`
     * endX("xxre") → "rexx"
     * endX("xxhixx") → "hixxxx"
     */

    public static String xMoveToTheEnd(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.startsWith("x")) {
            return xMoveToTheEnd(str.substring(1)) + "x";
        }
        return str.charAt(0) + xMoveToTheEnd(str.substring(1));


    }

    /**
     * 10. Given a string, return recursively a "cleaned" string where adjacent
     * chars that are the same have been reduced to a single char. So "yyzzza"
     * yields "yza".
     * EXample`
     * stringClean("yyzzza") → "yza"
     * stringClean("abbbcdd") → "abcd"
     */

    public static String cleanedString(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return cleanedString(str.substring(1));
        }
        return str.charAt(0) + cleanedString(str.substring(1));

    }


    /**
     * 11.Write a function to determine if a number is prime or not.
     */

    public static boolean isPrime(int n, int m) {
        if (n <= 2) {
            return true;
        }
        if (n % m == 0 && m != 1) {
            return false;
        }
        if (m == n / 2) {
            return true;
        }
        return isPrime(n, m + 1);
    }


    /**
     * 12.Given a string containing only decimal digits. Find and display the largest digit.
     */

    public static String maxDigit(String str) {
        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) > str.charAt(1)) {
            return maxDigit(str.substring(1) + str.charAt(0));
        }
        return maxDigit(str.substring(1));

    }

    /**
     * 13.You are given a string containing numbers and English letters (uppercase and lowercase).
     * Find and display the number of digits.
     */

    public static int countOfNumbers(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return 1 + countOfNumbers(str.substring(1));
        }
        return countOfNumbers(str.substring(1));

    }

    /**
     * 14.Given a string containing only English letters (uppercase and lowercase).
     * Add the ‘*’ (asterisk) character between letters (you don’t need to add ‘*’ before the first
     * letter and after the last).
     * <p>
     * Example ` LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO
     * <p>
     * L*I*t*B*e*o*F*L*c*S*G*B*O*F*Q*x*M*H*o*I*u*D*D*W*c*q*c*V*g*k*c*R*o*A*e*o*c*X*O
     */

    public static StringBuilder addAsterisk(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        if (str.length() == 1) {
            return stringBuilder.append(str.charAt(0));
        }
        return stringBuilder.append(str.charAt(0)).append('*').append(addAsterisk(str.substring(1)));
    }

    /**
     * 15.Given a string containing only English letters (uppercase and lowercase).
     * Add opening and closing parentheses according to the following pattern:
     * "example" -> "(e (x (a (m) p) l) e)" (Added opening parentheses to the middle,
     * closing parentheses after the middle. In case the string length is even there must be 2
     * characters in the brackets in the middle. ("card -> (c (ar) d)" but not "(c (a () r) d)").
     * <p>
     * Example`
     * LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO
     * <p>
     * (L(I(t(B(e(o(F(L(c(S(G(B(O(F(Q(x(M(H(o(I)u)D)D)W)c)q)c)V)g)k)c)R)o)A)e)o)c)X)O)
     */

    public static StringBuilder addParentheses(String str){
        String str1 =str;
        int length = str1.length();
        return addParentheses(str1,length);
    }
    private static StringBuilder addParentheses(String str, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() == 0) {
            return stringBuilder;
        }
        if (str.length() > length / 2) {
            return stringBuilder.append('(').append(str.charAt(0)).append(addParentheses(str.substring(1)));
        } else {
            return stringBuilder.append(str.charAt(0)).append(')').append(addParentheses(str.substring(1)));
        }
    }

    /**
     *16.Given a string containing only English letters (uppercase and lowercase) and opening brackets.
     *  Form a new line by adding a "mirrored" line with closing brackets to the right.
     * "(abc (def (g " -> "(abc (def (gg) fed) cba)"
     **/

//    public static StringBuilder miroredText (String str) {
//        StringBuilder stringBuilder = new StringBuilder();
//        return stringBuilder.append(str).append((str).reverse());
//    }
}
