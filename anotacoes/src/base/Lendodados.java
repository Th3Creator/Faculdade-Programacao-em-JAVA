// Primeiramente é necessário importar o java.util.Scanner porque é necessário ele pra fazer a leitura
import java.util.Scanner;

public class Lendodados {
    public static void main(String[] args) {
        System.out.println("Insira um dado:");
        
        Scanner pegandodados = new Scanner(System.in);

        String paImprimir = pegandodados.nextLine();

        System.out.println(paImprimir);
    }
}
