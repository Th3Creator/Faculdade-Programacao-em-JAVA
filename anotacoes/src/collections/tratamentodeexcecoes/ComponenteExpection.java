package tratamentodeexcecoes;

public class ComponenteExpection extends Exception{
    private String msg;

    public ComponenteExpection(String msg){
        this.msg = msg;
    }
}
