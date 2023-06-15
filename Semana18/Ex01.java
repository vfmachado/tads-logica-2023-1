
public class Ex01 {
    public static void main(String[] args) {

        int soma, menor, maior;
        menor = 99999;
        maior = -99999;

        int [][] mat = {
            { 1, 1, 1, 1, 1},   // 5
            { 1, 1, 1, 1, 2},   // 6
            { 1, 1, 1, 1, 3},   // 7
            { 1, 1, 1, 1, 10},  // 14
            { 1, 1, 1, 1, 4},   // 8
        }; 

        // i => linha
        // j => coluna
        for (int i = 0; i < mat.length; i++) {
            soma = 0;
            for (int j = 0; j < mat.length; j++) {
                soma = soma + mat[i][j];
            }
            System.out.println("Soma da linha [" + i + "] = " + soma);

            if (i == 0) {
                maior = soma;
                menor = soma;
            } else {
                if (soma > maior) {
                    maior = soma;
                }
                if (soma  < menor) {
                    menor = soma;
                }
            }

            System.out.println("MAIOR SOMA ATUAL " + maior);
            System.out.println("MENOR SOMA ATUAL " + menor);
            System.out.println();
        }

        int diferenca = maior - menor;
        System.out.println("A diferenca entre a maior e menor soma eh " + diferenca);

    }
}