/** ****************************************************************************
 * Ride.java
 * Kevin Bell
 *
 * This class is associated with Carnival.java
 **************************************************************************** */
package carnival;

public class Ride {

    private String name;
    private int ticketPrice;

    public Ride(String name, int ticketPrice) {
        this.name = name;
        this.ticketPrice = ticketPrice;
    } //end Ride constructor

    public String getName() {
        return name;
    } //end getName

    public int getTicketPrice() {
        return ticketPrice;
    } //end getTicketPrice
} //end class Ride
