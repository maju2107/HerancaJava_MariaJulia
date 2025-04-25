import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>(); 
        Scanner leitura = new Scanner(System.in);
        int opcao;
        int i;
       

        do {
                MenudeOpções();

                System.out.print("Digite o número da opção desejada: ");
                opcao = leitura.nextInt();
        
                switch(opcao){
                    case 1:

                        System.out.println("Digite a quantidade de funcionários que você deseja cadastrar:"); 
                        int quantidadeCadastroFuncionario = leitura.nextInt();

                        for( i = 0; i<quantidadeCadastroFuncionario; i++){

                            Funcionario funcionario = new Funcionario();
                            System.out.println("-----------------------------------------------------------------------");
                            leitura.nextLine();
                            System.out.println("Digite o nome do funcionário " +(i+1)+":" ); 
                            funcionario.setNome(leitura.nextLine());
                            leitura.nextLine();
                
                
                            System.out.println("Digite o cpf do funcionário " +(i+1)+":"); 
                            funcionario.setCpf(leitura.nextLine());
                            leitura.nextLine();

                            System.out.println("Digite a data de nascimento do funcionário " +(i+1)+":"); 
                            funcionario.setDataNascimento(leitura.nextLine());
                            leitura.nextLine();

                            System.out.println("Digite o departamento do funcionário " +(i+1)+":"); 
                            funcionario.setDepartamento(leitura.nextLine());
                            leitura.nextLine();

                            System.out.println("Digite o salário do funcionário " +(i+1)+":"); 
                            funcionario.setSalario(leitura.nextFloat());
                            leitura.nextLine();
                            
                            listaFuncionario.add(funcionario);
                
                        }
                        System.out.println("Funcionário(s) cadastrado(s) com sucesso!;) ");
                    break; 

                    case 2:

                        for ( i = 0; i < listaFuncionario.size(); i++) {
                            Funcionario funcionario = (Funcionario) listaFuncionario.get(i);
                            System.out.println("-----------------------------------------------------------------------");
                            System.out.println("Dados dos funcionários:");
                            System.out.println("Funcionário "+(i+1)+ " \nNome: " + funcionario.getNome() + " \nCPF: " + funcionario.getCpf() + " \nData de nascimento: " + funcionario.getDataNascimento()+ " \nDepartamento: " + funcionario.getDepartamento() + " \nSalário: " + funcionario.getSalario());
                        }  
                       
                    break; 

                    case 3:

                        System.out.println("Digite os seguintes códigos para escolher o tipo de funcionário: \n1 - Gerente \n2 - Desenvolvedor \n3 - Estagiário");
                        int escolha = leitura.nextInt();
                        if(escolha == 1){
                            System.out.println("Você é um Gerente! \nVocê pode realizar reuniões!!!");
                            Gerente gerente = new Gerente();
                            gerente.realizarReuniao();
                            
                            

                        } if(escolha == 2){
                            System.out.println("Você é um Desenvolvedor! \nVocê pode programar (tadinho) !!!");
                            Desenvolvedor desenvolvedor = new Desenvolvedor();
                            desenvolvedor.programar();
                            

                        } if(escolha == 3){
                            System.out.println("Você é um Estagiário! \nVocê pode fazer tarefas!!!");
                            Estagiario estagiario = new Estagiario();
                            estagiario.fazerTarefa();

                        }
                    break; 

                    case 4:
                        System.out.println("Você saiuu...:");     
                    break; 

                    default:
                        System.out.println("Opção não encontrada dentre as fornecidas pelo sistema!");     
                    break;

                }
            }while(opcao!= 4);
                
    }
    
        private static void MenudeOpções(){
            System.out.println("Bem-vindo ao sistema de Cadastro de funcionários!: ");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1 - Cadastrar novos funcionário: ");
            System.out.println("2 - Exibir os dados cadastrados: ");
            System.out.println("3 - Escolher o tipo de funcionário (Gerente, Desenvolvedor ou Estagiário): ");
            System.out.println("4 - Sair do sistema: ");
        }

}