package arraylistexemplos.dandoenfaseemshort;

public class SJM extends Curso{
    private String nomeSJM = "Sistemas de informação";
    
    // Métodos
    public String getNome(){
        return nomeSJM;
    }

    public void escreveNaTela(){
        System.out.println("Essa é a duração desse curso: " + getDuracao());
    }
    // obs: se eu excluir esses métodos... Vai dar erro pois é obrigatório às suas existências.


}
