import java.util.Scanner;

public class Desenvolvedor extends Funcionario {  

    public Desenvolvedor(){};
    
    @Override
    public String mostrarDados () {
        return "";
    }

    public void programar () {
        Scanner leitura2 = new Scanner(System.in);

        System.out.println("Digite sua linguagem de preferência:");
        String linguagemProgramacao = leitura2.nextLine();

    }
}
