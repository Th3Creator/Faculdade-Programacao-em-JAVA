package quest4.componentes;

public class LanchoneteJP extends LanchoneteAbstrata{
    
    public Sandubao FactorySandubao(String Sanduiche){
        if(Sanduiche.equals("Sanduiche Básico")){
            return new Sandubao("Francês", "Mussarela", "Frango", "VERDURA");
        }
        else{
            return new Sandubao("NADA", "NADA", "NADA", "NADA");
        }
    }
}
