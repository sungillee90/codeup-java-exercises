// TODO practice creating classes
public class myCar {

    // Creating Fields
    public String make;
    public String model;
    public int horsePower;
    public int torque;
    public boolean isManual;

    public String askWhatYourCar() {
        return String.format("It is %s %s. It has %d horsepower, and %d torque.", make, model, horsePower, torque);
    }
    public static void main(String[] args) {
        // created 2 instances for each case
        myCar moongchi = new myCar();
        moongchi.make = "BMW";
        moongchi.model = "M2";
        moongchi.horsePower = 365;
        moongchi.torque = 369;
        moongchi.isManual = true;

        myCar mini = new myCar();
        mini.make = "MINI";
        mini.model = "Cooper S";
        mini.horsePower = 201;
        mini.torque = 210;
        mini.isManual = true;

        System.out.println(moongchi.askWhatYourCar());
        System.out.printf(mini.askWhatYourCar());

    }

}
