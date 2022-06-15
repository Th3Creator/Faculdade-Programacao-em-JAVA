package testandoequals.componentes;

public class Pessoa {
    private String nome;
    private String endereco;
    private int cpf;
    private final String naturalidade = "Brasileiro";
    

    // Encapsulamento
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
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getCpf() {
        return this.cpf;
    }


    // Métodos
    public void escreveObjetoNaTela(){
        System.out.println("Nome" + this.nome);
        System.out.println("CPF" + this.cpf);
        System.out.println("Origem" + this.naturalidade);
    }

    /* 
    @Override
    public boolean equals(Object obj) {
        Pessoa p = (Pessoa)obj;

        if(this.getCpf().equals(p.getCpf())){return true;}
        else{return false;}
    }
    */
}
