import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hinicial, hfinal, duracao;
        System.out.println("INFORME QUANDO COMECOU E TERMINOU A PARTIDA");
        hinicial = in.nextInt();
        hfinal = in.nextInt();

        if (hfinal < hinicial) {
            duracao = 24 - hinicial + hfinal;
        } else {
            duracao = hfinal - hinicial;
        }

        System.out.println("DURACAO DA PARTIDA: " + duracao);
    }
}