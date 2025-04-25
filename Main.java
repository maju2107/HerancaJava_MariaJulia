import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        do {
                MenudeOpções();

                System.out.print("Digite o número da opção desejada: ");
                int opcao = scanner.nextInt();
        
                switch(opcao){
                    case 1:
                        System.out.println("Digite a quantidade de funcionários que você deseja cadastrar:"); 
                        int quantidadeCadastroFuncionario = scanner.nextInt();

                        for(int i = 0; i<quantidadeCadastroFuncionario; i++){

                        }
                        System.out.println("Digite o nome:"); 
                       


                        System.out.println("Pessoinha cadastrada com sucesso!;) ");
                    break; 

                    case 2:
                       
                        System.out.println("Dados atualizados com sucesso!:) ");
                    break; 

                    case 3:
                        
                    break; 

                    case 4:
                        System.out.println("Você saiuu...:");     
                    break; 

                    default:
                        System.out.println("Opção não encontrada dentre as fornecidas pelo sistema!");     
                    break;

                }while(opcao!= 4);
            }
                

    }
    
        private static void MenudeOpções(){
            System.out.print("Bem-vindo ao sistema de Cadastro de funcionários!: ");
            System.out.print("Escolha uma das opções abaixo: ");
            System.out.print("1 - Cadastrar novos funcionário: ");
            System.out.print("2 - Exibir os dados cadastrados: ");
            System.out.print("3 - Escolher o tipo de funcionário (Gerente, Desenvolvedor ou Estagiário): ");
            System.out.print("4 - Sair do sistema: ");
        }
}
