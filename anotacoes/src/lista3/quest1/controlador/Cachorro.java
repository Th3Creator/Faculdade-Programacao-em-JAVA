package quest1.controlador;

public class Cachorro extends Animal{
    private String raça;


    // encapsulamento de heranças
    public void setNome(String nome) {
        super.setNome(nome); 
    }
    public String getNome() {
        return super.getNome();
    }

    public void setPeso(Double peso){
        super.setPeso(peso);
    }
    public Double getPeso(){
        return super.getPeso();
    }
    // encapsulamento
    public void setRaça(String raça){
        this.raça = raça;
    }  
    public String getRaça(){
        return this.raça;
    }  

    
    // Pegando o construtor pai
    public Cachorro (String nome, Double peso, String raça){super(nome, peso);this.raça = raça;}


    // toString()   
    @Override
    public String toString(){
        return "{Nome: " + getNome() + ", Peso: " + getPeso()+ ", Raça: " + getRaça() + "}";
    }

}
