package quest3.factoryFormasGeometricas;

public  class FormasGeometricas {
    private String nome;

    public FormasGeometricas(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
