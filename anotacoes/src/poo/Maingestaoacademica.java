package poo;
import componentes.Gestaoacademica;

public class Maingestaoacademica {
    public static void main(String[] args) {
        
        Gestaoacademica aluno1 = new Gestaoacademica("134.076.501-24", "Christian Louzada de Castro Daniel", "SJM - Sistemas de Informação"); // Esse new é o método construtor // E esse "aluno1" é classificado como referência ou instância

        Gestaoacademica aluno2 = new Gestaoacademica("091.481.513-81", "Pedrinho Ex Matador","ENGC - Engenharia da Computação" );

       Gestaoacademica aluno3 = new Gestaoacademica("431.020.764-21", "Pedrinho Pastor", "ENGC - Engenharia da Computação");
        // obs: sistema de validação está: on
        

        // Matriculando em disciplinas optativas
        aluno1.matricular("C13-402");
        aluno1.matricular("C24-730");

        aluno2.matricular("D46-816");
        aluno2.matricular("D93-481");

        // Printando disciplinas matriculadas 
       aluno1.imprimeDisciplinasMatriculadas();
       System.out.println("\n\n");
       aluno2.imprimeDisciplinasMatriculadas();

       // Pritando outros só pra testar
        aluno3.getCurso();
    }   
}

/* 
O main aqui é responsável somente por receber os dados, os métodos que são 
destinados a rodar o programa
*/