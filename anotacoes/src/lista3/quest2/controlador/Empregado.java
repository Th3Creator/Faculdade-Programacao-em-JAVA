package quest2.controlador;

public class Empregado extends Pessoa{
    private Double salario;
    private String matricula;
    private Double INSSresult;

    
    // Encapsulamento
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public Double getSalario(){
        return this.salario;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public Double getINSSresult(){
        return this.INSSresult;
    }

    // INSS
    public double resultINSS(Double salario){
        return salario * 0.11;
    }


    // Pegando o construtor pai
    public Empregado (String nome, int idade, String sexo, Double salario, String matricula){super(nome, idade, sexo); this.salario = salario; this.matricula = matricula; this.INSSresult = INSSresult;}
}
