package quest2.controlador;

public class Cliente extends Pessoa{
    private Double divida;
    private int anoNascim;


    // Encapsulamento
    public void setDivida(Double divida){
        this.divida = divida;
    }
    public Double getDivida(){
        return this.divida;
    }
    public void setanoNascim(int anoNascim){
        this.anoNascim = anoNascim;
    }
    public int getanoNascim(){
        return this.anoNascim;
    }

    // Pegando o construtor pai
    public Cliente (String nome, int idade, String sexo, Double divida, int anoNascim){super(nome, idade, sexo); this.divida = divida; this.anoNascim = anoNascim;}


    // toString() 
    @Override
    public String toString(){
        return "\n{Nome: " + getNome() + ", Idade: " + getIdade()+ ", Sexo: " + getSexo() + ", Tipo Divida: " + getDivida() +  ", Ano de Nascimento " + getanoNascim() + "}";
    }
}
