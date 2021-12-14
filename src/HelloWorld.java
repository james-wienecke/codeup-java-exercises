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
        double myNumber;
        // need to initialize variables before use
//        System.out.println(myNumber);
        // long, int, and short are integers
        myNumber = 123d;
        // float and double are floating point numbers, and we can't assign integers to floats or floats to integers
        myNumber = 1.23d;
        System.out.println(myNumber);

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
    }
}
