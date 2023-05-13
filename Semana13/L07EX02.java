import java.util.Scanner;

public class L07EX02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String repetir = "sim";

        while (true) {
            int numero;

            do {
                System.out.println("DIGITE UM VALOR");
                numero = in.nextInt();
            } while (numero < 0);
            
            // for para numeros pares
            System.out.print("PARES >> ");
            for (int i = 2; i < numero; i = i + 2) {
                System.out.print(i + "  ");
            }
            System.out.println();

            System.out.println("REPETIR (sim/nao)");
            repetir = in.next();
            if (repetir.equals("nao")) {
                break;
            }
        }

    }
}