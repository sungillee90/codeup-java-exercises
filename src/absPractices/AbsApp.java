package absPractices;

public class AbsApp {
    public static void main(String[] args) {

        Light[] lights = {new Light("fixture"), new Light("lamp")};
        Door[] doors = {new Door("Standard")};

        Light[] lightsSecond = {new Light("fixture")};
        Door[] doorsSecond = {new Door("Standard")};

        // CASCADING MATTERS!!!! ORDER MATTER!
        Room[] rooms = {new Bedroom(15,25, doors, lights, true),
                        new Bedroom(10,15, doorsSecond, lightsSecond, true)};


        House smallHouse = new House("123 Cool Address", "Slab", rooms);

        smallHouse.switchEverythingOff();


    }
}
