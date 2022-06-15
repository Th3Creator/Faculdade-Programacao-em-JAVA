package quest2;
import quest2.controlador.Cliente;

import quest2.controlador.Gerente;
import quest2.controlador.Vendedor;

public class MainEXE {
    public static void main(String[] args) {
        Cliente client1 = new Cliente("Camila", 19, "Muitho Muié",1256.87, 19062003);

        Gerente gerent1 = new Gerente("Pisquila", 28, "Muitho Macho", 3500.00,  "21.1.234",  "Quero-Quero");
        Vendedor vend1 = new Vendedor("Pedrin", 36, "Muito Macho", 4200.00, "21.1.342", 550.60, 70);

        System.out.println(client1.toString());
        System.out.println(gerent1.toString());
        System.out.println(vend1.toString());


        /* 
            Ajustes: Imprimir só o que ele tá pedindo, fazer o método Inss e imprimilo junto também com 
                     os demais.
        
        */
    }
}
