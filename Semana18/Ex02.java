import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] matriz, transposta, soma, diferenca;
        int tamanho = in.nextInt();

        matriz = new int[tamanho][tamanho];
        transposta = new int[tamanho][tamanho];
        soma = new int[tamanho][tamanho];
        diferenca = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                int valor = in.nextInt();
                matriz[i][j] = valor;
                transposta[j][i] = valor;
            }
        }

        // for (int i = 0; i < tamanho; i++) {
        //     for (int j = 0; j < tamanho; j++) {
        //         transposta[j][i] = matriz[i][j];
        //     }
        // }

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                soma[i][j] = matriz[i][j] + transposta[i][j];
                diferenca[i][j] = matriz[i][j] - transposta[i][j];

            }
        }

        // RESULTADO ... NAO MEXO MAIS
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }


        System.out.println("\n\nMATRIZ TRANSPOSTA");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(transposta[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n\nMATRIZ SOMA");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(soma[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n\nMATRIZ DIFERENCA");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(diferenca[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
