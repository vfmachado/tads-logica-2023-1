import java.util.Scanner;

public class TicTacToe {

    static void mostraTabuleiro(char[] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            if (i % 3 == 0) {
                System.out.println();
                System.out.println(" - - - - - -");
                System.out.print("| ");
            }
            System.out.print(tabuleiro[i] + " | ");
            
        }
        System.out.println();
        System.out.println(" - - - - - -");         
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int posicao;
        char vez = 'O';
        char [] tabuleiro = new char[9];

        for (int i = 0; i < tabuleiro.length; i++) {
            tabuleiro[i] = ' ';
        }

        tabuleiro[0] = 'X';
        tabuleiro[5] = 'X';
        tabuleiro[8] = 'X';
        tabuleiro[4] = 'O';
        tabuleiro[6] = 'O';

        while (true) {
            
            mostraTabuleiro(tabuleiro);
            System.out.println(vez + " ONDE DESEJA JOGAR? ");
            posicao = in.nextInt();

            if (tabuleiro[posicao] != ' ') {
                System.out.println("POSICAO JA FOI PREENCHIDA");
                continue;
            }

            tabuleiro[posicao] = vez;

            // verificar todas as linhas
            boolean ganhou = false;
            for (int linha = 0; linha < 3; linha++) {
                if (tabuleiro[0 + linha*3] != ' ' &&
                    tabuleiro[0 + linha*3] == tabuleiro[1 + linha*3] && 
                    tabuleiro[1 + linha*3] == tabuleiro[2 + linha*3]) {
                    System.out.println("LINHA COMPLETA " + linha);
                    ganhou = true;
                    break;
                }
            }
            
            // TODO TEMA DE CASA - FAZER PARA AS COLUNAS E AS DIAGONAIS

            if (ganhou) break;

            // verificar todas as colunas
            // verificar as diagonais

            if (vez == 'O') {
                vez = 'X';
            } else {
                vez = 'O';
            }
        }
    }
}