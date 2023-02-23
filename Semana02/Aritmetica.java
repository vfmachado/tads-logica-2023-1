import java.util.Scanner;
public class Aritmetica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b;
        int soma, subtracao, multiplicacao, divisao, resto;

        System.out.println("Informe dois valores inteiros");
        a = in.nextInt();
        b = in.nextInt();

        soma = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        divisao = a / b;
        resto = a % b;
        
        System.out.printf("%d + %d = %d\n", a, b, soma);
        System.out.printf("%d - %d = %d\n", a, b, subtracao);
        System.out.printf("%d * %d = %d\n", a, b, multiplicacao);
        System.out.printf("%d / %d = %d\n", a, b, divisao);
        System.out.printf("%d %% %d = %d\n", a, b, resto);


    }
}