package componentesquest2;

import componentesquest2.Funcionario;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class ControladorQuest2 {
    private int escolhaDoMenu;
    private int parametroDeParada = 3;
    private String recebeID;
    Map<String, String> mapaFuncionario = new HashMap<String, String>();

    Scanner sc = new Scanner(System.in);

    // Métodos
    public void iniciar() {

        mapaFuncionario.put("a1234", "Steve Jobs");  
        mapaFuncionario.put("a1235", "Scott McNealy");
        mapaFuncionario.put("a1236", "Jeff Bezos");
        mapaFuncionario.put("a1237", "Larry Ellison");
        mapaFuncionario.put("a1238", "Bill Gates");
       

        // Menu
        while (parametroDeParada > 2) {
            System.out.println("\n\n\n\n");
            System.out.println("====================================================================");
            System.out.println("                           MENU:                              ");
            System.out.println("      |     1 - Imprimir um funcionário                      |");
            System.out.println("      |     2 - Imprimir todos os funcionários               |");
            System.out.println("      |     3 - Deseja sair do programa?                     |");
            System.out.println("====================================================================");
            escolhaDoMenu = sc.nextInt();

            if (escolhaDoMenu == 1) {
                System.out.println("Digite o ID do funcionário a ser exibido na tela:");
                recebeID = sc.next().toLowerCase();
                
                if(buscaFuncionario(recebeID)){
                    imprimeFuncionario(recebeID);
                }
                else{
                    System.out.println("Não existe esse funcionário =( ");
                }
            } 
            else if (escolhaDoMenu == 2) {
                for (String key : mapaFuncionario.keySet()) {
                    System.out.println(key+ " = " + mapaFuncionario.get(key));
                }
            } 
            else if (escolhaDoMenu == 3) {
                parametroDeParada = 1;
            } 
            else {
                System.out.println("Digite apenas as opções que aparecem =(");
            }
        }
    }

    public boolean buscaFuncionario(Object objeto) {
        if(mapaFuncionario.containsKey(objeto)){
            return true;
        }
        else{
            return false;
        }
    }

    public void imprimeFuncionario(Object obj){
        Funcionario a1234 = new Funcionario("Steve Jobs", "Patrão", 1000.0000);
        Funcionario a1235 = new Funcionario("Scott McNealy", "Patrão", 4000.0000);
        Funcionario a1236 = new Funcionario("Jeff Bezos", "Patrão", 7000.0000);
        Funcionario a1237 = new Funcionario("Larry Ellison", "Patrão", 2000.0000);
        Funcionario a1238 = new Funcionario("Bill Gates", "Patrão", 9000.0000);

        String id = ""+obj; // Transformando esse objeto em string para poder compará-lo

        if(id.equals("a1234")){
            System.out.println(a1234);
        }
        else if(id.equals("a1235")){
            System.out.println(a1235);
        }
        else if(id.equals("a1236")){
            System.out.println(a1236);
        }
        else if(id.equals("a1237")){
            System.out.println(a1237);
        }
        else if(id.equals("a1238")){
            System.out.println(a1238);
        }
    }

}
