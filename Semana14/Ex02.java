import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor, anterior;

        anterior = in.nextInt();

        while (true) {

            valor = in.nextInt();

            if (valor > 2 * anterior) {
                break;
            }

            anterior = valor;
        }


    }
}