import shapes.Circle;

import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {

        // To define an array, we establish the data type, use square brackets,
        // establish the variable name, and then instantiate the array with the
        // length inside the square brackets.
        String[] fruits = new String[4];

        fruits[0] = "orange";
        fruits[1] = "apple";
        fruits[2] = "banana";
        fruits[3] = "grapefruit";

        // Output = null since a String is an object reference, the default value is null.
//        System.out.println(fruits[4]);

        boolean[] surveyAnswers = {true, false, true, false, false, true, false};

        System.out.println(surveyAnswers.length);

        // ITERATING
//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i]);
//        }

        // ENHANCED FOR LOOP
        // JAVASCRIPT SYNTAX
//        for (let element of array) {}

        // JAVA
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits);

        // The Arrays Class

        // Arrays.toString() - returns a string with the elements in the array.
        System.out.println(Arrays.toString(fruits));

        // Arrays.fill() - void, does not return anything, just does the thing.
        String[] stickers = new String[6];
        Arrays.fill(stickers, "(>^.^)> <(^.^<)");
        System.out.println(Arrays.toString(stickers));

        // Arrays.equals() - returns a boolean. Checks for both element values and length of the array.
        String[] extraFruits = {"orange", "apple", "banana", "grapefruit"};
        System.out.println(Arrays.equals(fruits, extraFruits));

        // Arrays.copyOf() - returns a copy of the array.
        String[] fruitClones = Arrays.copyOf(extraFruits, 10);
        fruitClones[9] = "pineapple";
        System.out.println(Arrays.toString(fruitClones));

        // Arrays.sort() - NO RETURN. Just sorts the elements in the array.
        Arrays.sort(fruits);

        System.out.println(Arrays.toString(fruits));


        // 2D ARRAYS

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

// access the first element in the second row
        System.out.println(matrix[1][0]); // 4
// the last element in the first row
        System.out.println(matrix[0][2]); // 3
// the first element in the last row
        System.out.println(matrix[2][0]); // 7

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
        }

        System.out.println("+---+---+---+");


        // Last minute note.. You can even create arrays of objects!
        Circle[] circles = {new Circle(4), new Circle(5)};

        System.out.println(circles[0].getArea());

    }
}