public class Pessoa {

    private int cpf;
    private String dataNascimento;
    
    public Pessoa(){};

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public int getCpf(){
        return cpf;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }


}