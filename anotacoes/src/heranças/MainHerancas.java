import pessoas.Aluno;
import pessoas.Monitor;
import pessoas.Professor;
import pessoas.Pessoa;


public class MainHerancas {
    public static void main(String[] args) {
        // So pá testar a herança que compõe todas as classes presentes na pasta "componentes".
        // Polimorfismo: A referencia de um objeto pai aponta pra um objeto filho.

        Pessoa[] listaDePessoas = new Pessoa[3];

        Pessoa  alun1 = new Aluno();
        listaDePessoas[0] = alun1;

        Pessoa prof1 = new Professor();
        listaDePessoas[1] = prof1;

        Pessoa moni1 = new Monitor();
        listaDePessoas[2] = moni1;
        
     
        alun1.setNome("Christian");
        alun1.setCpf("113.426.937-13");
        alun1.escreveObjetoNaTela();

        prof1.setNome("Rafael");
        prof1.setCpf("113.426.937-12");
        prof1.escreveObjetoNaTela();

        moni1.setNome("Felipe");
        moni1.setCpf("113.426.937-11");
        ((Monitor)moni1).setsoDoMonitor("Ele dá monitoria"); // Isso se chama quest
        moni1.escreveObjetoNaTela();
        

        // ANOTAÇÕES
        /* 
            Nota 1:
            É claro, herdam todas as características de Pessoa mas também possuem a peculiaridade
            de possuir atributos ou métodos somente seus.

            Nota 2:
            Passado na aula seguinte a sobrescrita de um método herdado da classe pai, sendo que o escreve
            ObjetoNaTela(); imprime somente as caracterísicas de pessoa, indo mais a diante, pra você tam-
            bém imprimir as caractéristicas únicas de um objeto é necessário que você sobrescreva esse mét-
            odo, usando no objeto monitor.
        */
        
    }
}

/* 
                OBSERVAÇÃO
        
        Todas as anotações estão na classe Aluno
        
        */
