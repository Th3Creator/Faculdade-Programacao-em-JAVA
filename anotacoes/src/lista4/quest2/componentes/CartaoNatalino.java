package quest2.componentes;

public class CartaoNatalino extends CartaoWeb {
    private final String mensagemDaDataComemorativa = "Valeu Natalina :/, Feliz Natal cara!";


    // Métodos
    public CartaoNatalino(String destinatario){super(destinatario); }

    @Override
    public void showMessage() {
        System.out.println("\nDestinatario: " + getDestinatario() + "\nMensagem: " + mensagemDaDataComemorativa);
    }
}
