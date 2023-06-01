import java.util.Scanner;

public class Matriz03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declaracao inicializada
    
        int[][] board;

        System.out.println("Informe a quantidade de linhas");
        int linhas = in.nextInt();

        board = new int[linhas][];

        for (int linha = 0; linha < linhas; linha++) {
            System.out.println("PARA A LINHA " + linha + " INFORME O TAMANHO");
            int colunas = in.nextInt();
            board[linha] = new int[colunas]; 
        }
        
        for (int linha = 0; linha < board.length; linha++)  {
            for (int coluna = 0; coluna < board[linha].length; coluna++) {
                System.out.println("para a linha " + linha + " e coluna " + coluna + " qual o valor ? ");
                board[linha][coluna] = in.nextInt();
            }
        }

        
        for (int linha = 0; linha < board.length; linha++)  {
            for (int coluna = 0; coluna < board[linha].length; coluna++) {
                System.out.print(board[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}