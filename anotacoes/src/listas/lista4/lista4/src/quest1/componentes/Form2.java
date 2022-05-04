package quest1.componentes;

public class Form2 {
    private String nome = "Dalberto";
    private String matricula = "2121.21.12";
    private String idade = "67";
    private String sexo = "Masculino";

    
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
    public void formulario2(){
        System.out.println("\nNome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }
}
