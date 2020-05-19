package reDoExercises;

//import static reDoExercises.RedoMethodsExercises.Addition;
// Or use OOP and extends it

public class RedoMethodsTest extends RedoMethodsExercises{

    public static void main(String[] args) {

        System.out.println("Addition(5,3) = " + Addition(5, 3));
        System.out.println("Subtraction(4,2) = " + Subtraction(4, 2));
        System.out.println("Multiplication(4,9) = " + Multiplication(4, 9));
        System.out.println("Division(8,4) = " + Division(8, 4));
        System.out.println("Modulus(8,2) = " + Modulus(8, 2));
        System.out.println("getInteger(1,10) = " + getInteger(1, 10));


    }
}

