package componentes;

public class Gestaoacademica {
    // Atributos
    private String matricula; 
    private String nome;
    private String curso;
    private String[] Disciplinas = new String[10];
    private int indicediscplina = 0;
    //obs: esse private, public e protected são nomeados como modificadores de acesso.  
    // public: Consegue ser acessado até na classe principal.
    // private: É acessado somente no construtor.
    // default: Só é possível acessa-lo caso esteja no mesmo pacote.
    // protected: Quando é trabalhado com herança. É um private só que destinado a heranças.

    
    // Encapsulamento
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return this.matricula;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return this.curso;
    }


    // Métodos
    public void matricular(String disciplinas) {
        this.Disciplinas[indicediscplina] = disciplinas;
        indicediscplina++;
    }
    public String[] consultarDisciplinasMatriculadas() {
        String disciplinasMatriculadas[] = new String[indicediscplina];

        int cont = 0;

        while (cont < disciplinasMatriculadas.length) {
            disciplinasMatriculadas[cont] = this.Disciplinas[cont];
            cont++;
        }
        return disciplinasMatriculadas;
    }
    public void imprimeDisciplinasMatriculadas() {
        for (int i = 0; i < indicediscplina; i++) {
            System.out.println(Disciplinas[i]);
        }
    }


    // Métodos do Main Gestão Acadêmica 2.0
    public Gestaoacademica(String mat, String nome, String curso) {
        this.matricula = mat;
        this.nome = nome;
        this.curso = curso;

        //Validações antes de ser aprovado a matrícula do meliante
        if(mat == "" || mat == null){
            System.out.println("Pera la" + " " + nome + " " + ", matricula invalida guerreiro");
        }
        else{
            System.out.println("\n\nBem vindo ao novo Sistema de Gestão Academica" + " " + nome);
        }
    }
    // Usando ele vai ser necessário passar os parâmetros como é pedido


    /* 
        obs: Todo método construtor ele tem o mesmo nome da classe e não tem tipo de retorno.
        toda vez que tiver criando um objeto irá chamar esse método construtor, ainda vai ser ne
        cessário passar o set e o método get, pois diferente de como era antes agora só é preciso 
        setar os valores diretamente no método construtor, e pra isso acontecer é necessário já ter
        criado eles antes. 
    */
}
