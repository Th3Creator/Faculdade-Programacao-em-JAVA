package quest3.factoryFormasGeometricas;

public class Triangulo extends FormasGeometricas{
    private String processoDeFabricacao;
    protected Triangulo (String processoDeFabricacao){
        super("Triangulo");
        this.processoDeFabricacao = processoDeFabricacao;
    }

    @Override
    public String toString() {
        return super.toString() + " / " +this.processoDeFabricacao;
    }
}
