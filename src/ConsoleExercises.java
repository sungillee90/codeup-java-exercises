import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] arg){
        Scanner myScanner = new Scanner(System.in);

        double pi = 3.14159;
        // "The value of pi is approximately 3.14".
        System.out.printf("The value of %.2f is approximately 3.14%n", pi);
        System.out.printf("The value of pi is approximately %.3f%n", pi);

        System.out.println("New Line use %n %n %n \n \n");

        System.out.println("Enter an integer: ");
        int userInput = Integer.parseInt(myScanner.nextLine());
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        String param1 = myScanner.nextLine();
        String param2 = myScanner.nextLine();
        String param3 = myScanner.nextLine();
        System.out.println("param1: " + param1);
        System.out.println("param2: " + param2);
        System.out.println("param3: " + param3);

        System.out.printf("What's your full name?");
        String userNameInput = myScanner.nextLine();
        System.out.println("You entered: --> \"" + userNameInput + "\" <--");

        System.out.println("Give me the length: ");
        float length = Float.parseFloat(myScanner.nextLine());
        System.out.println("Give me the width: ");
        float width = Float.parseFloat(myScanner.nextLine());

        float area = width * length;
        float perimeter = (width * 2) + (length * 2);

        System.out.println("area = " + area);
        System.out.println("perimeter= " + perimeter);

        System.out.printf("Enter values of length and width of Apex's class: ");
        double userInputLenWidth = myScanner.nextDouble();
        System.out.println("You entered: --> \"" + userInputLenWidth + "\" <--");
        double areaApex = userInputLenWidth * userInputLenWidth;
        System.out.println("The size of your classroom is =  \"" + areaApex + "\" units Square");
        double perimeterApex = userInputLenWidth * 4;
        System.out.println("The perimeter of your classroom is =  \"" + perimeterApex + "\" units");
        double volumeApex = userInputLenWidth * userInputLenWidth * userInputLenWidth;
        System.out.println("The perimeter of your classroom is =  \"" + volumeApex + "\" cubiric units");



    }
}
