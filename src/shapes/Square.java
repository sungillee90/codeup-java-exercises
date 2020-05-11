package shapes;

// Create a class named Square, also inside of shapes,
// that extends Rectangle
public class Square extends Rectangle {

    public float side;

    //Square should define a constructor
    //that accepts one argument, side, and calls the parent's constructor
    //to set both the length and width to the value of side.
    public Square (float side) {
        super(side,side);
        this.side = side;
    }

    public float getArea () {
        return side * side;
    }

    public float getPerimeter () {
        return 4 * side;
    }
//    public Square (float length, float width, float side) {
//        super(length, width);
//        this.side = side;
//    }
}
