package quest2.componentes;

public abstract class CartaoWeb {
    private String destinatario;


    // Encapsulamento 
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getDestinatario() {
        return this.destinatario;
    }

    // Métodos 
    public abstract void showMessage();

    public CartaoWeb(String destinatario){
        this.destinatario = destinatario;
    }
}
