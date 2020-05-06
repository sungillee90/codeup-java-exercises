import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Factorial();
        System.out.println("Factorial test");
        while (true) {
            Factorial();
            System.out.println("Do you wish to continue? [Y/N]");
            String answer = scan.nextLine();
            if (!answer.toLowerCase().equals("y")) {
                break;
            }
        }

//        getInteger(1, 10);

//        System.out.println("Hello from MethodsEx");
//        // How to test your code, do it for true, false Qs (Boolean)
//        System.out.println(6 == Addition(2,4));
//        System.out.println(0 != Addition(-2,-1));
//        System.out.println("Addition Method = " + Addition(2, 4));
//        System.out.println("Subtraction Method = " + Subtraction(4,2));
//        System.out.println("Multiplication = " + Multiplication(3,4));
//        System.out.println("Division = " + Division(8,0));
//        System.out.println("Modulus = " + Modulus(7,4));
//        System.out.println("getInteger(n,m) = " + getInteger(1,10));
    }
    // Basic Arithmetic
    public static int Addition(int a, int b) {
        return a + b;
    }
    public static int Subtraction(int a, int b) {
        return a - b;
    }
    public static int Multiplication(int a, int b) {
        return a * b;
    }
    public static float Division(float a, float b) {
        if( b == 0) {
            System.out.println("Undefined, so zero is returned");
            return 0;
        }
        return a / b;
    }
    public static int Modulus(int a, int b) {
        return a % b;
    }

    // Recursion
    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = Integer.parseInt(scan.nextLine());

        // how to proceed
        if (userInput < min || userInput > max) {
            System.out.println("Number is outside of the range.");
            return getInteger(min, max);
        } else {
            // how to STOP
            System.out.println("Good job! Number is within the range.");
            return userInput;
        }
    }

//    public static int getInteger(int n, int m) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//
//        int userInput = getInteger(1, 10);
//        int myInput = sc.nextInt();
//
//        if (myInput > 10) {
//            System.out.println("Please enter a number between 1 and 10");
//        }
//        if (myInput < 0) {
//            System.out.println("Please enter a number between 1 and 10");
//        }
//
//        return getInteger(n,m);
//    }


        // how to stop
        // if n reaches to the max, return. integer n reaches integer m.
//        if (n == m) {
//            return;
//        }
//        // how to proceed
//        n = n + 1;
//
//        getInteger(n, m);
//    }


//        for (int min = 1; min <= 10; min++){
//            System.out.println("min is equal to " + min);
//            System.out.println("max is equal to "+ max);
//        }

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//    }

    // Calculate the factorial of a number.
    // VOID bc we will put every code inside of Factorial method.
    public static void Factorial() {
        int userInput = getInteger(1,10);
        // initializing first!
        long sum = 1L;
        System.out.println("userInput = " + userInput);
        for (int fa = userInput; fa > 0; fa--) {
//            System.out.println("fa = " + fa);
            sum *= fa; // sum = sum * fa
        }
        System.out.println("factorial of " + userInput + " = " + sum);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer from 1 to 10.");
//        int userInputInteger = sc.nextInt();
//        System.out.println("Do you want to continue? [yes/no]");
//        String userInputContinue = sc.next();
//        if (userInputContinue.equalsIgnoreCase("YES")) {
//            return Factorial();
//        }
//        return 0;
    }

}
