package testandoequals;
import java.util.HashSet;
import java.util.Set;

import testandoequals.componentes.Aluno;

public class MainTesteEquals {
    public static void main(String[] args) {
        Set<Aluno> listaDeAlunos = new HashSet<Aluno>();

        Aluno n1 = new Aluno(021222, "Musâfá");
        Aluno n2 = new Aluno(021222, "Clêó");
        listaDeAlunos.add(n1);
        listaDeAlunos.add(n2);

        // Testando se os dois objetos são iguais
        if(n1.equals(n2)) {System.out.println("São iguais");}
        else {System.out.println("Nao são iguais");}


    }
}
