package arraylistexemplos;
import java.util.ArrayList;

public class ComArrayList {
    public static void main(String[] args) {

        ArrayList<String> listaDeNomes = new ArrayList<String>();
        // Substituindo "Interger" no lugar de String, fica uma lista de 


        // Adiciona elementos na arraylist
        listaDeNomes.add("Pisquilaaaaaaaaaaa");
        listaDeNomes.add("Christian");
        listaDeNomes.add("Alexandre");
        listaDeNomes.add(2,"Jesus"); // Adiciona o elemento só que já passando o seu index
        
        // Pega elementos da array list
        System.out.println(listaDeNomes.get(2));

        // Retorna o quanto de elementos possuem dentro de da ArrayList
        System.out.println(listaDeNomes.size());

        // Limpa todos os elementos da ArrayList
        listaDeNomes.clear();
    
    }

    // Responsável por consultar o nome passado na lista
    public static boolean pesquisaNome(String lista[], String nomeProcurado){
        for(int i = 0; i < lista.length ; i++){
            if(nomeProcurado.equals(lista[i])){
                return true;
            }
        }
        return false;
    }

    public static void imprimeNaTela(){

    }
}
