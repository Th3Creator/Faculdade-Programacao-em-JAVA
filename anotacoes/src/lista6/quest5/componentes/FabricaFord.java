package quest5.componentes;

public class FabricaFord implements FabricaDeCarros{

    public CarroSedan criarCarroSedan(){
        return new Siena();
    }

    public CarroPopular criarCarroPopular(){
        return new Palio();
    }
}
