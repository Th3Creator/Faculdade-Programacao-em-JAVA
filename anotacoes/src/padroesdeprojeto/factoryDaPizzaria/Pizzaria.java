package factoryDaPizzaria;

public class Pizzaria {

    public static Pizza CriaPizza(String sabor){
        if(sabor.equals("Calabresa")){
            return new PizzaCalabresa();
        }
        else if(sabor.equals("Mussarela")){
            return new PizzaMussarela();
        }
        else if(sabor.equals("Quatro Queijos")){
            return new PizzaQuatroQueijos();
        }   
        else{
            return new Pizza(sabor);
        }
    }

    
}
