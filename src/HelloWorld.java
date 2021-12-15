public class HelloWorld {
    public static void main (String[] args) {
        System.out.print("Hewwow, ");
        System.out.println("World!");

        int myFavoriteNumber = 26;
        System.out.println(myFavoriteNumber);
        String myString = "I love static typing.";
        System.out.println(myString);
//        can't change variable type after declaration
//        myString = 'a';
//        myString = 3.14159;
        float myNumber;
        // need to initialize variables before use
//        System.out.println(myNumber);
        // long, int, and short are integers
        myNumber = 123f;
        // float and double are floating point numbers, and we can't assign integers to floats or floats to integers
        myNumber = 1.23f;
        System.out.println(myNumber);

        // ways to make a float:
        // 1. = 1f
        // ways to make a double:
        // 1. = 1d
        // 2. 1.0

        // using a literal suffix:
        // floating point type
        // float: 'f'
        // double: 'd'
        // integer type
        // long: 'l' or 'L'
        int myInt = 5;
        // longs can always fit integers, so there is implicit conversion
        long myLong = 100 + myInt;
        System.out.println(myLong);

        // java prefers doubles to floats
//        float myFloat = .05; no
        float myFloat = .05f; // yes
        System.out.println(myFloat);
        // floats have less precision than doubles
        myFloat = 3.141592653f;         // lossy conversion to float
        System.out.println(myFloat);    // 3.1415927
        double myDouble = 3.141592653d; // d here is unnecessary
        System.out.println(myDouble);   // 3.141592653

        // post increment: value is resolved and then after is incremented
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        // pre increment: value is incremented and then after is resolved
//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);

        // class (lowercase) is a reserved keyword. can't use it outside of its reserved use
//        long class = 1;
        // capital Class can be used but why would you???
        long Class = 1;
        System.out.println(Class);

        // a clever cast but it doesn't work. this compiles, but throws a runtime exception
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

        // this fails in compilation
//        int three = (int) "three";

        // the two are different because in the first example, the value and type of o is not determined until the code
        // is executed. in the second example, the assignment is evaluated during compilation as it is assigned to be
        // a string literal being cast to an int

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        /* What happens if you assign a value to a numerical variable that is larger (or smaller)
        than the type can hold? What happens if you increment a numeric variable past the type's capacity?

        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the
        maximum value for the int type.
        */

        int bigNum = Integer.MAX_VALUE;
        System.out.println(++bigNum);

        // numerical value assignments higher than the capacity of numerical variables will cause a compiler
        // error warning about lossy conversion.

        // if a value is pushed past its max or min, we get overflow/underflow and the value will rollover to
        // the other extremes
    }
}
