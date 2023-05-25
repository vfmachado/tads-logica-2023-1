import java.util.Scanner;

public class L08Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tamanho = 10;
        float[] vet = new float[tamanho];

        System.out.println("DIGITE OS VALORES DO SEU VETOR");
        // RESOLVE SÓ ESSE PROBLEMA
        for (int i = 0; i < vet.length; i++) {
            vet[i] = in.nextFloat();
        }

        // calculo da media
        float media = 0;
        float soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma = soma + vet[i];
        }
        media = soma/tamanho;

        System.out.println("MEDIA: " + media);

    }
}