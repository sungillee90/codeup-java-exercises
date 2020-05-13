package shapes;

public class Square extends Quadrilateral {
    //todo CONSTRUCTOR!
    // since Square must have same width and length, pass only one
    public Square(double side) {
        super(side, side);
    }

    // BC. length and width must be the same, so return parents's length and width.
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }
    public void setWidth(double width) {
        this.setLength(width);
    }

    public double getPerimeter() {
        System.out.println("getPerimeter from Sq");
        return 4 * super.length;
    }
// @Override means annotation
    public double getArea() {
        System.out.println("getArea from Sq");
        return Math.pow(super.width, 2);
    }

//                    //    public double side;
//
//                        //Square should define a constructor
//                        //that accepts one argument, side, and calls the parent's constructor
//                        //to set both the length and width to the value of side.
//                        public Square (double side) {
//                            super(side,side); // new Rectangle (side, side)
//                    //        this.side = side;
//                        }
//
//                        public double getArea () {
//                            return super.length * super.length;
//                        }
//
//                        public double getPerimeter () {
//                            return 4 * super.width;
//                        }
//                    //    public Square (double length, double width, double side) {
//                    //        super(length, width);
//                    //        this.side = side;
//                    //    }
}
