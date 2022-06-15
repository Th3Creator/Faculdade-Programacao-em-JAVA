package quest3.factoryFormasGeometricas;

public class Fabrica2 extends FabricaAbstrata{


    public FormasGeometricas FactoryForma(String forma){
        if(forma.equals("Triangulo")){
            return new Triangulo("Triangulo feito pela Fábrica 2");
        }
        else if(forma.equals("Circulo")){
            return new Circulo("Triangulo feito pela Fábrica 2");
        }
        else if(forma.equals("Quadrado")){
            return new Quadrado("Quadrado feito pela Fábrica 2");
        }   
        else {
            return new FormasGeometricas(forma);
        }
    }
}
