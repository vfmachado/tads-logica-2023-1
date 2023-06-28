import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int [][] matriz = {
            { 8, 0, 7},
            { 4, 5, 6},
            { 3, 10, 2}
        };

        boolean ehMagico = true;

        int soma = 0;
        for (int coluna = 0; coluna < 3; coluna++) {
            soma = soma + matriz[0][coluna];
        }
    

        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha = somaLinha + matriz[i][j];
                somaColuna = somaColuna + matriz[j][i];
            }

            if (soma != somaLinha) {
                ehMagico = false;
            }
            if (soma != somaColuna) {
                ehMagico = false;
            }
        }

        int somaDiagonalP = 0;
        int somaDiagonalS = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalP = matriz[i][i];
            somaDiagonalS = matriz[i][2 -i];
        }

        if (soma != somaDiagonalP) {
            ehMagico = false;
        }
        if (soma != somaDiagonalS) {
            ehMagico = false;
        }

        if (ehMagico) {
            System.out.println("EH MAGICO");
        } else {
            System.out.println("NAO EH MAGICO");
        }
    }
}