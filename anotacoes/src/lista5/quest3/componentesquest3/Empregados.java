package componentesquest3;

public  class Empregados extends Empregado{
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
    public Empregados(int id, String nome, double salario, int dataDecontrataçao){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.dataDecontrataçao = dataDecontrataçao;
    }

    @Override
    public String toString() {
        String str = "\n\nNome: " + getNome();
        str +=  "\nSalario: " + getSalario();
        str +=  "\nData de contratação: " + getDataDecontrataçao();
        return str;
    }

}
