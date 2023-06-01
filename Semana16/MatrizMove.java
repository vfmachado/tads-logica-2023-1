import java.util.Scanner;

public class MatrizMove {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TAM = 8;
                        // linha coluna
        int[][] board = new int[TAM][TAM];

        board[4][4] = 5;

        int posLinha = 4;
        int posColuna = 4;
        String opcao;
        
        while (true) {

            for (int linha = 0; linha < TAM; linha++)  {
                for (int coluna = 0; coluna < TAM; coluna++) {
                    System.out.print(board[linha][coluna] + " ");
                }
                System.out.println();
            }


            System.out.println("QUAL SEU MOVIMENTO? ");
            opcao = in.next();

            switch (opcao) {
                case "w": 
                case "W":
                    board[posLinha][posColuna] = 0;
                    posLinha--;
                    if (posLinha == -1) {
                        posLinha = TAM -1;
                    }
                    board[posLinha][posColuna] = 5;
                    break;

                case "d": 
                case "D":
                    board[posLinha][posColuna] = 0;
                    posColuna++;
                    if (posColuna == TAM) {
                        posColuna = 0;
                    }
                    board[posLinha][posColuna] = 5;
                    break;
            }
        }

    }
}
