

import java.util.ArrayList;

public class Flight {

    private String destination;
    private String origin;
    private String flightNumber;
    private String departureTime;
    private PlaneType plane;
    private ArrayList<Passenger> passenger;




    public Flight(PlaneType plane, String destination, String origin, String flightNumber,String departureTime){
        this.plane = plane;
        this.destination = destination;
        this.origin = origin;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.passenger = new ArrayList<Passenger>();
    }

    public String getDestination() {
       return this.destination;

    }

    public String getOrigin() {
        return this.origin;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getFlightDepTime() {
        return this.departureTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }


    public void setNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public PlaneType getPlane() {
        return plane;
    }

    public void setPlane(PlaneType plane) {
        this.plane = plane;

    }

    public int passengerCount() {
        return this.passenger.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.passenger.size() < plane.getCapacity())
        this.passenger.add(passenger);
        passenger.setFlight();
    }

    public int availableSeats() {
        return ( plane.getCapacity() - this.passenger.size());
    }

    public int bagCount() {
        int bagTotal = 0;
        for (Passenger passenger : this.passenger) {
            bagTotal += passenger.getBags();
        }
        return bagTotal;
    }

    public int baggageAllowance() {
     return ( plane.getWeight() / plane.getCapacity());
    }

    public int baggageWeight() {
        return bagCount() * 10;
    }

    public int remainingAllowance() {
        return( plane.getWeight() - baggageWeight());
    }
}
