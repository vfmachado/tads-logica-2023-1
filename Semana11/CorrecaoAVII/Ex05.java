import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome1, nome2, escolha1, escolha2;
        int numero1, numero2, soma, n;
        System.out.println("Quantos jogos serao feitos? ");
        n = in.nextInt();


        while (n > 0) {
            System.out.println("Informe os nomes, escolhas, numeros");
            nome1 = in.next();
            nome2 = in.next();

            escolha1 = in.next();
            escolha2 = in.next();

            numero1 = in.nextInt();
            numero2 = in.nextInt();

            soma = numero1 + numero2;
            if (soma % 2 == 0) {
                // resultado par, quem colocou par?
                if (escolha1.equals("par")) {
                    System.out.println(nome1);
                } else {
                    System.out.println(nome2);
                }
            } else {
                // resultado impar
                if (escolha1.equals("par")) {
                    System.out.println(nome2);
                } else {
                    System.out.println(nome1);
                }
            }
            n--;
        }

    }
}