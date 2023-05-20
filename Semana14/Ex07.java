import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tam, salto;
        tam = in.nextInt();
        salto = in.nextInt();

        int contador = 0;

        for (int linha = 0; linha < tam; linha++) {
            for (int coluna = 0; coluna < tam; coluna++) {
                if (contador % salto == 0) {
                    System.out.print(" O ");
                } else {
                    System.out.print(" * ");
                }
                contador++;
            }
            System.out.println();
        }


    }
}