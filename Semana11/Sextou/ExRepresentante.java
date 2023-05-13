import java.util.Scanner;

public class ExRepresentante {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            quantidade de notas
            para cada uma das notas, o numero da matricula e a nota do estudante

            se a maior nota for maior ou igual a 8, mostro a matricula do aluno
            senao, mostro que nao enviarei um representante.
         */

        int quantNotas;
        int matricula;
        float nota;

        float maiorNota = 0;
        int maiorMatricula = -1;

        quantNotas = in.nextInt();
        while (quantNotas > 0) {

            System.out.println("MATRICULA E NOTA");
            matricula = in.nextInt();
            nota = in.nextFloat();

            if (nota > maiorNota) {
                maiorNota = nota;
                maiorMatricula = matricula;
            }
            quantNotas--;
        }

        System.out.println(" === MAIOR NOTA : " + maiorNota);
        if (maiorNota >= 8) {
            System.out.println("REPRESENTANTE " + maiorMatricula);
        } else {
            System.out.println("FALHAMOS MISERAVELMENTE!!!");
        }
        
    }
}

