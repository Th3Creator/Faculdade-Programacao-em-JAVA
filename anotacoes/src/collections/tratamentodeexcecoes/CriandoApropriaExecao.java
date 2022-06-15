package tratamentodeexcecoes;

public class CriandoApropriaExecao {
    public static void main(String[] args) {
        Componente componente = new Componente();

        try {
            System.out.println(componente);
        } catch (ComponenteExpection e) {
            System.out.println("vixe");
        }
    }
}
