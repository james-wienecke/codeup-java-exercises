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
    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(4, 2));
        System.out.println(multiplication(7, 4));
        System.out.println(multiplication(20, 5));
        System.out.println(multiplication(9, 5));
        System.out.println(multiplication(2, 5));
        System.out.println(multiplication(0, 5));
//        System.out.println(division(1, 2));
//        System.out.println(modulus(25, 6));
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
        if (a < b)
            return multiplication(b, a);

        else if (b != 0)
            return (a + multiplication(a, b - 1));

        else
            return 0;
    }

    private static double division(double a, double b) {
        return a / b;
    }

    private static double modulus(double a, double b) {
        return a % b;
    }
}
