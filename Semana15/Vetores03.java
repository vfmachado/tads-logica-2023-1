import java.util.Scanner;

// vetor com tamanho definido pelo usuario
public class Vetores03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanho = in.nextInt();

        int [] valores = new int[tamanho];

        for (int idx = 0; idx < valores.length; idx++) {
            System.out.printf("valores[%d] => %d\n", idx, valores[idx]);
        }

    }
}
