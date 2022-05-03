package quest4.componentes;
import java.util.Random;

public class Oficina extends Automovel{
    

    // Métodos 
    public int proximo(){
        // Vai gerar um número aleatório
        Random gerador = new Random();
        int verifica = gerador.nextInt();
   
        // Verifica se ele é par... Retorna 0 se for 
        if(verifica % 2 == 0){
            return 0;
        }
        // Verifica se ele é impar... Retorna 1 se for
        else{
            return 1;
        }
    }

    public void manutencao(int veiculo){
        if(veiculo == 1){
            System.out.println("======================================");
            System.out.println("Imprimindo um Veiculo: \n");
            super.listarVerificacoes();
            super.limpar();
            super.ajustar();
            super.mudarOleo();
            System.out.println("======================================\n");
        }
       
        else{
            System.out.println("======================================");
            System.out.println("Imprimindo uma Bicicleta: \n");
            super.listarVerificacoes();
            super.limpar();
            super.ajustar();
            System.out.println("======================================");
        }
    }
}
