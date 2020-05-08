package shapes;

public class Circle {

    private double radius;

    // there is NO circle without aRadius
    // Constructor
    public Circle(double aRadius) {
        this.radius = aRadius;
    }

    // getter 라서
    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

}
