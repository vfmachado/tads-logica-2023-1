import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;
        int divisores, soma;

        int contador;
        contador = 0;

        while (contador < 1000) {
            numero = contador;
            divisores = 1;
            soma = 0;
            while (divisores < numero) {
                if (numero % divisores == 0) {
                    // System.out.println("DISIVEL POR " + divisores);
                    soma = soma + divisores;
                }
                divisores++;
            }
            if (soma == numero) {
                System.out.println("NUMERO PERFEITO " + numero);
            } 
            
            contador++;
        }

    }
}
