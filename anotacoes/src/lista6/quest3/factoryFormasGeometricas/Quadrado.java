package quest3.factoryFormasGeometricas;

public class Quadrado extends FormasGeometricas{
    private String processoDeFabricacao;
    protected Quadrado (String processoDeFabricacao){
        super("Quadrado");
        this.processoDeFabricacao = processoDeFabricacao;
    }

    @Override
    public String toString() {
        return super.toString() + " / " +this.processoDeFabricacao;
    }
}
