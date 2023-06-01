import java.util.Scanner;

public class Matriz02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declaracao inicializada
    
        int[][] board = {
            {1, 2, 3},
            {7, 3, 2, 5},
            {1, 2, 3, 4, 5, 6, 7, 8},
            {5, 6, 7}
        };
        // m.length => quantidade de linhas da matriz m
        // m[2].length => quantidade de colunas da linha 2 da matriz m
        for (int linha = 0; linha < board.length; linha++)  {
            for (int coluna = 0; coluna < board[linha].length; coluna++) {
                System.out.print(board[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}