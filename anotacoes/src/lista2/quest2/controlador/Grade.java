package quest2.controlador;

public class Grade {
    private String[][] gradedojogo = new String[3][3];

    public void zerandoGrade(){
        for(int i = 0; i < gradedojogo.length; i++){
            for(int j = 0; j < gradedojogo.length; j++){
                gradedojogo[i][j] = " ";
            }  
        }
    }
    // https://www.guj.com.br/t/como-imprimir-matrizes/56367/7 como imprimir um do lado do outro

    public void imprimindoGrade() {
        System.out.printf("   |%s| |%s| |%s| \n", gradedojogo[0][0], gradedojogo[0][1], gradedojogo[0][2]);
        System.out.println("-----------------");
        System.out.printf("   |%s| |%s| |%s| \n", gradedojogo[1][0], gradedojogo[1][1], gradedojogo[1][2]);
        System.out.println("-----------------");
        System.out.printf("   |%s| |%s| |%s| \n", gradedojogo[2][0], gradedojogo[2][1], gradedojogo[2][2]);
    }

    // fazer um get da grade do jogo
    public String[][] getGradeDoJogo() {
        return this.gradedojogo;
    }
}


/* 
    for (int l = 0; l < gradedojogo.length; l++){
          for (int c = 0; c < gradedojogo[l].length; c++){
            System.out.println(gradedojogo[l][c] + " ");
          }
        }
*/