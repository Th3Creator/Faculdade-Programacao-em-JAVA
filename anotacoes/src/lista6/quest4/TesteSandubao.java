package quest4;

import quest4.componentes.LanchoneteAbstrata;
import quest4.componentes.LanchoneteCG;
import quest4.componentes.LanchoneteJP;
import quest4.componentes.LanchoneteRT;
import quest4.componentes.Sandubao;

public class TesteSandubao {
    public static void main(String[] args) { 
        // Criando as lanchonetes abstratas
        LanchoneteAbstrata lanchoneteCG = new LanchoneteCG();
        LanchoneteAbstrata lanchoneteJP = new LanchoneteJP();
        LanchoneteAbstrata lanchoneteRT = new LanchoneteRT();

        // Criando os sandubões KKKKKK através das fábricas abstratas
        Sandubao sandubaoDoCG = lanchoneteCG.FactorySandubao("Sanduiche Básico");
        Sandubao sandubaoDoJP = lanchoneteJP.FactorySandubao("Sanduiche Básico");
        Sandubao sandubaoDoRT = lanchoneteRT.FactorySandubao("Sanduiche Básico");

        // Imprimindo na sequência de criação...
        System.out.println(sandubaoDoCG);
        System.out.println(sandubaoDoJP);
        System.out.println(sandubaoDoRT);
    }
}
