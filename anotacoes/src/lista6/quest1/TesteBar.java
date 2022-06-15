package quest1;

import quest1.barDaMagareth.BarSingleton;

public class TesteBar {
    public static void main(String[] args) {

        BarSingleton barDaMaga = BarSingleton.getInstance();

        barDaMaga.setNome("Aezio");
        barDaMaga.setAnosDebar(70);
        barDaMaga.setIdade(82);

        System.out.println(barDaMaga);
    }
}

/*
   OBSERVAÇÃO:
   Mesmo que instancie de novo, sempre vai ser o mesmo, que no caso é o Aézio com suas seguintes 
   informações. Atendendo aos Padrões de Projeto Singleton que impede a criação de mais uma instância
 */