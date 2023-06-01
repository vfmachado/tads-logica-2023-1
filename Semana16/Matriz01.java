import java.util.Scanner;

public class Matriz01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declaracao
        int[][] board;
        int linhas = in.nextInt();
        int colunas = in.nextInt();

        // inicializacao com tamanho definido pelo user
        board = new int[linhas][colunas];
        
        for (int linha = 0; linha < TAM; linha++)  {
            for (int coluna = 0; coluna < TAM; coluna++) {
                System.out.print(board[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}