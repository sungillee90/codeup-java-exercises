// TODO 3. Create an input validation class
package util;

import java.util.Scanner;

// create a class named Input that has a private property named scanner.
public class Input {
    // Creating fields (properties)
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Type some message: ");
        return scanner.nextLine();
    }

    // Do you want to continue? Yes or No 할수있다. 이거 들고가서
    public boolean yesNo() {
        System.out.println("Select [y/n]");
        String answer = scanner.nextLine();
        return (answer.equals("y") ? true : false);
    }

    public int getInt(int min, int max) {
        System.out.println("Give me a number between " + min + " and " + max);
        int userNumber = Integer.parseInt(scanner.nextLine()); // do NOT use nextInt();
        if (userNumber < min || userNumber > max) {
            // recursion or use FOR Loop to give user opportunity
            System.out.println("Please try again keep in the range");
            return getInt(min, max);
        }
        return userNumber;
    }

    public int getInt() {
        System.out.println("Give me an integer");
        return Integer.parseInt(scanner.nextLine());
    }

    public double getDouble(double min, double max) {
        System.out.println("Give me a decimal between " + min + " and " + max);
        double userNumber;
        try {
            userNumber = Double.valueOf(scanner.nextLine()); // do NOT use nextInt();
        } catch (NumberFormatException e) {
            return getDouble(min, max); // try getDouble() execution again
        }
        if (userNumber < min || userNumber > max) {
            // recursion or use FOR Loop to give user opportunity
            System.out.println("Please try again keep in the range");
            return getDouble(min, max);
        }
        return userNumber;
    }

    public double getDouble() {
        System.out.println("Give me an decimal: ");
        try {
            return Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            return getDouble(); // try getDouble() execution again
        }

    }

}
