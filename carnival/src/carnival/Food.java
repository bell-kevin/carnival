/** ****************************************************************************
 * Food.java
 * Kevin Bell
 *
 * This class is associated with Carnival.java
 **************************************************************************** */
package carnival;

public class Food {

    private String name;
    private int ticketPrice;

    public Food(String name, int ticketPrice) {
        this.name = name;
        this.ticketPrice = ticketPrice;
    } //end Food constructor

    public String getName() {
        return name;
    } //end getName

    public int getTicketPrice() {
        return ticketPrice;
    } //end getTicketPrice
} //end class Food
