import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlightTest {


        public Flight flight1;
        public Flight flight2;
        public Passenger passenger1;
        public Passenger passenger2;


    @Before
    public void setup(){
        flight1 = new Flight(PlaneType.ISLANDER,"BRR", "GLA", "LM0452", "07:15");
        flight2 = new Flight(PlaneType.CESNA152,"KOI", "GLA", "LM0200", "17:15");
        passenger1 = new Passenger("Neil Watkins", 1, false);
        passenger2 = new Passenger("Sarah Watkins", 2, false);
    }

    @Test
    public void flightHasDestination() {
        assertEquals("BRR", flight1.getDestination());

    }

    @Test
    public void flightHasOrigin() {
        assertEquals("GLA", flight1.getOrigin());
    }

    @Test
    public void flightHasNumber() {
        assertEquals("LM0452", flight1.getFlightNumber());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("07:15", flight1.getFlightDepTime());
    }

    @Test
    public void flightCanChangeDestination() {
        flight1.setDestination("ILY");
        assertEquals("ILY", flight1.getDestination());
    }

    @Test
    public void flightCanChangeOrigin() {
        flight1.setOrigin("CAL");
        assertEquals("CAL", flight1.getOrigin());
    }

    @Test
    public void flightCanChangeNumber() {
        flight1.setNumber("LM0100");
        assertEquals("LM0100", flight1.getFlightNumber());
    }

    @Test
    public void flightCanChangeTime() {
        flight1.setDepTime("15:30");
        assertEquals("15:30", flight1.getFlightDepTime());
    }

    @Test
    public void flightHasPlane() {
        assertEquals(PlaneType.ISLANDER, flight1.getPlane());
    }

    @Test
    public void flightCanChangePlane() {
        flight1.setPlane(PlaneType.CONCORD);
        assertEquals(PlaneType.CONCORD, flight1.getPlane());
    }

    @Test
    public void flightStartsEmpty() {
        assertEquals(0, flight1.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.passengerCount());
    }

    @Test
    public void canChangePassengerFlightIndicator() {
        flight1.addPassenger(passenger1);
        assertEquals(true, passenger1.getIndicator());
    }

    @Test
    public void canCountBags() {
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(3, flight1.bagCount());
    }

    @Test
    public void canCheckSeatsAvailable() {
        flight1.addPassenger(passenger1);
        assertEquals(8, flight1.availableSeats());
    }

    @Test
    public void addPassengerSeatAvailable() {
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(2, flight1.passengerCount());
    }

    @Test
    public void cannotAddPassengerNoSeatAvailable() {
        flight2.addPassenger(passenger2);
        flight2.addPassenger(passenger1);
        assertEquals(1, flight2.passengerCount());

    }
}

