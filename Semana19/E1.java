import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] vet = new int[5];

        int maior = -99999;
        int menor = 99999;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = in.nextInt();
            if (vet[i] > maior) maior = vet[i];
            if (vet[i] < menor) menor = vet[i];
        }
        
        int quantMaior = 0;
        int quantMenor = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == maior) {
                quantMaior++;
            }
            if (vet[i] == menor) {
                quantMenor++;
            }
        }

        System.out.println("O MAIOR VALOR " + maior + " APARECE " + quantMaior);
        System.out.println("O MENOR VALOR " + menor + " APARECE " + quantMenor);

    }
}