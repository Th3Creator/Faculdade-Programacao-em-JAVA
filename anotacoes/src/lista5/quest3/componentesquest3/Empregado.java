package componentesquest3;

import java.util.Comparator;

public abstract class Empregado implements Comparable<Empregados>{
    private int id;
    private String nome;
    private double salario;
    private int dataDecontrataçao;

    // Encapsulamento 
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }

    public void setDataDecontrataçao(int dataDecontrataçao){
        this.dataDecontrataçao = dataDecontrataçao;
    }
    public int getDataDecontrataçao(){
        return this.dataDecontrataçao;
    }
    
    // Métodos
    @Override
    public int compareTo(Empregados obj) {
        if(this.getSalario() < obj.getSalario()){
            return -1;
        }
        else if(this.getSalario() > obj.getSalario()){
            return 1;
        }
        return 0;
    }

   
}
