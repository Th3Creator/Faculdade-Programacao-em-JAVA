package arraylistexemplos.dandoenfaseemshort;

import arraylistexemplos.dandoenfaseemshort.SJM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TesteDeOrdenacao {
    public static void main(String[] args) {
        
        ArrayList<Curso> listaDeCursos = new ArrayList<Curso>();

        // Criando cursos e adicionando na Array list
        for(int i = 0; i < 10; i++){
            SJM sjm = new SJM();
            sjm.setDuracao(i + 10);
            listaDeCursos.add(sjm);
        }   

        // Imprime na tela cada curso
        for(int i = 0; i < listaDeCursos.size(); i++){
            listaDeCursos.get(i).escreveNaTela();
        }

        // Comparando a duração de um curso com o outro
        Collections.sort(listaDeCursos);
    }
}
