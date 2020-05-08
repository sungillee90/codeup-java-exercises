package shapes;

// imported from our package
// COOL!
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle aCircle;
//        Circle myCircle = new Circle(input.getDouble());


        while(input.yesNo()){
            aCircle = new Circle(input.getDouble());
            System.out.println("Circle Area: " + aCircle.getArea());
            System.out.println("Circle Circum: " + aCircle.getCircumference());
        }
        System.out.println(Circle.getCountCircle());

//        System.out.println("Circle Area: " + myCircle.getArea());
//        System.out.println("Circle Circum: " + myCircle.getCircumference());
    }
}
