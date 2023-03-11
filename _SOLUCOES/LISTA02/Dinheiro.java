import java.util.Scanner;

public class Dinheiro {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int reais = in.nextInt();

        // TESTAR SEMPRE AS NOTAS MAIS ALTAS PRIMEIRO (PADRÃO)

        int notas50, notas10, notas5;

        notas50 = reais / 50;
        System.out.println("NOTAS DE 50: " + notas50);  

        reais = reais % 50; // reais = reais - notas50 * 50;
        System.out.println("AINDA PRECISO TE PAGAR " + reais);

        notas10 = reais / 10;
        System.out.println("NOTAS DE 10: " + notas10);  

        reais = reais % 10; // reais = reais - notas10 * 10;
        System.out.println("AINDA PRECISO TE PAGAR " + reais);
        

        notas5 = reais / 5;
        System.out.println("NOTAS DE 5: " + notas5);  

        reais = reais % 5; // reais = reais - notas5 * 5;
        System.out.println("AINDA PRECISO TE PAGAR " + reais);

    }
}