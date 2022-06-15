package componentesquest2;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    // Encapsulamento 
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return this.cargo;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
    
    // Métodos 
    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        String str = "\n\nNome: " + getNome();
        str +=  "\nCargo: " + getCargo();
        str +=  "\nSalario: " + getSalario();
        return str;
    }
}
