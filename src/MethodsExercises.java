import java.util.Scanner;

public class MethodsExercises {
    /*
    Create a class named MethodsExercises. Inside of your class, write code to create the
    specified methods. Test your code by creating a main method and calling each of the methods you've created.

    Basic Arithmetic

    Create four separate methods. Each will perform an arithmetic operation:

    Addition
    Subtraction
    Multiplication
    Division
    Each function needs to take two parameters/arguments so that the operation can be performed.

    Test your methods and verify the output.

    Add a modulus method that finds the modulus of two numbers.

    Food for thought: What happens if we try to divide by zero? What should happen?
     */

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(4, 2));
//        System.out.println(multiplication(7, 4));
//        System.out.println(multiplication(20, 5));
//        System.out.println(multiplication(9, 5));
//        System.out.println(multiplication(2, 5));
//        System.out.println(multiplication(0, 5));
//        System.out.println(division(1, 2));
//        System.out.println(modulus(25, 6));

//        System.out.println(getInteger(1, 10));
//        System.out.println(getInteger(-5, 9));

    }
    private static double addition(double a, double b) {
        return a + b;
    }

    private static double subtraction(double a, double b) {
        return a - b;
    }

    /* Bonus

    Create your multiplication method without the * operator (Hint: a loop might be helpful).
    Do the above with recursion.
     */
    private static double multiplication(double a, double b) {
        // original solution
//        return a * b;

        // no * operator
//        double sum = 0;
//        for (double i = b; i > 0; i--) {
//            sum += a;
//        }
//        return sum;

        // recursion
        // we want the sum of a added b times

        // this first conditional is technically unnecessary but by making this check
        // we will try to make the 'b' number smaller than 'a' so that we call this function recursively
        // fewer times
        if (a < b)
            return multiplication(b, a);

        // so long as b != 0, we recursively build a sum to return from a added to itself
        if (b != 0)
            return (a + multiplication(a, b - 1));

        // when 'b' bottoms out (whether by initial assignment to 0 or because we've called it recursively as b - 1
        // down to zero), we return zero to the 'a' summation chain and do not call this method again.
        else
            return 0;
    }

    private static double division(double a, double b) {
        return a / b;
    }

    private static double modulus(double a, double b) {
        return a % b;
    }

    /* Create a method that validates that user input is in a certain range

    The method signature should look like this:
    public static int getInteger(int min, int max);

    and is used like this:
    System.out.print("Enter a number between 1 and 10: ");
    int userInput = getInteger(1, 10);

    If the input is invalid, prompt the user again.

    Hint: recursion might be helpful here!
     */
    private static int getInteger(int min, int max) {
        System.out.printf("Enter a number between %d and %d\n", min, max);
        int userInt = sc.nextInt();
        if (userInt < min || userInt > max)
            return getInteger(min, max);
        else
            return  userInt;
    }

    /* Calculate the factorial of a number.

    Prompt the user to enter an integer from 1 to 10.
    Display the factorial of the number entered by the user.
    Ask if the user wants to continue.
    Use a for loop to calculate the factorial.
    Assume that the user will enter an integer, but verify it’s between 1 and 10.
    Use the long type to store the factorial.
    Continue only if the user agrees to.
    A factorial is a number multiplied by each of the numbers before it.
    Factorials are denoted by the exclamation point (n!). Ex:


    1! = 1               = 1
    2! = 1 x 2           = 2
    3! = 1 x 2 x 3       = 6
    4! = 1 x 2 x 3 x 4   = 24

     */

    private static long getFactorial(int num) {
        int result = 1;
        String resultStr = "";
        for (int i = 1; i <= num; i++) {
            resultStr += String.format("%d x ", i);
            result = result * i;
        }
        System.out.printf("%d! = %14s = %d", num, resultStr, result);
    }
}
