package quest5;
import quest5.componentes.CarroPopular;
import quest5.componentes.CarroSedan;
import quest5.componentes.FabricaDeCarros;
import quest5.componentes.FabricaFiat;
import quest5.componentes.FabricaFord;

public class TesteCarro {
    public static void main(String[] args) {

        // FÁBRICA FIAT
        // Criando carros SEDAN
        FabricaDeCarros fabricaDeCarros = new FabricaFiat(); // É aqui que difere uma fábrica da outra
        CarroSedan carroSedan = fabricaDeCarros.criarCarroSedan();
        // Criando carros Populares
        CarroPopular carroPopular = fabricaDeCarros.criarCarroPopular();

        // FÁBRICA FORD
        FabricaDeCarros fabricaDeCarros2 = new FabricaFord(); // É aqui que difere uma fábrica da outra
        CarroSedan carroSedan2 = fabricaDeCarros2.criarCarroSedan();
        CarroPopular carroPopular2 = fabricaDeCarros2.criarCarroPopular();

        // IMPRIMINDO NA TELA
        carroSedan.exibirInfoSedan();
        carroPopular.exibirInfoPopular();
        System.out.println("\n\n INFORMAÇÕES DOS CARROS DA FÁBRICA 2:\n\n");
        carroSedan2.exibirInfoSedan();
        carroPopular2.exibirInfoPopular();
    }   
}
