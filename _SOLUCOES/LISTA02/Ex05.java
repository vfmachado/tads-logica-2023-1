import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float numerador, denominador, resultado;

        System.out.println("Informe dois valores");
        numerador = in.nextFloat();
        denominador = in.nextFloat();

        if (denominador == 0) {
            System.out.println("NAO POSSO DIVIDIR");
        } else {
            resultado = numerador / denominador;
            System.out.println("RESULTADO: " + resultado);
        }
        
        
                
    }
}