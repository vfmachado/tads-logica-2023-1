import java.util.Scanner;

public class Ex02a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor, anterior;

        anterior = in.nextInt();

        for ( ; ; ) {

            valor = in.nextInt();

            if (valor > 2 * anterior) {
                break;
            }

            anterior = valor;
        }


    }
}