package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width){
        super(length, width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        System.out.println("getPerimeter from Rect");
        return (2 * this.length) + (2 * this.width);
    }
    public double getArea() {
        System.out.println("getArea from Rect");
        return (this.length * this.width);
    }


//                        // It should have protected properties for both length and width.
//                        // Protected Properties or fields.
//                        protected double length;
//                        protected double width;
//
//                        // Rectangle should define a constructor
//                        // that accepts two numbers for length and width, and sets those properties.
//                        public Rectangle (double length, double width) {
//                            this.length = length;
//                            this.width = width;
//                        }
//
//                        public double getArea () {
//                            return this.length * this.width;
//                        }
//
//                        public double getPerimeter () {
//                            return (2 * this.length) + (2 * this.width);
//                        }


}
