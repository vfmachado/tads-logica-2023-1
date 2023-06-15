import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] vendas = {
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 8},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
        };

        int total = 0;

        System.out.println("\n\nMATRIZ VENDAS");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(vendas[i][j] + "  ");
                total += vendas[i][j];
            }
            System.out.println();
        }

        System.out.println("Para cada mes...");
        for (int i = 0; i < 12; i++) {
            int soma = 0;
            for (int j = 0; j < 4; j++) {
                soma = soma + vendas[i][j];
            }
            System.out.println("MES " + (i +1) + " => " + soma);
        }

        System.out.println("Para cada semana...");
        for (int coluna = 0; coluna < 4; coluna++) {
            int soma = 0;
            for (int linha = 0; linha < 12; linha++) {
                soma = soma + vendas[linha][coluna];
            }
            System.out.println("SEMANA " + (coluna +1) + " => " + soma);
        }

        System.out.println("TOTAL DE TUDO => " + total);
    }
}
