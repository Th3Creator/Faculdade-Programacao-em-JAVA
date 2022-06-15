package factoryDaPizzaria;

public class Pizza {
    private String sabor;

    // Encapsulamento
    public String getSabor(){
        return this.sabor;
    }

    protected Pizza(String sabor){
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return this.sabor;
    }
}
