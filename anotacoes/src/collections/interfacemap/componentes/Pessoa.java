package interfacemap.componentes;

public class Pessoa {
    private String nome;
    private String endereco;
    private String cpf;
    private final String naturalidade = "Brasileiro";

    // Necessário a obrigatoriedade em passar as seguintes informações
    

    // Setando e Guetando os valores
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }

    // Métodos
    public void escreveObjetoNaTela(){
        System.out.println("Nome" + this.nome);
        System.out.println("CPF" + this.cpf);
        System.out.println("Origem" + this.naturalidade);
    }

}
