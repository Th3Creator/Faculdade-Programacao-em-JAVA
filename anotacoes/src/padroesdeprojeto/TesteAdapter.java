import java.util.ArrayList;

import padraoAdapter.TomadaDeDoisPinos;
import padraoAdapter.TomadaDeTresPinos;
import padraoAdapter.Adaptador;

public class TesteAdapter {
    public static void main(String[] args) {
        TomadaDeDoisPinos tomadaDeDoisPinos = new TomadaDeDoisPinos();
        tomadaDeDoisPinos.ligarNaTomadaDeDoisPinos();

        TomadaDeTresPinos tomadaDeTresPinos = new TomadaDeTresPinos();
        tomadaDeTresPinos.ligarNaTomadaDeTresPinos();

        ArrayList<TomadaDeDoisPinos> equipamentosDoisPinos = new ArrayList<>();
        equipamentosDoisPinos.add(tomadaDeDoisPinos);
        // equipamentosDoisPinos.add(tomadaDeTresPinos); / iria dar erro pois aceita somente 2 pinos


        // UTILIZANDO O ADAPTADOR //

        Adaptador adaptador = new Adaptador(tomadaDeTresPinos);

        equipamentosDoisPinos.add(adaptador);
        // Conseguindo agora também ligar equipamentos de 3 pinos na tomada de dois pinos
    }
}
