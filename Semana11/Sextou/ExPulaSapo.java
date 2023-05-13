import java.util.Scanner;

public class ExPulaSapo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alturaPulo = in.nextInt();
        int quantidadeCanos = in.nextInt();

        int alturaAtual, alturaCano;

        System.out.println("Informe a altura do cano inicial");
        alturaAtual = in.nextInt();

        // boolean ganhou = true;
        int i;
        for (i = 1; i < quantidadeCanos; i++) {
            System.out.println("Informe a altura do cano:");
            alturaCano = in.nextInt();

            if (alturaCano >= alturaAtual) {
                if (alturaCano - alturaAtual > alturaPulo) {
                    System.out.println("PERDEU");
                    // ganhou = false;
                    break;
                }
            } else {
                if (alturaCano - alturaAtual < -alturaPulo) {
                    System.out.println("PERDEU");
                    // ganhou = false;
                    break;
                }
            }
            alturaAtual = alturaCano;
        }

        if (i == quantidadeCanos) {
            System.out.println("GANHOU");
        }
    }
}
