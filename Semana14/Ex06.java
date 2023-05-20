import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int numero = 1000; numero <= 9999; numero++) {

            int parte1, parte2;

            parte2 = numero % 100;
            parte1 = numero / 100;

            int soma = parte1 + parte2;
            int quadrado = soma * soma;

            if (quadrado == numero) {
                System.out.println("ACHEI O NUMERO " + numero);
            }
        }
    }
}