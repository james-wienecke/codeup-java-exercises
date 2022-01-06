import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("Mo"), new Person("Curly"), new Person("Larry")};


        for (Person person : people) {
            System.out.println(person.getName());
        }

    }

    private static Person[] addPerson(Person[] people, Person person) {
        Person[] expandedArray = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            expandedArray[i] = people[i];
        }
        expandedArray[expandedArray.length - 1] = person;
        return expandedArray;
    }
}
