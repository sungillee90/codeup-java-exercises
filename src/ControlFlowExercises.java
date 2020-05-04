import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String arg[]) {
        // Loop Basic

        // While loop

//        int i = 5;
//        //i is less than or equal to 15
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        // Do While loop

//        int counter = 0;
//        do {
//            System.out.println("counter = " + counter);
//            counter += 2;
//        } while (counter <= 100);
//
//            int counter = 100;
//            do {
//                System.out.println(counter);
//                counter -= 5;
//            } while (counter >= -10);

    //                if (counter % 5 == 0) {
    //                System.out.println("counter = " + counter);
    //                }
    //                counter--;
    //            } while (counter >= -10);

//        long counter = 2L;
//        do {
//            System.out.println(counter);
//            counter *= counter;
////            if (counter % 2 == 0) {
////                System.out.println("counter = " + counter * counter);
////            }
////            counter++;
//        } while (counter < 1000000);

        // For loop
//        for (int i = 100; i >= -10; i-= 5) {
//            System.out.println("i = " + i);
//        }
        
//        for (long counter = 2L; counter < 1000000L; counter *= counter){
//            System.out.println("counter = " + counter);
//        }
        
        // Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 ==0) { // or ( i % 15 == 0 )
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

//        boolean userContinues = true;
//        do {
//            System.out.println("Enter an integer that you would like to go up to: ");
//            int userInput = Integer.parseInt(sc.next());
//            System.out.println();
//            System.out.println("Here is you table!");
//            System.out.println();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | --------| -----");
//            for(int i = 1; i <= userInput; i++) {
//                System.out.format("%-6d", i);
//                System.out.print(" | ");
//                System.out.format("%-7d",i * i); // suqared
//                System.out.print(" | ");
//                System.out.format("%-6d",i * i * i);
//                System.out.println();
//            }
//            System.out.println("Do you want to continue? [y/n]");
//            String userResponse = sc.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//
//        } while (userContinues);
            //        System.out.println("Enter an integer that you would like to go up to: ");
            //        int userInput = Integer.parseInt(sc.next()); // scanner.nextInt() ALSO WORKS
            //        System.out.println("userInput = " + userInput);
            //        System.out.println();
            //        System.out.println("Here is you table!");

            //        System.out.println("Do you want to continue? [y/n]");
            //        String userInputContinue = sc.next();
                    // if statement and run the table.
            //        boolean confirmation = userInputContinue.equals("y");
            //        System.out.println("confirmation = " + confirmation);

            //        int number;
            //        int square;
            //        int cube;
            //        System.out.println("Number\tSquare\tCube");
            //
            //        for (number = 1; number <= userInput; number++) {
            //            square = number * number;
            //            cube = number * square;
            //            System.out.println(number+"\t"+square+"\t"+cube);
            //        }

        // 4. Convert given number grades into letter grades.

        boolean anotherGrade = true;

        do {
            System.out.print("Please enter a numerical Grade from 0 to 100 ");

            int numericGrade = sc.nextInt();

            if (numericGrade >= 88) {
                System.out.println("A");
            } else if (numericGrade >= 80) {
                System.out.println("B");
            } else if (numericGrade >= 67) {
                System.out.println("C");
            } else if (numericGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Do you wish to enter a new grade? ");
            String userResponse = sc.next();
            if (!userResponse.equalsIgnoreCase("y")){
                anotherGrade = false;
            }
        } while (anotherGrade);


    }
}
