package testandoequals.componentes;

public class Aluno extends Pessoa{
    // Palavrinha mágica "extends", reservada pra falar que a classe Aluno herda todos os 
    // atributos e métodos da classe Pessoa.

    // Ao invés de agora fazer referência aos atributos da classe com o "this", vai ser usado o 
    // "super" pra fazer referência aos atributos da classe pai.
    private String soDoAluno;
    private int cpf;
    private String nome;

    // Setando e Guetando os valores
    public void setsoDoAluno(String soDoAluno) {
        this.soDoAluno = soDoAluno;
    }
    public String getsoDoAluno() {
        return this.soDoAluno;
    }

    public Aluno(int cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    // Métodos
    
}
