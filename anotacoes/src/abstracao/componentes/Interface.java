package abstracao.componentes;

public interface Interface { // Interface ou também muito chamado de container
    // Uma classe abstrata e todos os seus membros são abstratos.
    // Ou seja, tudo que tem aqui é obrigatório que tenha nas outras também.

    public void insereObjeto(Object obj);
    public void retorneObjeto(int obj);
    public int obterNumeroDeObjetos();
    public void escreveObjetosNaTela();

    // Conclusão, por ser obrigatório às criações dos métodos vindo de uma interface,
    // por natureza tudo que se herda dela é abstrato por natureza.
}
