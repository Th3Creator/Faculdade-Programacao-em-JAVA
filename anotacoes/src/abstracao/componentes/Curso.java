package abstracao.componentes;

public abstract class  Curso { // Não é mais possível contruir essa classe, ela agora é só um modelo a ser seguido
    private String modalidade;
    private int duracao;
    private int numeroDeVagas;

    // Encapsulamento
    public String getModalidade(){
        return modalidade;
    }
    public void setModalidade(String modalidade){
        this.modalidade = modalidade;
    }

    public int getDuracao(){
        return duracao;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public int getNumeroDeVagas(){
        return numeroDeVagas;
    }
    public void setNumeroDeVagas(int numeroDeVagas){
        this.numeroDeVagas = numeroDeVagas;
    }

    // Métodos 
    public abstract String getNome(); 
    // Colocando o abstract faz com que as classes que herdam de Curso obrigatoriamente criam esse método

    


}
