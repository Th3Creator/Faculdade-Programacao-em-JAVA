package interfacemap;
import java.util.HashMap;
import java.util.Map;

import interfacemap.componentes.Pessoa;
import interfacemap.componentes.Aluno;;

public class MainTeste {
    public static void main(String[] args) {
        
        Map<String, Pessoa> map = new HashMap<String, Pessoa>();

        Aluno aluno = new Aluno(400289, "YUDIIIII");
        Aluno aluno2 = new Aluno(400289, "MARICOTAAAA");

        // Adicionando elementos no map
        map.put(aluno.getCpf(), aluno);
        map.put(aluno2.getCpf(), aluno);

        // Removendo elementos do map
        map.remove(400289);

        System.out.println(map.size() );
    }
}
