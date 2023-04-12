import java.util.Scanner;

public class Primos {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println(Integer.MAX_VALUE);
        int numero = in.nextInt();
        int contador = 2;

        int divisores = 0;
        while (contador < numero/2) {
            if (numero % contador == 0) {
                System.out.println("DIVISVEL POR " + contador);
                divisores = 1;
                break;
            }
            contador++;
        }

        if (divisores == 0) {
            System.out.println("NUMERO PRIMO");
        }


    }
}
