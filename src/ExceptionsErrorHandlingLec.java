public class ExceptionsErrorHandlingLec {
    public static void main(String[] args) {
//        try {
//            throw new Exception("No, Billy! Don't throw an exception!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Can still do stuff afterwards!");
//        }
//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.err.println("Math still works!");
//        }
        int[] numbers = {1, 2, 3};
        int x = 0;

        try {
            x = numbers[5];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("NO");
        } catch(Exception e) {
            System.err.println("I am a generic catch");
        } finally {
            System.out.println("This always runs");
        }

        System.out.println(x);
    }
}
