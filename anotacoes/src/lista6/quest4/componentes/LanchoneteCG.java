package quest4.componentes;

public class LanchoneteCG extends LanchoneteAbstrata{

    public Sandubao FactorySandubao(String Sanduiche){
        if(Sanduiche.equals("Sanduiche Básico")){
            return new Sandubao("Integral", "Prato", "Frango", "SEM VERDURA");
        }
        else{
            return new Sandubao("NADA", "NADA", "NADA", "NADA");
        }
    }
}
