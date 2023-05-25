import java.util.Scanner;

public class Vetores02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int posicao;
        int valor;
        // DECLARACAO E INICIALIZACAO
        int [] valores = new int[10];
        // int valores[] = new int[10];

        /*
            int [] a, b, c;     a, b e c sao vetores
            int a, b, c[];      c eh um vetor
        */
        for (int i = 0; i < 5; i++) {
            System.out.println("INFORME UMA POSICAO (de 0 a 9) e um valor");
            posicao = in.nextInt();
            valor = in.nextInt();

            valores[posicao] = valor;
            
            for (int idx = 0; idx < valores.length; idx++) {
                System.out.printf("valores[%d] => %d\n", idx, valores[idx]);
            }
        }

      
    }
}