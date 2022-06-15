package pessoas;

public class Professor extends Pessoa{
    private String soDoProfessor;

    // Setando e Guetando os valores
    public void setsoDoProfessor(String soDoProfessor) {
        this.soDoProfessor = soDoProfessor;
    }
    public String getsoDoProfessor() {
        return this.soDoProfessor;
    }
}
