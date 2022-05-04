package quest1.componentes;
import java.util.Scanner;

import quest1.componentes.Form1;
import quest1.componentes.Form2;

public class Container {
    Form1 form1 = new Form1();
    Form2 form2 = new Form2();
    private int escolhaDoMenu1;
    private int escolhaDoMenu2;
    private int parametroDeParada = 3;

    Scanner sc = new Scanner(System.in);
    
    //Métodos
    public void flush(){
        // Menuzinho: Que vai definir qual form chamar 
        while(parametroDeParada > 2 ){
        System.out.println("==============================================================================");
        System.out.println("      Deseja utilizar qual dos dois formulários a baixo?                           ");
        System.out.println("      |     1 - Formulário 1?                            |");
        System.out.println("      |     2 - Formulário 2?                            |");
        System.out.println("      |     3 - Deseja sair do programa?                 |");
        System.out.println("==============================================================================");
        escolhaDoMenu1 = sc.nextInt();

        if(escolhaDoMenu1 == 1){
            System.out.println("==============================================================================");
            System.out.println("      |     1 - Deseja imprimir na tela ?                            |");
            System.out.println("      |     2 - Deseja salvar em um arquivo txt?                     |");
            System.out.println("==============================================================================");
            escolhaDoMenu2 = sc.nextInt();

            if(escolhaDoMenu2 == 1){
                form1.formulario1();
            }
            else if(escolhaDoMenu2 == 2){
                System.out.println("Salvo em arquivo txt!!!");
            }
            else{
                System.out.println("Opa! Digite somente os números do painel, tente novamente =(");
            }
        }
        else if(escolhaDoMenu1 == 2){
            System.out.println("==============================================================================");
            System.out.println("      |     1 - Deseja imprimir na tela ?                            |");
            System.out.println("      |     2 - Deseja salvar em um arquivo txt?                     |");
            System.out.println("==============================================================================");
            escolhaDoMenu2 = sc.nextInt();

            if(escolhaDoMenu2 == 1){
                form2.formulario2();
            }
            else if(escolhaDoMenu2 == 2){
                System.out.println("Salvo em arquivo txt!!!");
            }
            else{
                System.out.println("Opa! Digite somente os números do painel, tente novamente =(");
            }
        }
        else if(escolhaDoMenu1 == 3){
            parametroDeParada = 1;
        }
        else {
            System.out.println("Opa! Digite somente os números do painel, tente novamente =(");
        }

        }
    }

    public void printf(){
        flush();
    }
    
}
