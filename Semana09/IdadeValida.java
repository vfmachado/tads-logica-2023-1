import java.util.Scanner;

public class IdadeValida {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade;

        do {
            System.out.println("Informe uma idade ");
            idade = in.nextInt();
            if (idade < 0 ) {
                System.out.println("  *** ERRO: a idade nao pode ser negativa");
            } else if (idade  > 150) {
                System.out.println("  *** ERRO: essa pessoa provavelmente nao está viva");
            }
        } while(idade < 0 || idade > 150);

        System.out.println("IDADE ACEITA");

    }
}