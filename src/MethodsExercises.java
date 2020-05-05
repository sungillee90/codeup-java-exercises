public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Hello from MethodsEx");
        System.out.println("Addition Method = "+Addition(2, 4));
        System.out.println("Subtraction Method = "+Subtraction(4,2));
        System.out.println("Multiplication = " + Multiplication(3,4));
        System.out.println("Division = " + Division(8,0));
        System.out.println("Modulus = " + Modulus(7,4));
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
            System.out.println("Undefined");
        }
        return a / b;
    }
    public static int Modulus(int a, int b) {
        return a % b;
    }

}
