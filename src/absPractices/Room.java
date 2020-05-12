package absPractices;

import shapes.Rectangle;

public abstract class Room extends Rectangle {
    // light, doors, windows, outlets.
    private Door[] doors;
    private Light[] lights;

    public Room(float length, float width, Door[] doors, Light[] lights) {
        super(length, width);
        this.doors = doors;
        this.lights = lights;
    }

    public void switchEverythingOn() {
        // OPEN all the DOORS
        for (Switchable item : doors) {
            item.switchOn();
        }
        // Turn ON all the lights.
        for (Switchable item : lights) {
            item.switchOn();
        }
    }

    public void switchEverythingOff() {
        // CLOSE all the DOORS
        for (Switchable item : doors) {
            item.switchOff();
        }
        // Turn OFF all the lights.
        for (Switchable item : lights) {
            item.switchOff();
        }
    }

}
