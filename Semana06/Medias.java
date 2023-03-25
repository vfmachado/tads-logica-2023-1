// FAÇA UM PROGAMA QUE DADO 5 NOTAS DAS AVALIACOES DE UM ALUNO, CALCULE A MEDIA ARITMETICA FINAL.
// ATENCAO, SÓ DEVE SER UTILIZADA 3 VARIAVEIS PARA RESOLVER O PROBLEMA.

import java.util.Scanner;

public class Medias {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int quantidade = 5;
        float nota, media = 0;

        while (quantidade > 0) {
            System.out.println("Informe uma nota ");
            nota = in.nextFloat();
            media += nota;
            quantidade--;
        }

        media = media / 5;
        System.out.println("MEDIA " + media);

    } 
}
