import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Revisão com objeto Aircraft.
 * 
 * @author marco.mangan@pucrs.br
 * @see https://www.flyporter.com/en/about-porter/our-fleet/embraer-e195-e2
 */
public class Aircraft
{
    private Seat[][] seats;

    public Aircraft() {
        this.seats = new Seat[9][4];

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                this.seats[i][j] = new Seat();
            }
        }
    }
    
    public void sell(String command) {
        System.out.println(command);
        String choice = command.substring(5);
        System.out.println(choice);
        
        char letter = choice.charAt(0);
        System.out.println(letter);
        
        int number = Integer.parseInt(choice.substring(1));        
        System.out.println(number);

        int line;
        int column;
        
        switch(letter) {
            case 'A' :
            case 'a' :
                        column = 0;
                        break;
            case 'B' :
            case 'b' :
                        column = 1;
                        break;
            case 'C' :
            case 'c' :
                        column = 2;
                        break;
            case 'D' :
            case 'd' :
                        column = 3;
                        break;
            default:
                        column = -1;
        }
        
        line = number - 1;
        if (this.seats [line][column].getAvailable())
            System.out.println("Assento OCUPADO!");
        else {
            this.seats[line][column].setAvailable(false);        
            int next;
            if (column == 0 || column == 2) {
                next = column + 1;
            } else {
                next = column - 1;
            }
            //if (!this.seats[line][next]) {
            //    System.out.println("Deseja reservar o assento ao lado? (S/n)");
            // }
        }
    }
    public void print() {
        System.out.println("POA -> CGH");
        System.out.println("03/06/2023 6h TAM 3434\n");
        
        System.out.println("    A  B     C  D");      
        // percorre cada linha
        for (int i = 0; i < this.seats.length; i++) {
            // mostra uma linha matriz
            System.out.printf("%2d ", i + 1);
            for (int j = 0; j < this.seats[i].length; j++) {            
                if (this.seats[i][j].getAvailable())
                    System.out.print("[O]");
                else
                    System.out.print("[ ]");
                if (j == 1) {
                    System.out.print("   ");
                }
            }
            System.out.printf(" %2d%n", i + 1);
            if (i == 11 || i == 12) {
                System.out.println();
            }
        }
        System.out.println("    A  B     C  D");      
        
    }
    public void write() throws Exception {
        PrintStream file = new PrintStream(new FileOutputStream("seats.txt"));
        for (int i = 0; i < this.seats.length; i++) {
            for (int j = 0; j < this.seats[i].length; j++) {            
                    file.print(this.seats[i][j]+" ");
            }
            file.println();
        }
        file.close();
    }
    
    public void read() throws Exception {
        FileInputStream file = new FileInputStream("seats.txt");
        Scanner in = new Scanner(file);
        for (int i = 0; i < this.seats.length; i++) {
            for (int j = 0; j < this.seats[i].length; j++) {   
                    
                    this.seats[i][j] = new Seat();
                    this.seats[i][j].setAvailable(in.nextBoolean());
            }
        }
        in.close();
        file.close();            
    }
    

}
