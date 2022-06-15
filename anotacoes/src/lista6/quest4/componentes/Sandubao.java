package quest4.componentes;

public class Sandubao {
    private String pao;
    private String queijo;
    private String presunto;
    private String salada;

    protected Sandubao(String pao, String queijo, String presunto, String salada){
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
    }

    @Override
    public String toString() {
        String str;
        str = "\n\n\nPÃO: " +this.pao;
        str += "\nQUEIJO: " + this.queijo;
        str += "\nPRESUNTO: " + this.presunto;
        str += "\nSALADA: " + this.salada;
        return str;
    }
}
