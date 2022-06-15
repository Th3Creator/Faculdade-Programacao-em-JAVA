package abstracao;
import abstracao.componentes.Curso; 
import abstracao.componentes.SJM; 
import abstracao.componentes.ContainerDeCursos;

public class TesteAbstract {
    public static void main(String[] args) {
        
        // Não é possível fazer o construtor de curso pois ele está em abstract...

        SJM sistemas = new SJM();
        // No entanto é possível criar um construtor de uma classe que está sendo herdeira da classe abstract
    
        ContainerDeCursos cdc = new ContainerDeCursos();
        
    }
}
