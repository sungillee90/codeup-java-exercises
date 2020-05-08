package shapes;

// imported from our package
// COOL!
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        Circle myCircle = new Circle(input.getDouble());

        System.out.println("Circle Area: " + myCircle.getArea());
        System.out.println("Circle Circum: " + myCircle.getCircumference());
    }
}
