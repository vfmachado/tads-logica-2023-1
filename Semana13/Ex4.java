import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
    
        int iteracoes = in.nextInt();
        double denominador = 1;
        double numerador = 1;
        double soma = 0;
        for (int i = 0; i < iteracoes; i++) {
            // System.out.println("NUM " + numerador);
            // System.out.println("DEN " + denominador);
            
            soma = soma + numerador / denominador;
            // System.out.println("SOMA: " + soma);
            
            numerador = numerador * -1;
            denominador = denominador + 2;
        }

        soma = soma * 4;
        System.out.println("TOTAL DA APROX " + soma);

    }
}