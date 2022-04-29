package heranças;
import heranças.pessoas.Aluno;
import heranças.pessoas.Monitor;
import pessoas.Professor;


public class MainHerancas {
    public static void main(String[] args) {
        // So pá testar a herança que compõe todas as classes presentes na pasta "componentes".

        Aluno alun1 = new Aluno();
        Professor prof1 = new Professor();
        Monitor moni1 = new Monitor();
        
        alun1.setsoDoAluno(soDoAluno);
        prof1.setsoDoProfessor(soDoProfessor);
        moni1.setsoDoMonitor(soDoMonitor);
        // É claro, herdam todas as características de Pessoa mas também possuem a peculiaridade
        // de possuir atributos ou métodos somente seus.






        
        /* 
                OBSERVAÇÃO
        
        Todas as anotações estão na classe Aluno
        
        */
    }
}
