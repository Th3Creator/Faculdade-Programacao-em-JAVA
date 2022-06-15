package tratamentodeexcecoes;

import java.io.File;
import java.io.FileInputStream;

public class TesteTratamentoDeExecoes {
    public static void main(String[] args) {
        String nomes[] = new String[10];

        // Testa o primeiro bloco(try) e se não conseguir executa o cath logo em seguida e o programa segue normalmente
        /* 
        try{
            nomes[0] = "Steve";
            nomes[1] = "Mark";
            nomes[2] = "Exu";

            System.out.println(nomes[0].length());
            System.out.println(nomes[5].length());
        } catch(Exception e){
            System.out.println("Ocorreu um erro inesperado...");
        }

        System.out.println("Vida que segue");
        */

        try{
            double result = divisao(10, 2);
            System.out.println("O resultado da divisão é: " + result);
        }catch(Exception e){
            System.out.println("Ops... Um erro foi encontrado na hora da divisão");
        }

         
    }

    public static double divisao(int x, int y){
        return x/y;
    }

    
}
