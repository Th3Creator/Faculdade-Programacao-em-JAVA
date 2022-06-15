package quest1.controlador;
import java.util.Scanner;
import quest1.controlador.FunctionsGrafos;

public class Grafos {
    // Criar matriz aqui contendo os grafos
    private int[][] grafos = {{0, 1, 0, 0, 1}, {1, 0, 1, 1, 1}, {0, 1, 0, 1, 0}, {0, 1, 1, 0, 1}, {1, 1, 0, 1, 0}};
    private int i = 3;
    private int escolhaDoMenu;
    private FunctionsGrafos funçoesdosgrafos;
    
    Scanner sc = new Scanner(System.in);

    public void iniciar(){
        funçoesdosgrafos = new FunctionsGrafos();

        // função principal { Contendo os menus e condições de parada}        
        while(i > 2){
            System.out.println("==============================================================================");
            System.out.println("      |     1 - Imprimir o grafo na tela                            |");
            System.out.println("      |     2 - Se um grafo é vizinho um do outro                   |");
            System.out.println("      |     3 - Saber todos os vizinhos de um determinado grafo     |");
            System.out.println("      |     0 - Sair                                                |");
            System.out.println("==============================================================================");
            escolhaDoMenu = sc.nextInt();

            if(escolhaDoMenu == 1){
                funçoesdosgrafos.imprimeGrafo();
            }
            else if(escolhaDoMenu == 2){
                funçoesdosgrafos.vizinhosDoGrafo();
            }
            else if(escolhaDoMenu == 3){
                funçoesdosgrafos.todosVizinhosDoGrafos();
            }
            else if(escolhaDoMenu == 0){
                i = 1;
            }
            else {
                System.out.println("\nDigite apenas os números que estão no menu");
            }
        }
    }

    public int[][] getGrafo() {
        return this.grafos;
    }
}


// Ta aqui a função principal { Contendo os menus e condições de parada}
/* 
    

*/