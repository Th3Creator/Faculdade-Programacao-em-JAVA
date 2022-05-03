package quest2.componentes;

public class CartaoDeAniversario extends CartaoWeb{
    private final String mensagemDaDataComemorativa = "Feliz Aniversário!!! Muitos anos de vida, felicidade, paz e saude";
 
   
    // Métodos
    public  CartaoDeAniversario(String destinatario){super(destinatario); }

    @Override 
    public void showMessage(){
        System.out.println("\nDestinatario: " + getDestinatario() + "\nMensagem: " + mensagemDaDataComemorativa);
    }
}
