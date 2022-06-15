package quest5.componentes;

public class FabricaFiat implements FabricaDeCarros{
    
    public CarroSedan criarCarroSedan(){
        return new FiestaSedan();
    }
 
    public CarroPopular criarCarroPopular(){
        return new Fiesta();
    }
}
