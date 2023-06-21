
/**
 * A classe Seat armazena os dados de uma poltrona em um voo.
 * 
 * @author marco.mangan@pucrs.br
 */
public class Seat
{
    private Customer passenger;
    private boolean available;
    private boolean blocked;
    
    public Seat() {
        passenger = null;
        available = true;
        blocked = false;
    }
    
    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.passenger = null;
        this.available = available;
    }
    
    public boolean getBlocked() {
        return available;
    }    
}
