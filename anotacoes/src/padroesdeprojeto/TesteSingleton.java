import bancoDeDados.ConexaoSingleton;

public class TesteSingleton {
    public static void main(String[] args) {
        
       /*  
        ConexaoSingleton conexao1 = new ConexaoSingleton();
        OBS: Maneira antiga de se construir um objeto, caso o construtor fosse público
       */ 


        ConexaoSingleton conexao1 = ConexaoSingleton.getInstance();
        
        conexao1.setNome("Pisquila");
        conexao1.setSenha("Pinguço123");

        System.out.println(conexao1);

        /* 
            Garantir que exista apenas uma instancia dessa em memória, mesmo que se fosse criado uma
            conexao2 ali, seria o mesmo Usuário e Senha, deixando assim em evidência as características
            do tipo de Padrão de Projeto: Singleton.
        */ 
    }
}
