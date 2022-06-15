package componentesquest3;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ControladorQuest3 {
    private int i = 0;
    private int parametroDeParada = 3;
    private int escolhaDoMenu;
    private int vezesQueApareceu = 0;
    ArrayList<Integer> listaDeNAleatorios = new ArrayList<Integer>();

    Scanner sc = new Scanner(System.in);
    Random gerador = new Random();

    public void iniciar(){
    
        // Gerando números aleatórios
        while(i < 50){
            int nAleatorios = gerador.nextInt(99);
            listaDeNAleatorios.add(nAleatorios);
            i++;
        }
        
        System.out.println("Essa é a lista de números aleatórios:\n" + listaDeNAleatorios);

        // Menu
        while(parametroDeParada > 2){
            System.out.println("\n\n\n\n");
            System.out.println("====================================================================");
            System.out.println("                           MENU:                              ");
            System.out.println("      |     1 - Obter o menor e o maior número armazenado    |");
            System.out.println("      |     2 - Quantas vezes o menor número apareceu        |");
            System.out.println("      |     3 - Ordenar a lista em ordem crescente           |");
            System.out.println("      |     4 - Sair do programa                             |");
            System.out.println("====================================================================");
            escolhaDoMenu = sc.nextInt();

            if(escolhaDoMenu == 1){
                Object Nmax = Collections.max(listaDeNAleatorios);
                Object Nmin = Collections.min(listaDeNAleatorios);
                System.out.println("Esse é o menor número: " + Nmin + "\nEsse é o maior número: " + Nmax);
            }
            else if(escolhaDoMenu == 2){
               Object Nmin = Collections.min(listaDeNAleatorios);
               for (Integer integer : listaDeNAleatorios) {
                    if(integer != null && integer.equals(Nmin)){
                        vezesQueApareceu++;
                    }
               }
               System.out.println(vezesQueApareceu);
            }
            else if(escolhaDoMenu == 3){
                Collections.sort(listaDeNAleatorios);
                System.out.println(listaDeNAleatorios);
            }
            else if(escolhaDoMenu == 4){
                parametroDeParada = 1;
            }
            else {
                System.out.println("Digite apenas as opções informadas =(");
            }
        }
    }


}
