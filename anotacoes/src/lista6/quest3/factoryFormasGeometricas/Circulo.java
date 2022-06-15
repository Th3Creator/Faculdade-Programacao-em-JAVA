package quest3.factoryFormasGeometricas;

public class Circulo extends FormasGeometricas{
    private String processoDeFabricacao;

    protected Circulo(String processoDeFabricacao){
        super("Circulo");
        this.processoDeFabricacao = processoDeFabricacao;
    }

    @Override
    public String toString() {
        return super.toString() + " / " +this.processoDeFabricacao;
    }
}
