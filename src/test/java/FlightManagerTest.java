import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    public FlightManager flightManager;
    public Flight flight1;
    public Flight flight2;
    public Passenger passenger1;
    public Passenger passenger2;
    public Passenger passenger3;
    public Passenger passenger4;
    public ArrayList<Flight> flights;

    @Before
    public void setup(){
        flightManager = new FlightManager();
        flight1 = new Flight(PlaneType.ISLANDER,"BRR", "GLA", "LM0452", "07:15");
        flight2 = new Flight(PlaneType.CESNA152,"KOI", "GLA", "LM0200", "17:15");
        passenger1 = new Passenger("Neil Watkins", 1, false);
        passenger2 = new Passenger("Sarah Watkins", 2, false);
        passenger3 = new Passenger("Bobby Brown", 3, false);
        passenger4 = new Passenger("Captain Morgan", 1, false);
        flights = new ArrayList<Flight>();
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);

    }

    @Test
    public void canCountFlights() {
        assertEquals(0, flightManager.countFlights());
    }

    @Test
    public void canAddFlights() {
    flightManager.addFlight(flight1);
    flightManager.addFlight(flight2);
        assertEquals(2, flightManager.countFlights());
    }

    @Test
    public void canCountbags() {
        flightManager.addFlight(flight1);
        assertEquals(3, flight1.bagCount());

    }

    @Test
    public void canCalculateAllowancePerPassenger() {
        flightManager.addFlight(flight1);
        assertEquals(20, flight1.baggageAllowance());
    }

    @Test
    public void canCalculateBookedBaggageWeight() {
        flightManager.addFlight(flight1);
        assertEquals(30, flight1.baggageWeight());
    }

    @Test
    public void canCalulateRemainingBaggageAllowance() {
        flightManager.addFlight(flight1);
        assertEquals(150, flight1.remainingAllowance());
    }
}
