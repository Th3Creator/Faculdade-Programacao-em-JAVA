package quest1.componentes;

public class Form1 {
    private String nome = "Pisquila";
    private String matricula = "666.666.666-14";
    private String idade = "1000 A.C";
    private String sexo = "Indefinido";


    // Encapsulamento
    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getIdade(){
        return idade;
    }

    public String getSexo(){
        return sexo;
    }

    // Form
    public void formulario1(){
        System.out.println("\nNome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }
}
