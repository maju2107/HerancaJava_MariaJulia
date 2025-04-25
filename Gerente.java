import java.util.Scanner;

public class Gerente extends Funcionario {

    public Gerente(){};

    @Override
    public String mostrarDados () {
        return "";
    }

    public void realizarReuniao(){
        Scanner leitura1 = new Scanner(System.in);

        System.out.println("Defina o tema da reunião:");
        String temaReuniao = leitura1.nextLine();
        
        System.out.println("Defina a data da reunião:");
        String dataReuniao = leitura1.nextLine();
        
        System.out.println("Defina o horário da reunião:");
        String horarioReuniao = leitura1.nextLine();

        String[] array = {temaReuniao, dataReuniao, horarioReuniao};

    }
    
}
