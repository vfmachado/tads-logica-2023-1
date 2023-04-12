import java.util.Scanner;

public class Usina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float massa;
        int tempo = 0;

        System.out.println("Qual a massa inicial? ");
        massa = in.nextFloat();

        while (massa >= 0.1f) {
            massa = massa * 0.75f;
            tempo = tempo + 30;
            System.out.println("Passou " + tempo + "s e a massa atual eh de " + massa + "g");
        }

        System.out.println("Tempo necessario " + tempo + "s");
        int minutos = tempo / 60;
        int segundos = tempo % 60; // tempo = tempo - minutos * 60

        System.out.printf("%d:%d\n", minutos, segundos);
    }
}