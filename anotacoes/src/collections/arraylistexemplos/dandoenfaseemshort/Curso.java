package arraylistexemplos.dandoenfaseemshort;

public abstract class  Curso implements Comparable<Curso>{ // Agora sendo implementado o comparable, para comparar curso com curso utilizando o collections
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
    public abstract void escreveNaTela(); 
    // Colocando o abstract faz com que as classes que herdam de Curso obrigatoriamente criam esse método

    @Override
    public int compareTo(Curso obj) {
        if(this.getDuracao() < obj.getDuracao()){return -1;}
        if(this.getDuracao() > obj.getDuracao()){return 1;}
        return 0;
    }


}
