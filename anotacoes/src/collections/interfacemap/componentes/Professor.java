package interfacemap.componentes;

public class Professor extends Pessoa{
    private String soDoProfessor;

    // ENCAPSULAMENTO
    public void setsoDoProfessor(String soDoProfessor) {
        this.soDoProfessor = soDoProfessor;
    }
    public String getsoDoProfessor() {
        return this.soDoProfessor;
    }
}
