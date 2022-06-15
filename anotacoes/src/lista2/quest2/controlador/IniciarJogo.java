package quest2.controlador;
import java.util.Scanner;

public class IniciarJogo {
    private Grade  grade;
    private String ply1;
    private String ply2;
    private int cont = 1;

    private int vez = 0;
    private int quant_jogadas = 1;
    private int linha;
    private int coluna;

    Scanner sc = new Scanner(System.in);

    public void Jogar(){
      grade = new Grade();
      
      // Insirindo nome dos jogadores
      System.out.println("Quem vai ser o jogador 1?");
      ply1 = sc.nextLine();
      System.out.println("\nQuem vai ser o jogador 2?");
      ply2 = sc.nextLine();


      // Zerando e imprimindo a matriz antes de começar o jogo
      grade.zerandoGrade();
      grade.imprimindoGrade();
      String[][] gradeexportada = grade.getGradeDoJogo();


      // Validações
      while (this.quant_jogadas <= 9) {
        // Esqueminha pra mostrar qual lista tá sendo impressa
        if(vez%2 == 0){
          System.out.println("Vez do jogador" + " " + ply1);
        }
        else{
          System.out.println("Vez do jogador" + " " + ply2);
        }

        System.out.println("\nDigite a linha jogador");
        linha = sc.nextInt();
        System.out.println("Digite a coluna jogador");
        coluna = sc.nextInt();


        if (linha < 0 || linha > 3 || coluna < 0 || coluna > 3) {
          System.out.println("\nDeu ruim alemão,nao existe essa linha ou coluna ai não =(");
        } else if (gradeexportada[linha -1][coluna-1] == "X" && gradeexportada[linha -1][coluna-1] == "O") {
          System.out.println("\nDeu ruim alemão, querendo marcar na onde ja tem marcaçao =(");
        } 
        else if (gradeexportada[linha -1][coluna-1] == "O" && gradeexportada[linha -1][coluna-1] == "X"){
          System.out.println("\nDeu ruim alemão, querendo marcar na onde ja tem marcaçao =(");
        }
        // Validações de vitória
        else if(gradeexportada[0][0] == "X" && gradeexportada[0][1] == "X" && gradeexportada[0][2] == "X"){
            quant_jogadas = 11;
        }
        else if (gradeexportada[1][0] == "X" && gradeexportada[1][1] == "X" && gradeexportada[1][2] == "X"){
          quant_jogadas = 11;
        }
        else if (gradeexportada[2][0] == "X" && gradeexportada[2][1] == "X" && gradeexportada[2][2] == "X"){
          quant_jogadas = 11;
        }
        else if (gradeexportada[0][0] == "X" && gradeexportada[1][0] == "X" && gradeexportada[2][0] == "X"){
          quant_jogadas = 11;
        }
        else if (gradeexportada[0][1] == "X" && gradeexportada[1][1] == "X" && gradeexportada[1][2] == "X"){
          quant_jogadas = 11;
        }
        else if (gradeexportada[0][2] == "X" && gradeexportada[1][2] == "X" && gradeexportada[2][2] == "X"){
          quant_jogadas = 11;
        }
        else if(gradeexportada[0][0] == "X" && gradeexportada[1][1] == "X" && gradeexportada[2][2] == "X"){
          quant_jogadas = 11;
        }
        else if(gradeexportada[0][2] == "X" && gradeexportada[1][1] == "X" && gradeexportada[2][0] == "X"){
          quant_jogadas = 11;
        }
        
        else if(gradeexportada[0][0] == "O" && gradeexportada[0][1] == "O" && gradeexportada[0][2] == "O"){
          quant_jogadas = 12;
      }
        else if(gradeexportada[1][0] == "O" && gradeexportada[1][1] == "O" && gradeexportada[1][2] == "O"){
        quant_jogadas = 12;
      }
        else if(gradeexportada[2][0] == "O" && gradeexportada[2][1] == "O" && gradeexportada[2][2] == "O"){
        quant_jogadas = 12;
      }
        else if(gradeexportada[0][0] == "O" && gradeexportada[1][0] == "O" && gradeexportada[2][0] == "O"){
        quant_jogadas = 12;
      }
        else if(gradeexportada[0][1] == "O" && gradeexportada[1][1] == "O" && gradeexportada[1][2] == "O"){
        quant_jogadas = 12;
      }
        else if(gradeexportada[0][2] == "O" && gradeexportada[1][2] == "O" && gradeexportada[2][2] == "O"){
        quant_jogadas = 12;
      }
        else if(gradeexportada[0][0] == "O" && gradeexportada[1][1] == "O" && gradeexportada[2][2] == "O"){
        quant_jogadas = 12;
      }
        else if(gradeexportada[0][2] == "O" && gradeexportada[1][1] == "O" && gradeexportada[2][0] == "O"){
        quant_jogadas = 12;
      }
      
        else {
              if(vez%2 == 0){
                gradeexportada[linha - 1][coluna -1] = "X"; 
              }
              else{
                gradeexportada[linha - 1][coluna -1] = "O"; 
              }
        vez++;
        quant_jogadas++;
        grade.imprimindoGrade();

        if(quant_jogadas == 10){
          System.out.println("Jogo empatado =(");
        }
        else if(quant_jogadas == 11){
          System.out.println(ply1 + " " + "foi campeão");
        }
        else if(quant_jogadas == 12){
          System.out.println(ply2 + " " + "foi campeão");
        }
        }
      }

    }
}

