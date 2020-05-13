package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        // Create a variable of the type Rectangle
        // named box1 and assign it a new instance of the Rectangle class
        // with a width of 4 and a length of 5

        // Fields or variables
        Measurable myShape = new Square(5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        myShape = new Rectangle(2, 3);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        // Creating new instances
//        Rectangle box1 = new Rectangle(5,4);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(3);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

    }
}


// myShape.getLength(); todo because Measureable is interface that ONLY knows what we declared in Measureable interface.
