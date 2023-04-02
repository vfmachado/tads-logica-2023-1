import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        int contador = 1;
        int quantDivisores = 0;
        int quantDivPares = 0;

        while (contador <= numero) {
            System.out.println("Contador: " + contador);

            // verificar se para cada valor do contador, o numero é divisivel
            if (numero % contador == 0) {
                System.out.println("\t" + numero + " EH  DIVISIVEL POR " + contador);
                quantDivisores++;

                if (contador % 2 == 0) {
                    quantDivisoresPares++;
                }
            }

            contador++;
        }
    
        System.out.println("TOTAL DE DIVISORES " + quantDivisores);
        System.out.println("TOTAL DE DIVISORES PARES " + quantDivisoresPares);

        if (quantDivisores == 2) {
            System.out.println("NUMERO PRIMO!!");
        } else {
            System.out.println("NUMERO NAO PRIMO")
        }
    }
}