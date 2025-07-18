package demo.Entities;

public class Guest {
    private int guestId;
    private String name;

    public Guest() {
    }

    public Guest(int guestId, String name) {
        this.guestId = guestId;
        this.name = name;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}