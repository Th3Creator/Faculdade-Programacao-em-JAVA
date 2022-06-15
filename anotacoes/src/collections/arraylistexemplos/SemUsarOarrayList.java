package arraylistexemplos;

public class SemUsarOarrayList {
    public static void main(String[] args) {
        String listaDeNomes[] = new String[10];

        listaDeNomes[0] = "Pisquilaaaaaaaaa";
        listaDeNomes[1] = "Benzemar";

        boolean encontrou = pesquisaNome(listaDeNomes, "Pisquilaaaaaaaaa");

        System.out.println(encontrou);
    }


    // Função que consulta o nome passado na lista
    public static boolean pesquisaNome(String lista[], String nomeProcurado){
        for(int i = 0; i < lista.length ; i++){
            if(nomeProcurado.equals(lista[i])){
                return true;
            }
        }
        return false;
    }
}
