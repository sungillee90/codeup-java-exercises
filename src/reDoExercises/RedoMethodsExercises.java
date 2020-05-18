package reDoExercises;

import java.util.Scanner;

public class RedoMethodsExercises {
    public static int Addition (int a, int b) {
        return a + b;
    }
    public static int Subtraction (int a, int b) {
        return a - b;
    }
    public static int Multiplication (int a, int b) {
        return a * b;
    }
    public static int Division (float a, float b) {
        if (b == 0) {
            System.out.println("Division cannot divide by zero, UNDEFINED");
            return 0;
        } else {
            return (int) (a / b);
        }
    }
    public static int Modulus (int a, int b) {
        return a % b;
    }

    public static int getInteger (int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer between 1 and 10");
        int userInput = Integer.parseInt(sc.nextLine());
        if (userInput < min || userInput > max) {
            System.out.println("Please enter within the range!");
            return getInteger(min, max);
        } else {
            System.out.println("Good job! "+ userInput +" is within the range.");
            return userInput;
        }
    }

}
