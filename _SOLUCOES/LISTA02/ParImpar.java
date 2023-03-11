import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // UTILIZANDO O OPERADOR DE RESTO
        // PODEMOS VERIFICAR SE UM NUMERO É DIVISIVEL POR OUTRO
        

        // POR EXEMPLO, UM NUMERO PAR É DIVISIVEL POR 2.
        // BASTA VERIFICAR SE O RESTO DA DIVISAO DO NUMERO POR 2 É IGUAL A ZERO

        int numero = in.nextInt();

        // verificar se ele é par
        int resto = numero % 2;
        System.out.println("O RESTO POR 2 FOI " + resto);

        if (resto == 0) {
            System.out.println("NUMERO PAR");
        } else {
            System.out.println("IMPAR");
        }


    }
}