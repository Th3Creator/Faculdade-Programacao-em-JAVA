package quest1.barDaMagareth;

public class BarSingleton {
    private static BarSingleton instance;

    private String nome;
    private int anosDeBar;
    private int idade;
    

    // Encapsulamento
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnosDebar(int anosDeBar){
        this.anosDeBar = anosDeBar;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    
    
    // Métodos
    private BarSingleton(){

    }   

    public static BarSingleton getInstance(){
        if(instance == null){
            instance = new BarSingleton();
            return instance;
        }
        return instance; // Um bug aqui =(
    }

    @Override
    public String toString() {
        String str;
        str = "Nome: " + this.nome;
        str += "\nAnos de bar da Magareth: " + this.anosDeBar;
        str += "\nIdade: " + this.idade;

        return str;
    }
}
