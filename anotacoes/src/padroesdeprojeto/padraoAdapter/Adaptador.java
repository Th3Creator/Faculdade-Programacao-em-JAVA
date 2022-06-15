package padraoAdapter;

public class Adaptador extends TomadaDeDoisPinos{
    private TomadaDeTresPinos objTomadaDeTresPinos;

    public Adaptador(TomadaDeTresPinos tomadaDeTresPinos){
        this.objTomadaDeTresPinos = tomadaDeTresPinos;
    }

    @Override 
    public void ligarNaTomadaDeDoisPinos(){
        objTomadaDeTresPinos.ligarNaTomadaDeTresPinos();
    }
}
// Fazer com que ele seja um adaptador da tomada de três pinos