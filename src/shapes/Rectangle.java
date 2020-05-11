package shapes;

public class Rectangle {
    // It should have protected properties for both length and width.
    // Protected Properties or fields.
    protected float length;
    protected float width;

    // Rectangle should define a constructor
    // that accepts two numbers for length and width, and sets those properties.
    public Rectangle (float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getArea () {
        return this.length * this.width;
    }

    public float getPerimeter () {
        return (2 * this.length) + (2 * this.width);
    }


}
