import java.util.Scanner;

public class L08Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("INFORME O TAMANHO DO VETOR");
        int tamanho = in.nextInt();
        int[] vet = new int[tamanho];

        System.out.println("DIGITE OS VALORES DO SEU VETOR");
        // RESOLVE SÓ ESSE PROBLEMA
        for (int i = 0; i < vet.length; i++) {
            vet[i] = in.nextInt();
        }

        System.out.println("MOSTRE OS VALORES DO VETOR NA ORDEM INVERSA");
        // RESOLVE SÓ ESSE PROBLEMA
        for (int i = tamanho -1; i >= 0; i--) {
            System.out.println(i + " => " + vet[i]);
        }

        // for (int i = 0; i < tamanho; i++) {
        //     System.out.println(i + " => " + vet[tamanho -1 - i]);
        // }

            // int [] v2 = new int[tamnho];
            // for (int i = 0; i < tamanho; i++) {
            //     v2[tamanho -1 - i] = vet[i];
            // }
    }
}