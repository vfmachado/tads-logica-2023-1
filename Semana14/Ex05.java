import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor de N");
        int n = in.nextInt();

        for (int a = 0; a < n; a++) {
            System.out.println("CASO DE TESTE # " + a);
            System.out.println("Informe os valores de x e y");
            
            int x, y;
            int soma = 0;
            x = in.nextInt();
            y = in.nextInt();

            if (x % 2  == 0 ) x++;

            for (int i  = x; i < y; i = i + 2) {
                System.out.println("Somando o valor " + i);
                soma = soma + i;
            }

            System.out.println("SOMA " + soma);
        }
    }
}