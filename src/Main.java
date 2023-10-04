/*
*   Name: Nathan Lau
*   Section: 12
*
*   Academic Honesty Pledge:
*   "I have neither given nor received any unauthorized aid on this piece of work."
*
*   Signed Nathan  Date Oct, 4
* */

public class Main {

    public static char calculateGrade (int a) {
        if (a <= 54) {
            return 'F';
        }
        else if (55 <= a && a <= 64) {
            return 'E';
        }
        else if (65 <= a && a <= 74) {
            return 'D';
        }
        else if (75 <= a && a <= 84) {
            return 'C';
        }
        else if (85 <= a && a <= 94) {
            return 'B';
        }
        return 'A';
    }

    public static String fizzBuzz (int a) {
        if (a % 2 == 0 && a % 7 == 0) {
            return "fizzbuzz";
        }
        else if (a % 2 == 0 && a % 7 != 0) {
            return "fizz";
        }
        else if (a % 7 == 0 && a % 2 != 0) {
            return "buzz";
        }
        return "unlucky";
    }
    public static String backFront (String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(str.length()-2) + str + str.substring(str.length()-2);
    }

    public static boolean twoAsOne(int a, int b, int c) {
        if (a * b == c || a * c == b || b * c == a) {
            return true;
        }
        return false;
    }

    public static String endDown (String str) {
        if (str.length() < 3) {
            return str.toLowerCase();
        }
        return str.substring(0, str.length()-3) + str.substring(str.length()-3).toLowerCase();
    }

    // Question 1 - calculateGrade (public return type name parameters)


    // Question 2 - fizzBuzz

    // Question 3 - frontBack    length of string - 1 = index of last character

    // Question 4 - twoAsOne

    // Question 5 - endUp

}
