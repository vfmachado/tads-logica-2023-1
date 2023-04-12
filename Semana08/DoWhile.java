import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        int opcao = -1;
        while (opcao != 5) {
            // bloco 
        }
        */

        // FINAL => CONSTANTE
        final int SENHA = 1234;
        int opcao;
        int tentativas = 0;
        // FAÇA
        do {
            System.out.println("Informe a senha");
            opcao = in.nextInt();
            tentativas++;
        } while (opcao != SENHA && tentativas < 3);

        if (opcao == SENHA)
            System.out.println("SENHA CONFIRMADA");
        else
            System.out.println("CONTA BLOQUEADA POR EXCESSO DE TENTATIVAS");

    }
}