/**
 * A classe Customer armazena dados de um cliente.
 * 
 * @author marco.mangan@pucrs.br
 */
public class Customer
{
    private String name;
    private String cpf;
    
    public Customer(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }
    
    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }
}
