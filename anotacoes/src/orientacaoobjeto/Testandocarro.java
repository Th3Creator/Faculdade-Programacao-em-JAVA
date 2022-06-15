import componentes.Carro;

public class Testandocarro {
    public static void main(String[] args) {

        Carro c1 = new Carro();

        
        c1.placa = "ABE315";
        c1.cor = "Azul";
        c1.valor = 15000;
        c1.modelo = "Esportivo";
        c1.quantidadeDePneus = 4;

        System.out.println(c1.modelo);
    }
}
