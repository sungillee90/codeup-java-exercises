import java.util.Arrays;

public class ArraysExercises {
    public static void main (String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // [I@6bdf28bb got the ADDRESS
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5] Returns a string representation of the array.
        // by using Arrays class "STATIC METHODS" .toString will able to handle arrays.

        // Create an array that holds 3 Person objects.
        // Assign a new instance of the Person class to each element.
        // Iterate through the array and print out the name of each person in the array.

        // Create an array that holds 3 Person objects.
//        String [] objHoldThreePerson = new String[3];
        String [] objHoldThreePerson = {"Sung", "Jenny", "Lee"};
        // Assign a new instance of the Person class to each element.
        class Person {
            public String firstName;
            public String lastName;
            public String carOwned;
        }
        // Iterate through the array and print out the name of each person in the array.
        for (int i = 0; i < objHoldThreePerson.length; i++){
            System.out.println("objHoldThreePerson[i] = " + objHoldThreePerson[i]);
        }

        //Create a static method named addPerson.
        // It should accept an array of Person objects, as well as a single person object to add to the passed array.
        // It should return an array whose length is 1 greater than the passed array,
        // with the passed person object at the end of the array.
//        static String addPerson =




    }
}
