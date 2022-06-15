import componentesquest6.Conta;

public class MainTesteQuest6 {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        
        minhaConta.deposita(100);
        minhaConta.setLimte(100);
        minhaConta.saca(1000);
    }
}
