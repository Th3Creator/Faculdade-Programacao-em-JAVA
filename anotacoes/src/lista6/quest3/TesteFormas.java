package quest3;
import quest3.factoryFormasGeometricas.Fabrica1;
import quest3.factoryFormasGeometricas.FabricaAbstrata;
import quest3.factoryFormasGeometricas.FormasGeometricas;

import quest3.factoryFormasGeometricas.Fabrica1;
import quest3.factoryFormasGeometricas.Fabrica2;

public class TesteFormas {
    public static void main(String[] args) {
        
        // Processo de fabricação da Fábrica 1
       FabricaAbstrata forma = new Fabrica1();
       FormasGeometricas formageometrica = forma.FactoryForma("Triangulo");
       System.out.println(formageometrica);

       // Processo de fabricação da Fábrica 2
       FabricaAbstrata forma2 = new Fabrica2();
       FormasGeometricas formageometrica2 = forma2.FactoryForma("Triangulo");
       System.out.println(formageometrica2);
    }
}
