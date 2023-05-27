import java.util.Scanner;

public class L08Ex09 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] definidos =   { 1,    2,      3,      4,      5};
        boolean[] acertos = {false, false, false, false, false};

        while (true) {
            // ler um valor e dizer se esta presente no vetor
            // caso esteja, em qual posicao?
            System.out.print("Informe um valor: ");
            int valor = in.nextInt();

            for (int posicao = 0; posicao < 5; posicao++) {
                if (valor == definidos[posicao]) {
                    System.out.println("A posição foi a: " + posicao);
                    acertos[posicao] = true;
                }
            }

            System.out.println("SEUS ACERTOS: ");
            int numeroTrues = 0;
            for (int posicao = 0; posicao < 5; posicao++) {
                System.out.println(acertos[posicao]);
                if (acertos[posicao] == true) {
                    numeroTrues++;
                }
            }

            // conta quantos true tem no vetor
            if (numeroTrues == 5) {
                System.out.println("VC ACERTOU ANTES DO BREAK");
                break;
            } 

            System.out.println("VC AINDA NAO ACERTOU TODOS OS VALORES... ");

        }

        System.out.println("VC ACERTOU FORA DO WHILE");
    }
}