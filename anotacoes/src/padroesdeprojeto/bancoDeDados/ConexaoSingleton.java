package bancoDeDados;

public class ConexaoSingleton {
    private static ConexaoSingleton instance; // Uma instancia criada do tipo ConexaoSingleton, necessá-
    // ria por conta da validação de existir apenas uma Conexão.

    private String nome;
    private String senha;


    // Encapsulamento 
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return this.senha;
    }
    
    // Transformando o construtor em privado
    private ConexaoSingleton(){
        
    }

    // Deixando o contrutor privado é necessário que crie um método público para que ele seja instanciado
    public static ConexaoSingleton getInstance(){
        if(instance == null){
            instance = new ConexaoSingleton();
            return instance;
        }
        return instance; // Um bug aqui =(
    } 
    
    // OBS: O static faz com que o método se torna parte da classe e não do objeto, dessa forma fica 
    // indepente do objeto podendo ser criado em outros lugares sem depender do objeto.

    @Override
    public String toString() {
        return "Usuario: " + this.nome + " Senha: " + this.senha;
    }
}
