public class Funcionario extends Pessoa {

    private String nome;
    private float salario;
    private String departamento;

    public Funcionario(){};

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getNome(){
        return nome;
    }

    public float getSalario(){
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
