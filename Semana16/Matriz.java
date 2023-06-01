import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TAM = 3;
                        // linha coluna
        int[][] board = new int[3][3];
        int posLinha, posColuna, valor;
        
        while (true) {

            for (int linha = 0; linha < TAM; linha++)  {
                for (int coluna = 0; coluna < TAM; coluna++) {
                    System.out.print(board[linha][coluna] + " ");
                }
                System.out.println();
            }


            System.out.println("Informe a linha, coluna  e o valor que deseja preencher");
            posLinha = in.nextInt();
            posColuna = in.nextInt();
            valor = in.nextInt();

            board[posLinha][posColuna] = valor;

        }

    }
}
