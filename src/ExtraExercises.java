import java.sql.Array;
import java.util.Scanner;

public class ExtraExercises {
    public static void main(String args[]) {
        /* Write a program in Java to read 10 numbers from keyboard and find their sum and average

        Expected Output :
        The sum of 10 numbers is : 55
        The Average is : 5.500000
         */
        /*
        int[] numbers = new int[10];
        System.out.println("You will be prompted for ten integers. After all are received, you will be provided with their sum and average.");
        for (short i = 0; i < 10; i++) {
            System.out.printf("Number %d - ", i + 1);
            numbers[i] = getInteger(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        System.out.printf("Sum of numbers: %d\n", getIntArraySum(numbers));
        System.out.printf("Average of numbers: %d\n", getAverage(numbers));
        */
        /* Write a program in Java to display the cube of the number upto given an integer. Read the number using the Scanner class.

        Expected Output :
        Number is : 1 and cube of the 1 is :1
        Number is : 2 and cube of the 2 is :8
        Number is : 3 and cube of the 3 is :27
        Number is : 4 and cube of the 4 is :64
        Number is : 5 and cube of the 5 is :125
         */
        /*
        System.out.println("Enter an integer and all cubes from 1 to your integer will be displayed.");
        int cubeNum = sc.nextInt();
        for (int i = 1; i <= cubeNum; i++) {
            System.out.printf("Number is: %d and its cube is: %d\n", i, (long) Math.pow(i, 3));
        }
        */

        /* Write a program in Java to display the n terms of odd natural number and their sum. Read the odd number using the Scanner class

        Test Data
        Input number of terms : 10
        Expected Output :
        The odd numbers are :1 3 5 7 9 11 13 15 17 19
        The Sum of odd Natural Number upto 10 terms : 100
         */
        /*
        System.out.println("Enter the number of terms for display of odd natural numbers from 1 and their sum.");
        int oddTerms = sc.nextInt();
        int oddSum = 0;
        System.out.print("Odd numbers: ");
        for (int i = 1; i <= oddTerms * 2; i += 2) {
            System.out.printf("%d ", i);
            oddSum += i;
        }
        System.out.printf("\nSum of odd natural numbers up to %d terms: %d\n", oddTerms, oddSum);
        */
        /* Write a program in Java to display the pattern like right angle triangle with a number. Read the number using the Scanner class.

        The pattern like :
        1
        12
        123
        1234
         */
        System.out.println("Enter a number to determine the size of the right angle triangle.");
        int triangleNum = getInteger(0, Integer.MAX_VALUE);
        for (int i = 1; i <= triangleNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private static Scanner sc = new Scanner(System.in);

    private static int getInteger(int min, int max) {
        System.out.printf("Enter a number:\n");
        int userInt = sc.nextInt();
        if (userInt < min || userInt > max)
            return getInteger(min, max);
        else
            return  userInt;
    }

    private static long getIntArraySum(int[] numbers) {
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private static long getAverage(int[] numbers) {
        return getIntArraySum(numbers) / numbers.length;
    }
}
