package absPractices;

public class House {
    // FIELDS
    private String address;
    private String foundation;
    private Room[] rooms;

    // CONSTRUCTOR
    public House(String address, String foundation, Room[] rooms) {
        this.address = address;
        this.foundation = foundation;
        this.rooms = rooms;

    }

    public void switchEverythingOn() {
        for ( Room room : this.rooms) {
            room.switchEverythingOn();
        }
    }
    public void switchEverythingOff() {
        for ( Room room : this.rooms) {
            room.switchEverythingOff();
        }
    }


}
