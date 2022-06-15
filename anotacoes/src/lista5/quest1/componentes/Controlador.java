package componentes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.io.*;
import componentes.Produtos;

public class Controlador {
    private String escolhaDoMenu1;
    private int escolhaDoMenu2;
    private String nomeadicionado;
    private String nomeRemove;
    private String nomeVerifica;
    private int parametroDeParada1 = 3;
    private int parametroDeParada2 = 3;
    Set<String> nomes = new HashSet<String>();

    Scanner sc = new Scanner(System.in);

    // Métodos da sub questão A
    public void iniciarA(){
        
        // Menu que lê nomes
        while(parametroDeParada1 > 2){
            System.out.println("\nDigite o nome a ser adicionado");
            nomeadicionado = sc.next();
            nomes.add(nomeadicionado);

            System.out.println("\nDeseja continuar adicionando nomes? s/n");
            escolhaDoMenu1 = sc.next();

            if(escolhaDoMenu1.equals("n")){
                parametroDeParada1 = 1;
            }
            else if(escolhaDoMenu1.equals("s")){ 
                parametroDeParada1 = 3;
            }
            else{ System.out.println("\nDigite apenas conforme passado 's' ou 'n'"); }
        }
       
        // Menu de opções
        while(parametroDeParada2 > 2){
            System.out.println("\n\n\n\n");
            System.out.println("==============================================================================");
            System.out.println("                           MENU:                                              ");
            System.out.println("      |     1 - Gostaria de remover algum nome?          |");
            System.out.println("      |     2 - Gostaria de verficar algum nome?         |");
            System.out.println("      |     3 - Deseja limpar a lista de nomes?          |");
            System.out.println("      |     4 - Imprime lista de nomes                   |");
            System.out.println("      |     5 - Sair do programa                         |");
            System.out.println("==============================================================================");
            escolhaDoMenu2 = sc.nextInt();

            if(escolhaDoMenu2 == 1){
                System.out.println("Digite o nome que deseja remover");
                nomeRemove = sc.next();
                verificaLista(nomeRemove);
                nomes.remove(nomeRemove);
               
            }
            else if(escolhaDoMenu2 == 2){
                System.out.println("Digite o nome que deseja verificar");
                nomeVerifica = sc.next();
                verificaLista(nomeVerifica);
            }
            else if(escolhaDoMenu2 == 3){
                nomes.clear();
                System.out.println("Lista limpada com sucesso!!!");
                parametroDeParada2 = 1;
            }
            else if(escolhaDoMenu2 == 4){
                imprimeLista();
            }
            else if(escolhaDoMenu2 == 5){
                imprimeLista();
                parametroDeParada2 = 1;
            }
            else{
                System.out.println("Digite apenas os numeros passados no menu =(");
            }   
        }      
    }

    public void verificaLista(Object obj){
        if(nomes.contains(obj)){
            System.out.println("\nEstá na lista esse nome!!!");
        }
        else{
            System.out.println("\nNão está na lista esse nome!!!");
        }
    }

    public void imprimeLista(){
        System.out.println(nomes);
    }


    // ----------------------------------- //    // ----------------------------------- //


    private String escolhaDoMenuB;
    private int parametroDeParadaB = 3;
    Set<Produtos> listaDeProdutos = new HashSet<Produtos>();

    // Métodos da sub questão B
    public void iniciarB(){
        
        // Ler os produtos e adicionar no set
        while(parametroDeParadaB > 2){
            System.out.println("\nDigite o id do produto");
            nomeadicionado = sc.next();
           
            System.out.println("\nDigite o nome do produto");
            nomeadicionado = sc.next();

            System.out.println("\nDigite o preço do produto");
            nomeadicionado = sc.next();


            
            // Continuidade do programa
            System.out.println("\nDeseja continuar adicionando nomes? s/n");
            escolhaDoMenuB = sc.next();

            if(escolhaDoMenuB.equals("n")){
                parametroDeParadaB = 1;
            }
            else if(escolhaDoMenuB.equals("s")){ 
                parametroDeParadaB = 3;
            }
            else{ System.out.println("\nDigite apenas conforme passado 's' ou 'n'"); }
        }

        // Imprimindo todos os produtos
        /* 
            for (iterable_type iterable_element : iterable) {
            
        }
        */
    }


    public boolean verificaProdutos(){
        return true;
    }

    public void imprimeProdutos(){
        // 8:31 momento em que ele implementa e imprime um objeto na tela. Vídeo 51
        // 15:58 ele ensina em como usar os métodos lá...
    }
}
