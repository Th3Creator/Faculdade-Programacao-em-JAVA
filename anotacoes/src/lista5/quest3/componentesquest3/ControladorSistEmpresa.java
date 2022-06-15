package componentesquest3;
import componentesquest3.Empregados;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ControladorSistEmpresa {
    private int parametroDeParada = 3;
    private int escolhaDoMenu;
    ArrayList<Empregados> listaDeEmpregados = new ArrayList<Empregados>();

    Scanner sc = new Scanner(System.in);

    public void iniciarSistema(){

        // Criando objetos e adicionando a lista
        Empregados empregado1 = new Empregados(123, "Pisquila", 100.900, 2003);
        listaDeEmpregados.add(empregado1);
        Empregados empregado2 = new Empregados(123, "Aezio", 600.900, 1997);
        listaDeEmpregados.add(empregado2);
        Empregados empregado3 = new Empregados(123, "Wesley", 700.900, 2005);
        listaDeEmpregados.add(empregado3);
        Empregados empregado4 = new Empregados(123, "Jorge", 300.900, 1998);
        listaDeEmpregados.add(empregado4);
        Empregados empregado5 = new Empregados(123, "Negoney", 900.900, 1990);
        listaDeEmpregados.add(empregado5);
        
        // Menu  
        while(parametroDeParada > 2){
            System.out.println("\n\n\n\n");
            System.out.println("====================================================================");
            System.out.println("                           MENU:                              ");
            System.out.println("      |     1 - Ordenar em ordem crescente através do salário   |");
            System.out.println("      |     2 - Ordenar em ordem alfabética                     |");
            System.out.println("      |     3 - Funcionário com maior salário e menor também    |");
            System.out.println("      |     4 - Funcionário mais experiente e menos experiente  |");
            System.out.println("      |     5 - Sair do programa                                |");
            System.out.println("====================================================================");
            escolhaDoMenu = sc.nextInt();

            if(escolhaDoMenu == 1){
                Collections.sort(listaDeEmpregados);
                System.out.println(listaDeEmpregados);
            }
            else if(escolhaDoMenu == 2){
                System.out.println("Não consegui colocar em ordem alfávetica Rafael =(");
            }
            else if(escolhaDoMenu == 3){
                System.out.println("Funcionário com o maior salário");
                System.out.println( Collections.max(listaDeEmpregados));

                System.out.println("\nFuncionário com o menor salário");
                System.out.println(Collections.min(listaDeEmpregados));       
            }
            else if(escolhaDoMenu == 4){
                System.out.println("Não consegui Rafael... =(");
            }
            else if(escolhaDoMenu == 5){
                parametroDeParada = 1;
            }
            else{
                System.out.println("Digite apenas uma das opções oferecidas =(");
            }
        }
    }


}
