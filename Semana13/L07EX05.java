import java.util.Scanner;

public class L07EX05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        

        double numerador = 1;
        double denominador = 1;
        double fatorial = 1;
        double soma = 1;
        double x;

        x = in.nextDouble();

        for (int i = 0; i < 10; i++) {
            fatorial = denominador * fatorial;
            numerador = numerador * x;
            double divisao = numerador/fatorial;
            soma = soma + divisao;
            System.out.println(numerador + " / " + fatorial + " = " + divisao);
            denominador++;  
        }
        
        System.out.println("SOMA FINAL " + soma);
    }
}