// COMENTARIO DE UMA LINHA
/*
QUANTAS LINHAS LINHAS EU QUISER

COMENTARIOS: SAO IGNORADOS PELO COMPILADOR
    - NAO INTERFERE NA HORA RODAR
    - NAO VAI PARA O .CLASS
    - MAS NOS AJUDA A LER O CODIGO!!
*/

import java.util.Scanner;

// mesmo nome do arquivo - para o compilador conseguir se localizar
public class Exemplo03 {
    // main -> principal -> mais importante -> ponto de entrada!!!
    public static void main(String[] args) {

        /*
            O professor precisa de um programa que dada duas notas, informe a situação final do aluno
            Quando a média for maior ou igual a 7, o aluno se encontrado aprovado, quando a média for menor que 3, o aluno está automaticamente escalado para o prox semestre, caso contrario, o professor vai colocar uma terceira nota, indicando a nota do exame, neste caso, o sistema deve calcular uma nova media entre a media anterior e a nota do exame, caso o resultado seja maior ou igual a 5, o aluno está aprovado, caso contrario, escalado para o prox semestre.
        */ 
        float nota1, nota2, notaExame, mediaParcial, mediaFinal;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe as duas notas");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();

        mediaParcial = (nota1 + nota2)/2;
        System.out.println("MEDIA " + mediaParcial);
                            // .0f para forcar o float no compilador
        if (mediaParcial >= 7.0f) {
            System.out.println("APROVADO");
        } else if (mediaParcial >= 3.0f) {
            System.out.println("EXAME");

            System.out.println("VOCE PRECISA INFORMAR A NOTA DO EXAME");
            notaExame = in.nextFloat();

            // calcular nova media
            mediaFinal = (mediaParcial + notaExame)/2;

            if (mediaFinal >= 5) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO COM EXAME");
            }

        } else {
            System.out.println("O ALUNO NAO TEM NOTA PARA O EXAME");
        }
    }
}