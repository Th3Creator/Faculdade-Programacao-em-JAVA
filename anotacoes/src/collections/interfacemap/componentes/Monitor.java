package interfacemap.componentes;

public class Monitor extends Pessoa{
    private String soDoMonitor;

    // Setando e Guetando os valores
    public void setsoDoMonitor(String soDoMonitor) {
        this.soDoMonitor = soDoMonitor;
    }
    public String getsoDoMonitor() {
        return this.soDoMonitor;
    }
    
    @Override
    public void escreveObjetoNaTela(){
        super.escreveObjetoNaTela(); // ele já reutiliza o que já  é pra imprimir
        System.out.println("Característica única do monitor:" + this.soDoMonitor); // e aqui passa a característica única do objeto pra ser imprimido
    }
}
