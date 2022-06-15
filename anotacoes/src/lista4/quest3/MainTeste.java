package quest3;
import quest3.componentes.Number;
import quest3.componentes.NumberTeste;

public class MainTeste {
    public static void main(String[] args) {
        
        Number numberTeste = new Number(14);
        NumberTeste numberTeste2 = new NumberTeste(14);

        
        

        System.out.println(numberTeste.toString());
        System.out.println(numberTeste.equals(numberTeste2));
        System.out.println(numberTeste.hashCode());
    }
}
