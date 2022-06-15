package quest1.controlador;
import java.util.Scanner;
import quest1.controlador.Grafos;

public class FunctionsGrafos {
    private Grafos grafos;
    private int verticeLinha;
    private int verticeColuna;
    private int todosOsViznhos;

    Scanner sc = new Scanner(System.in);


    // função que imprime ela na tela { Apenas imprime o grafo na tela}
    public void imprimeGrafo(){
        grafos = new Grafos();
        int[][] grafoexportado = grafos.getGrafo();
        
        System.out.printf("   %d %d %d %d %d\n", grafoexportado[0][0], grafoexportado[0][1], grafoexportado[0][2], grafoexportado[0][3], grafoexportado[0][4]);
        System.out.printf("   %d %d %d %d %d\n", grafoexportado[1][0], grafoexportado[1][1], grafoexportado[1][2], grafoexportado[1][3], grafoexportado[1][4]);
        System.out.printf("   %d %d %d %d %d\n", grafoexportado[2][0], grafoexportado[2][1], grafoexportado[2][2], grafoexportado[2][3], grafoexportado[2][4]);
        System.out.printf("   %d %d %d %d %d\n", grafoexportado[3][0], grafoexportado[3][1], grafoexportado[3][2], grafoexportado[3][3], grafoexportado[3][4]);
        System.out.printf("   %d %d %d %d %d\n", grafoexportado[4][0], grafoexportado[4][1], grafoexportado[4][2], grafoexportado[4][3], grafoexportado[4][4]);
    }

    // função que fala se um é vizinho um do outro {passa se um é vizinho um do outro, apenas em um caso}
    public void vizinhosDoGrafo(){
        grafos = new Grafos();
        int[][] grafoexportado = grafos.getGrafo();

        System.out.println("Digite o primeiro vértice");
        verticeLinha = sc.nextInt();

        System.out.println("\nDigite agora o vértice que você quer verificar se é vizinho");
        verticeColuna = sc.nextInt();

        if(grafoexportado[verticeLinha -1][verticeColuna -1] == 1){
            System.out.println("\nEles são vizinhos =)\n\n\n");
        }
        else{
            System.out.println("\nEles não são vizinhos =(\n\n\n");
        }
    }

    // função que escolhe um vértice e determina quais são os vizinhos dele, nesse caso retorna todo que são
    public void todosVizinhosDoGrafos(){
        grafos = new Grafos();
        int[][] grafoexportado = grafos.getGrafo();


        System.out.println("Digite o grafo que você queira saber os vizinhos");
        todosOsViznhos = sc.nextInt();

        System.out.println("\nOs vizinhos dele são:");
        for(int cont = 0; cont < 5; cont++ ){
            if(grafoexportado[todosOsViznhos - 1][cont] == 1){
                System.out.println(cont + 1);
            }
        }
    }
}
