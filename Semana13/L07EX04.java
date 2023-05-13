import java.util.Scanner;

public class L07EX04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double numerador = 1;
        double denominador = 1;
        double fatorial = 1;
        double soma = 1;

        for (int i = 0; i < n; i++) {
            fatorial = denominador * fatorial;
            double divisao = numerador/fatorial;
            soma = soma + divisao;
            System.out.println(numerador + " / " + fatorial + " = " + divisao);
            denominador++;  
        }
        
        System.out.println("SOMA FINAL " + soma);
    }
}