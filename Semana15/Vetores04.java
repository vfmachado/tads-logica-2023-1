import java.util.Scanner;

// vetor com valores ja definidos
public class Vetores04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // o tamanho e valores definidos
        int [] valores = { 2, 5, 10, 20, 50, 100 };

        for (int idx = 0; idx < valores.length; idx++) {
            System.out.printf("valores[%d] => %d\n", idx, valores[idx]);
        }

    }
}
