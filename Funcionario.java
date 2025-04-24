public class Funcionario extends Pessoa {

    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(){};

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public String getDepartamento(){
        return departamento;
    }


    public String mostrarDados () {
        return "";

    }

    public String baterPonto () {
        return "";

    }

    
}
