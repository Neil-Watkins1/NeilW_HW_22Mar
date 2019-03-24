import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    public Passenger passenger1;
    public Passenger passenger2;
    public Passenger passenger3;
    public Passenger passenger4;


    @Before
    public void setup() {
        passenger1 = new Passenger("Neil Watkins", 1, false);
        passenger2 = new Passenger("Sarah Watkins", 2, false);
        passenger3 = new Passenger("Bobby Brown", 3, false);
        passenger4 = new Passenger("Captain Morgan", 1, false);

    }

    @Test
    public void passengerHasName() {
        assertEquals("Neil Watkins", passenger1.getName());
    }

    @Test
    public void passengerCanChangeName() {
        passenger1.setName("Frank Spencer");
        assertEquals("Frank Spencer", passenger1.getName());
    }

    @Test
    public void passengerHasBags() {
        assertEquals(2, passenger2.getBags());
    }

    @Test
    public void passengerCanChangeBags() {
        passenger2.setBags(3);
        assertEquals(3, passenger2.getBags());
    }

    @Test
    public void passengerHasFlightIndicator() {
        assertEquals(false, passenger1.getIndicator());

    }

    @Test
    public void canChangeFlightIndicator() {
        passenger1.setFlight();
        assertEquals(true, passenger1.getIndicator());

    }
}

