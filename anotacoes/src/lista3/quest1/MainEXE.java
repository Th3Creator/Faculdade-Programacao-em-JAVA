package quest1;
import quest1.controlador.Animal;
import quest1.controlador.Cachorro;
import quest1.controlador.Peixe;

public class MainEXE {
    public static void main(String[] args) {
        
        Cachorro cao1 = new Cachorro("Rex", 65.5, "American Bully");
        Peixe px1 = new Peixe("Peixonauta", 10.5, "Agua doce");
        
        System.out.println(cao1.toString());
        System.out.println(px1.toString());
    }
}
