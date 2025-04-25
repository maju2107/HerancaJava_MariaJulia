import java.util.Scanner;

public class Estagiario extends Funcionario {
    
    @Override
    public String mostrarDados () {
        return "";
    }

    public void fazerTarefa () {
        Scanner leitura3 = new Scanner(System.in);

        System.out.println("Digite sua tarefa:");
        String tarefaEstagiario = leitura3.nextLine();

    }
}
