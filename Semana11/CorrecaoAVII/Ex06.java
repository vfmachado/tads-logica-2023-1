import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valorInicial;
        int novoValor;

        System.out.println("Digite o valor inicial");
        valorInicial = in.nextInt();
        do {

            System.out.println("Insira um novo valor");
            novoValor = in.nextInt();

            if (novoValor != 0) {
                //divisivel por
                if (valorInicial % novoValor == 0) {
                    System.out.println("DIVISOR DO ANTERIOR");
                } else if (novoValor % valorInicial == 0) {
                    System.out.println("MULTIPLO DO ANTERIOR");
                } else {
                    System.out.println("NADA NADA NADA");
                }
            }

            valorInicial = novoValor;

        } while (novoValor != 0);
    }
}