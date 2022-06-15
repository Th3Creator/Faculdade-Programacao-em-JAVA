package quest4;
import quest4.componentes.Oficina;

public class MainTeste {
    public static void main(String[] args) {

        Oficina ofcCarlao = new Oficina();
        int Veiculo;

        for(int i = 0; i < 4; i++){
            Veiculo = ofcCarlao.proximo();
            ofcCarlao.manutencao(Veiculo);
        }
    }
}
