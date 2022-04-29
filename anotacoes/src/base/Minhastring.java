package base;
public class Minhastring {
    public static void main(String[] args) {
        String nome = "Christian";
        String sobrenome = "Louzada";


        System.out.println(nome);
        System.out.println(nome.length()); // Retorna o número de letras dentro do nome
        System.out.println(nome + ' ' +sobrenome); // Existe também um método específico que faz isso lá

        System.out.println(nome.charAt(4)); // Pegando o caractere da 4° posição
        // Método também que tira os espaços em branco da string passada
    }
}
