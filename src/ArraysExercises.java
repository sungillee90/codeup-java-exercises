import java.util.Arrays;


public class ArraysExercises {
    public static void main (String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        // [I@6bdf28bb got the ADDRESS (Targeting memory location/reference)

        // by using Arrays class "STATIC METHODS" .toString will able to handle arrays.
        System.out.println(Arrays.toString(numbers));
        // [1, 2, 3, 4, 5] Returns a string representation of the array.


        // Create an array that holds 3 Person objects.
        Person [] people =  new Person [3];
        // Assign a new instance of the Person class to each element.
        people[0] = new Person ("Sung Lee");
        people[1] = new Person ("Jenny Lee");
        people[2] = new Person ("Douglas Hirsh");


        // Iterate through the array and print out the name of each person in the array.

        // Create an array that holds 3 Person objects.
//        Person [] people = {};

//        String [] objHoldThreePerson = new String[3];
//        String [] objHoldThreePerson = {"Sung", "Jenny", "Lee"};
//        // Assign a new instance of the Person class to each element.
//        class Person {
//            public String firstName;
//            public String lastName;
//            public String carOwned;
//        }
        // Iterate through the array and print out the name of each person in the array.
        for (int i = 0; i < people.length; i++){
            people[i].sayHello();
//            System.out.println(people[i].sayHello());
        }

//        people = addPerson(people, new Person("Dimitri"));

        for (Person person: people) {
//            System.out.println(person.sayHello());
//            System.out.println();
            person.sayHello();
        }

        //Create a static method named addPerson.
        // It should accept an array of Person objects, as well as a single person object to add to the passed array.
        // It should return an array whose length is 1 greater than the passed array,
        // with the passed person object at the end of the array.
//        public static Person[] addPerson(Person[] people, Person person) {
//            Person[] newPeopleArray = new Person[people.length + 1];
//
//                for (int i = 0; i < people.length + 1; i++) {
//                    newPeopleArray[i] = people[i];
//                }
//            // Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
//
//            newPeopleArray[newPeopleArray.length - 1] = person;
//
//            return newPeopleArray;
//
//        }




    }
}
