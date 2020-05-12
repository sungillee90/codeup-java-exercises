package absPractices;

public class Light implements Switchable{
    private String type;
    // light turn on and off
    private boolean isOn = false;

    // INSTANCE

    public Light(String type) {
        this.type = type;
    }

    public boolean getState() {
        return isOn;
    }

    public void switchOn() {
        System.out.println(this.type + " light is being switched on.");
        this.isOn = true;
    }

    public void switchOff() {
        System.out.println(this.type + " light is being switched off.");
        this.isOn = false;
    }
}
