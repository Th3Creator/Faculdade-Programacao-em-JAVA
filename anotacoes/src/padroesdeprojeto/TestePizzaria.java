import factoryDaPizzaria.Pizza;
import factoryDaPizzaria.PizzaCalabresa;
import factoryDaPizzaria.Pizzaria;

public class TestePizzaria {
    public static void main(String[] args) {
        // Pizza pizza = new PizzaCalabresa();
        // System.out.println(pizza);
        // Pizza pizza2 = new Pizza("Novo sabor"); colocando protected, não podendo mais criar uma pizza dela
        // OBS:  A criação de pizza vai ser feita somente conforme ali em baixo...

        
        Pizza minhaPizza = Pizzaria.CriaPizza("Tuti-Fruti");
        System.out.println(minhaPizza);
        
    }
}
