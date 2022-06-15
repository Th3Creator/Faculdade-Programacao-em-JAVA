package quest1.controlador;

public class Peixe extends Animal{
    private String tipoHabitat;
    

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
    public void setTipoHabitat(String tipoHabitat){
        this.tipoHabitat = tipoHabitat;
    }  
    public String getTipoHabitat(){
        return this.tipoHabitat;
    } 
    
    
    // Pegando o construtor pai
    public Peixe (String nome, Double peso, String tipoHabitat){super(nome, peso); this.tipoHabitat = tipoHabitat;}


    // toString() 
    @Override
    public String toString(){
        return "\n{Nome: " + getNome() + ", Peso: " + getPeso()+ ", Tipo Habitat: " + getTipoHabitat() + "}";
    }
}
