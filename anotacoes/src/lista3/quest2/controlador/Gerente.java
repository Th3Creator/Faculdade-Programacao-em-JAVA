package quest2.controlador;

import quest2.controlador.Empregado;

public class Gerente extends Empregado{
    private String nomeGerencia;
    private Double result;

    // encapsulamento
    public void setNomeGerencia(String nomeGerencia){
        this.nomeGerencia = nomeGerencia;
    }
    public String getNomeGerencia(){
        return this.nomeGerencia;
    }

    // Pegando o construtor pai
    public Gerente (String nome, int idade, String sexo, Double salario, String matricula, String nomeGerencia){super(nome, idade, sexo, salario, matricula); this.nomeGerencia = nomeGerencia;}
    
    
    // toString() 
    @Override
    public String toString(){
        result = super.resultINSS(this.getSalario());


        return "\n{Nome: " + getNome() + ", Idade: " + getIdade()+ ", Tipo Salario: " + getSalario() + ", Matricula: " + getMatricula() + ", Valor de INSS: " + result +  ", Nome da Gerencia: " + getNomeGerencia() + "}";
    }
}
