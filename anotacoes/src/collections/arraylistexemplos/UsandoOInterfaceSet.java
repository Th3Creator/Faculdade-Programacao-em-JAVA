package arraylistexemplos;

import java.util.HashSet;
import java.util.Set;

public class UsandoOInterfaceSet {
    public static void main(String[] args) {
        Set<String> listaDeNomes = new HashSet<String>();

        listaDeNomes.add("Jack Sparrow");
        listaDeNomes.add("Selena");
        listaDeNomes.add("Padre");

        /* 
        for(int i = 0; i < listaDeNomes.size(); i++){
            System.out.println(listaDeNomes);
        }
        */
        // Diferentemente dos demais, ele na hora de imprimir não possui o get() na posição tal...
        // pois isso remete a uma ideia de ordenação, algo que não possui no Interface Set

        System.out.println(listaDeNomes);
    }
}

/* 
NOTA:
    Não aceita elementos duplicados e não garante ordenação,
*/