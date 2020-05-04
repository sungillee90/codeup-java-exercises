import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String arg[]){
        // Loop Basic

        // While loop
        
//        int i = 5;
//        //i is less than or equal to 15
//        while (i <= 15) {
//            System.out.println("i = " + i);
//            i++;
//        }

        // Do While loop
//            int counter = 100;
//            do {
//                if (counter % 5 == 0) {
//                System.out.println("counter = " + counter);
//                }
//                counter--;
//            } while (counter >= -10);
//        int counter = 2;
//        do {
//            if (counter % 2 == 0) {
//                System.out.println("counter = " + counter * counter);
//            }
//            counter++;
//        } while (counter < 1000000);

//        // For loop
//        for (int i = 5; i < 16; i++) {
//            System.out.println("i = " + i);
//        }
        // Fizzbuzz
//        for (int i = 1; i <= 100; i ++) {
//            if (i % 3 == 0 && i % 5 ==0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if( i % 5 == 0) {
//                System.out.println("Buzz");
//            } else{
//                System.out.println(i);
//            }
//        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer that you would like to go up to: ");
        int userInput = Integer.parseInt(sc.next());
        System.out.println("userInput = " + userInput);

        System.out.println("Here is you table!");

        System.out.println("Do you want to continue? [y/n]");
        String userInputContinue = sc.next();
        // if statement and run the table.
        boolean confirmation = userInputContinue.equals("y");
        System.out.println("confirmation = " + confirmation);

        int number;
        int square;
        int cube;
        System.out.println("Number\tSquare\tCube");

        for (number = 1; number <= userInput; number++) {
            square = number * number;
            cube = number * square;
            System.out.println(number+"\t"+square+"\t"+cube);
        }

    }
}
