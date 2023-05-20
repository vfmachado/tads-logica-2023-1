import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String tipo;
        int vinicial, razao;

        System.out.println("Informe o tipo de progressao, valor inicial e razao");
        tipo = in.next();
        vinicial = in.nextInt();
        razao = in.nextInt();

        int soma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println(vinicial);

            soma += vinicial;
            
            if (tipo.equals("PA")) {
                vinicial += razao;
            } else {
                vinicial *= razao;
            }
        }
        System.out.println("SOMA TOTAL DOS TERMOS " + soma);

    }
}