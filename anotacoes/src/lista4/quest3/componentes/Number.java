package quest3.componentes;

public class Number {
    private int numeroInteiro;



    // Métodos
    public int getValue(){
        return numeroInteiro;
    }

    public Number(int numeroInteiro){
        this.numeroInteiro = numeroInteiro;
    }


    // Sobrescrita dos métodos 
    // equals()
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Number){
            return true;
        }
        else {
            return false;
        }
    }
    
    // hashCode()
    
    @Override
    public int hashCode(){
        return this.numeroInteiro;
    }
    

    // toString() 
    @Override 
    public String toString(){
        return "O valor armazenado é:" + getValue();
    }
}
