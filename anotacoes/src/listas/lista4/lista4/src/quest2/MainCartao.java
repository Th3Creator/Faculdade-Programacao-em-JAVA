package quest2;
import quest2.componentes.CartaoWeb;
import quest2.componentes.CartaoNatalino;
import quest2.componentes.CartaoDeAniversario;
import quest2.componentes.CartaoDiaDosNamorados;

public class MainCartao {
    public static void main(String[] args) {
        CartaoWeb[] colecaoDeCartoes = new CartaoWeb[3];
        

        // Polimorfismo: A referência de um objeto pai apontado para um objeto filho
        CartaoWeb cartaonatalino = new CartaoNatalino("Pisquila");
        colecaoDeCartoes[0] = cartaonatalino;

        CartaoWeb cartaoaniversario = new CartaoDeAniversario("Christian");
        colecaoDeCartoes[1] = cartaoaniversario;

        CartaoWeb cartaodosnamorados = new CartaoDiaDosNamorados("Ketria");
        colecaoDeCartoes[2] = cartaodosnamorados;

        // Imprime na tela
        for(int i = 0; i < colecaoDeCartoes.length; i++){
            colecaoDeCartoes[i].showMessage();
        }
    }
}
