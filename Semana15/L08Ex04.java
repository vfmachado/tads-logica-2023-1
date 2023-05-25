import java.util.Scanner;

public class L08Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tamanho = 6;
        int[] vet = new int[tamanho];

        System.out.println("DIGITE OS VALORES DO SEU VETOR");
        // RESOLVE SÓ ESSE PROBLEMA
        for (int i = 0; i < vet.length; i++) {
            vet[i] = in.nextInt();
        }

        // mostrar apenas os valores pares
        System.out.println(" +++ PARES +++");
        for (int i = 0; i < vet.length; i++) {
           if (vet[i] % 2 == 0) {
            System.out.println(vet[i]);
           }
        }

        System.out.println(" +++ IMPARES +++");
        for (int i = 0; i < vet.length; i++) {
           if (vet[i] % 2 != 0) {
            System.out.println(vet[i]);
           }
        }
    }
}