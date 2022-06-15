package quest4.componentes;

public class LanchoneteRT extends LanchoneteAbstrata{

    public Sandubao FactorySandubao(String Sanduiche){
        if(Sanduiche.equals("Sanduiche Básico")){
            return new Sandubao("Bola", "Cheddar", "Peru", "SEM VERDURA");
        }
        else{
            return new Sandubao("NADA", "NADA", "NADA", "NADA");
        }
    }
}
