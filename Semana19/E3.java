import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int linhas, colunas;
        int [][] matriz, transposta;

        linhas = in.nextInt();
        colunas = in.nextInt();

        matriz = new int[linhas][colunas];
        transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = in.nextInt();
                transposta[j][i] = matriz[i][j];
            }
        }
    }
}