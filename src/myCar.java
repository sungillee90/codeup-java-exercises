// TODO practice creating classes
public class myCar {
    static String ownerLastName = "Lee";
    // Creating Fields
    public String make;
    public String model;
    public String color;
    private int horsePower;
    private int torque;
    public boolean isManual;

    // Constructors
    public myCar (String mk, String mod, String color, int horsePower, int torque, boolean isManual) {
        this.make = mk;
        this.model = mod;
        this.color = color;
        this.horsePower = horsePower;
        this.torque = torque;
        this.isManual = isManual;
    }

    public String askWhatYourCar() {
        if (this.isManual) {
            return String.format("It is %s %s with %s color. It has %d horsepower, and %d torque.", make, model, color, horsePower, torque);
        } else {
            return ("It is not a manual tranny. :(");
        }
    }
    public static void main(String[] args) {
        myCar moongchi = new myCar("BMW", "M2", "white", 365,369,true);
        myCar mini = new myCar("MINI", "Cooper S", "gray",201,210,true);

        System.out.println("myCar.ownerLastName = "+ myCar.ownerLastName);
        System.out.println(moongchi.askWhatYourCar());
        System.out.printf(mini.askWhatYourCar());
//            // created 2 instances for each case
//            myCar moongchi = new myCar();
//            moongchi.make = "BMW";
//            moongchi.model = "M2";
//            moongchi.horsePower = 365;
//            moongchi.torque = 369;
//            moongchi.isManual = true;
//
//            myCar mini = new myCar();
//            mini.make = "MINI";
//            mini.model = "Cooper S";
//            mini.horsePower = 201;
//            mini.torque = 210;
//            mini.isManual = true;
//
//            System.out.println(myCar.ownerLastName);
//            System.out.println(moongchi.askWhatYourCar());
//            System.out.printf(mini.askWhatYourCar());


    }

}
