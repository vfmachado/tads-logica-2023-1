import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int linhas, colunas;
        int [][] matriz;

        linhas = in.nextInt();
        colunas = in.nextInt();

        matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = in.nextInt();
            }
        }

        int [] sl = new int[linhas];
        int [] sc = new int[colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                sl[i] = sl[i] + matriz[i][j];
            }
        }

        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                sc[j] = sc[j] + matriz[i][j];
            }
        }

        System.out.println("SOMA DAS LINHAS");
        for (int i = 0; i < sl.length; i++) {
            System.out.println(sl[i]);
        }

        System.out.println("SOMA DAS COLUNAS");
        for (int i = 0; i < sc.length; i++) {
            System.out.println(sc[i]);
        }
    }
}