package quest2;

import quest2.componentes.Incremental;

public class TesteIncremental {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            Incremental incremental =  Incremental.getInstance();
            System.out.println(incremental);
        }
    }
}
