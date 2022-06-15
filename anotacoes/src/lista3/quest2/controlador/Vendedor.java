package quest2.controlador;

import quest2.controlador.Empregado;

public class Vendedor extends Empregado{
    private Double valorVendas;
    private int qntVendas;

    
    // Encapsulamento
    public void setValorVendas(Double valorVendas){
        this.valorVendas = valorVendas;
    }
    public Double getValorVendas(){
        return this.valorVendas;
    }
    public void setQntVendas(int qntVendas){
        this.qntVendas = qntVendas;
    }
    public int getQntVendas(){
        return this.qntVendas;
    }

    
    // Pegando o construtor pai
    public Vendedor (String nome, int idade, String sexo, Double salario, String matricula, Double valorVendas, int qntVendas){super(nome, idade, sexo, salario, matricula); this.valorVendas = valorVendas; this.qntVendas = qntVendas;}

    
    // toString() 
    @Override
    public String toString(){
        return "\n{Nome: " + getNome() + ", Idade: " + getIdade()+ ", Salário: " + getSalario() + ", Matricula: " + getMatricula() + ", Valor de Vendas: " + getValorVendas() + ", Quantidade de Vendas: " + getQntVendas() + "}";
    }
}
