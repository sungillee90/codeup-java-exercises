package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    // CONSTRUCTOR
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // TODO methods for getting the length and width.
    // getter for Length
    public double getLength() {
        return this.length;
    }
    // getter for Width
    public double getWidth() {
        return this.width;
    }

    // abstract methods for setting the length and width.
    // TODO SETTERS most likely VOID!!!
    // ABS cannot have BODY     todo  ( ) <- 안에 파라미터를 넣어야한다!
    public abstract void setLength(double length);
    public abstract void setWidth(double width);


}
