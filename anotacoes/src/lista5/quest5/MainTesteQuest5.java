import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTesteQuest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int parametroDeParada = 3;

        System.out.println("Eu sei dividir!");
        
        
        while(parametroDeParada > 2){
            try{
                System.out.println("\n\n\n\n\n\n\nInforme o primeiro valor ");
                 x = sc.nextInt();
                
                 System.out.println("\nInforme o segundo valor");
                 y = sc.nextInt();

                 double r = (x/y);
                 System.out.println("\n\nO resultado da divisão é: " + r);
                 parametroDeParada = 3;
            }catch(InputMismatchException e){
                System.out.println("Erro na entrada dos valores... Tente novamente =(");
            } 
            catch (ArithmeticException e){
                System.out.println("Erro na divisão... Tente novamente =("); 
            }
            sc.nextLine(); // Limpando o scanner para usar de novo
        }    
    }    
}
// Vídeo 59 ele fala sobre isso