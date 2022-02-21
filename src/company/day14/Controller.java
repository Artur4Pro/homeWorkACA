package company.day14;

import java.util.Locale;

public class Controller {

    /**
     * Task 1
     * Write a function which returns the length of a given String.
     */

    public int task1(String a) {
        return a.length();
    }

    /**
     * Task 2
     * Write a function which returns a character of a given index,from a given String.
     * Pass as a parameters String str, int index
     */
    public void task2(String s, int a) {
        System.out.println(s.charAt(a));
    }

    /**
     * Task 3
     * Write a function which checks if the given String contains a given character.
     * Pass as parameters String str, char ch
     */
    public boolean task3(String a, char b) {
        boolean c = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                c = true;
                break;
            }
        }
        return c;
    }

    /**
     * Task 4
     * Write a function which returns the count of vowels of a given String
     * -write also an overloaded function which returns count of constants.
     */

    public int task4(String s) {
        String[] chars = {"a", "e", "i", "u", "o"};
        String str = s.toLowerCase(Locale.ROOT);
        int cout = 0;
        for (int i = 0; i < chars.length; i++) {
            if (s.contains(chars[i])) {
                cout++;
            }
        }
        return cout;
    }

    /**
     * Task 5
     * Write a function called reverseString, which prompts the user for a String,
     * and prints the reverse of the String by extracting and processing each character. The output shall look like:
     * Enter a String: abcdef
     * The reverse of the String "abcdef" is "fedcba"
     */

    public void task5(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    /**
     * Task 6
     * Write a program called countVowelsDigits, which get as parameter  a String,
     * counts the number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string,
     * and prints the counts and the percentages (rounded to 2 decimal places).  For example`
     * <p>
     * <p>
     * <p>
     * Enter a String: testing12345
     * Number of vowels: 2 (16.67%)
     * Number of digits: 5 (41.67%)
     * <p>
     * <p>
     * <p>
     * Hints
     * To check if a char c is a digit, you can use boolean expression (c >= '0' && c <= '9');
     * or use built-in boolean function Character.isDigit(c).
     * You could use in.next().toLowerCase() to convert the input String to lowercase to reduce the number of cases.
     * To print a % using printf(), you need to use %%.
     * This is because % is a prefix for format specifier in printf(), e.g., %d and %f.
     */
    public double persentOf(int a, int length) {
        return (double) a * 100 / length;
    }

    public void task6(String s) {
        int vowalcount = task4(s);
        int digitCount = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) > '0' && s.charAt(i) <= '9') {
                digitCount++;
            }
        }


        double vowalPersent = persentOf(vowalcount, length);
        double digitPersent = persentOf(digitCount, length);

        System.out.printf("Vowal is %.2f %% , digit is %.2f %%", vowalPersent, digitPersent);

    }


    /**
     * Task 7
     * Caesar's Code is one of the simplest encryption techniques.
     * Each letter in the plaintext is replaced by a letter with some fixed number of positions (n)
     * down the alphabet cyclically. In this exercise, we shall pick n=3. That is, 'A' is replaced by
     * 'D', 'B' by 'E', 'C' by 'F', ..., 'X' by 'A', ..., 'Z' by 'C'.
     * Write a function called caesarCode to cipher Caesar's code. The program shall prompt the user for a plaintext
     * string consisting of mix-case letters only; compute the ciphertext; and print the ciphertext in uppercase.
     * For example,
     * Enter a plaintext string: Testing
     * The ciphertext string is: WHVWLQJ
     * Hints
     * Use in.next().toUpperCase() to read an input string and convert it into uppercase to reduce the number of cases.
     * You can use a big nested-if with 26 cases ('A'-'Z'). But it is much better to consider 'A' to 'W' as one case;
     * 'X', 'Y' and 'Z' as 3 separate cases.
     */

    public void task7(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) + n > 90) {
                int m = str.charAt(i) + n - 90;
                s += (char) (64 + m);
            } else if (str.charAt(i) + n > 122) {
                int m = str.charAt(i) + n - 122;
                s += (char) (96 + m);
            } else {
                char c = (char) (str.charAt(i) + n);
                s += c;
            }
        }
        System.out.println(s);
    }


    /**
     * Task 8
     * Write a function to check if the passed String palindrome or not
     * Print “xxx”  is|is not a Palindrome.
     * <p>
     * A word that reads the same backward as forward is called a palindrome, e.g.,
     * "mom", "dad", "racecar", "madam", and "Radar" (case-insensitive).
     */

    public boolean task8Palindrom(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.toLowerCase(Locale.ROOT).charAt(i);
        }
        return (str.equals(s.toLowerCase(Locale.ROOT)));
    }

    /**
     * Task 9
     * The binary number system uses 2 symbols, 0 and 1.
     * Write a function called checkBinStr to verify a binary string.
     * The program shall prompt the user for a binary string; and decide if the input string is a valid binary string.
     * For example,
     * Enter a binary string: 10101100
     * "10101100" is a binary string
     * <p>
     * Enter a binary string: 10120000
     * "10120000" is NOT a binary string
     */

    public boolean checkBinStr(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '1') {
                return false;
            }
        }
        return true;
    }

    /**
     * Task 10
     * The hexadecimal (hex) number system uses 16 symbols, 0-9 and A-F (or a-f).
     * Write a program to verify a hex string. The function gets a hex string;
     * and decides if the input string is a valid hex string. For examples,
     * <p>
     * Enter a hex string: 123aBc
     * "123aBc" is a hex string
     * <p>
     * Enter a hex string: 123aBcx
     * "123aBcx" is NOT a hex string
     */

    public boolean task10(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.toLowerCase(Locale.ROOT).charAt(i)) {
                case '0', '1', '2', '3', '4', '5', '6', '7',
                        '8', '9', 'a', 'b', 'c', 'd', 'e', 'f':
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /**
     * Task 11
     * Write a function called bin2Dec to convert an input binary string into its equivalent decimal number.
     * Your output shall look like:
     * Enter a Binary string: 1011
     * The equivalent decimal number for binary "1011" is: 11
     * Enter a Binary string: 1234
     * error: invalid binary string "1234"
     */

    public void bin2Dec(String s) {
        boolean isBim = checkBinStr(s);
        if (isBim) {
            int power = 0;
            int dec = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '1') {
                    dec += Math.pow(2, power);
                    power++;
                } else {
                    power++;
                }
            }
            System.out.println(s + " is " + dec);
        } else {
            System.out.print("Error: invalid binary string " + s);
            return;
        }
    }

    /**
     * Task 12
     * Write a function that counts duplicate characters from a given string.
     */

    public int task12(String s) {
        int count = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j)
                    if (!task3(str, s.charAt(i))) { //task 3 containi funkciana
                        str += s.charAt(i);
                        count++;
                    }
            }
        }
        return count;
    }

    /**
     * Task 13
     * Write a function that returns the first non-repeated character from a given string.
     */

}

