import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random sorteador = new Random();

        int numeroCerto = sorteador.nextInt(10) + 1;
        int numeroInformado = -1;
        int tentativas = 0;

        while (numeroInformado != numeroCerto && tentativas < 3) {
            System.out.println("Chute um numero ");
            numeroInformado = in.nextInt();
            tentativas++;
        }

        if (numeroInformado == numeroCerto) {
            System.out.println("VOCE PRECISOU DE " + tentativas + " PARA ACERTAR O NUMERO");
        } else {
            System.out.println("MAIS SORTE DA PROXIMA VEZ...");
        }




    }
}
