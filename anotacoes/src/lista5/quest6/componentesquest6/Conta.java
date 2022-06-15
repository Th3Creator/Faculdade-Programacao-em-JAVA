package componentesquest6;

public class Conta {
    private double saldo = 0;
    private int limite;

    // Encapsulamento
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setLimte(int limte){
        this.limite = limte;
    }
    public int getLimite(){
        return this.limite;
    }

    // Métodos
    public void deposita(int dinheiro){
        this.saldo = saldo + dinheiro;
        System.out.println(getSaldo());
    }

    public void saca(int saque){
        this.saldo = saldo - saque;
        System.out.println(getSaldo());
    }
}
