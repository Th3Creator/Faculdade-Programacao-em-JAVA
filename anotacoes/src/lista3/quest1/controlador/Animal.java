package quest1.controlador;

public class Animal {
    private String nome;
    private Double peso;


    // Encapsulamento
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setPeso(Double peso){
        this.peso = peso;
    }
    public Double getPeso(){
        return this.peso;
    }


    // Passando como obrigatoriedade o nome e o peso
    public Animal (String nome, Double peso){
        this.nome = nome;
        this.peso = peso;
    }

    
    // https://www.youtube.com/watch?v=lM63tNMrxS0 (Vídeo que fala sobre o toString)
}
