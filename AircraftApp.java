import java.util.Scanner;

public class AircraftApp
{
    private AircraftApp() {
    }
    
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        Aircraft a = new Aircraft();

        System.out.println("Venda de passagens");
        String command;
        do {
            command = in.nextLine();
            if (command.startsWith("show"))
                a.print();
            else if (command.startsWith("sell"))                
                a.sell(command);
            else if (command.startsWith("write"))                
                a.write();
            else if (command.startsWith("read"))                
                a.read();
            else if (!command.startsWith("quit"))
                System.out.println("Comando invalido!");
        } while (!command.startsWith("quit"));
    
    }}
