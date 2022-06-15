package quest2.componentes;

public class CartaoDiaDosNamorados extends CartaoWeb{
    private final String mensagemDaDataComemorativa = "Meu maior defeito é te amar de mais";
    

    // Métodos
    public CartaoDiaDosNamorados(String destinatario){super(destinatario); }

    @Override 
    public void showMessage(){
        System.out.println("\nDestinatario: " + getDestinatario() + "\nMensagem: " + mensagemDaDataComemorativa);
    }
}
