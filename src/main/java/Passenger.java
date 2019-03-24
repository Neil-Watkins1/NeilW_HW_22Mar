public class Passenger {

    private String name;
    private int bags;
    private boolean flight;
    private int seatNumber;

    public Passenger(String name, int bags, boolean flight) {
        this.name = name;
        this.bags = bags;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }


    public String getName() {
        return this.name;
    }

    public int getBags() {
        return this.bags;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBags(int newBags) {
        this.bags = newBags;
    }

    public boolean getIndicator() {
        return this.flight;
    }

    public void setFlight() {
        this.flight = true;
    }
}
