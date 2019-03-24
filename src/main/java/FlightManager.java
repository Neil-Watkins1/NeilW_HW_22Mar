import java.util.ArrayList;

public class FlightManager {

   private ArrayList<Flight> flights;

   public FlightManager(){
       this.flights = new ArrayList<Flight>();
   }


    public int countFlights() {
       return this.flights.size();
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }


}
