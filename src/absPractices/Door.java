package absPractices;

public class Door implements Switchable {
    private String type;
    // door is Open or not
    private boolean isOpen = false;

    // INSTANCE

    public Door(String type) {
        this.type = type;
    }


    public boolean getState() {
        return isOpen;
    }

    public void switchOn() {
        System.out.println(this.type + " door is being opended.");
        this.isOpen = true;
    }

    public void switchOff() {
        System.out.println(this.type + " door is being closed.");
        this.isOpen = false;
    }
}


// both DOOR and LIGHT Boolean are switchALBE so use the interface