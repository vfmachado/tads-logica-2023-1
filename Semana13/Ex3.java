import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        int pares = 0;
        int impares = 0;
        int m3 = 0;
        int maior = -1;
        int menor = 999999999;
        int validos = 0;
        while (validos < 20) {
            valor = in.nextInt();
            if (valor < 0) {
                System.out.println("INVALIDO...");
                continue;
            } 
            
            validos++;

            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (valor % 3 == 0) {
                m3++;
            }

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("PARES: " + pares);
        System.out.println("IMPARES: " + impares);
        System.out.println("M3: " + m3);
        System.out.println("MAIOR: " + maior);
        System.out.println("MENOR: " + menor);

    }
}