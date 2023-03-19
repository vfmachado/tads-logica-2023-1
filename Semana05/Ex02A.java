import java.util.Scanner;

public class Ex02A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nlado, medida, resultado;
        
        System.out.println("informe a quantidade de lados e a medida do lado");
        nlado = in.nextInt();
        medida = in.nextInt();

        if (nlado == 3) {
            resultado = medida * 3;
            System.out.println("TRIANGULO DE PERIMETRO " + resultado);
        } else if (nlado == 4) {
            resultado = medida * medida;
            System.out.println("QUADRADO DE AREA " + resultado);
        } else if (nlado == 5) {
            System.out.println("PENTAGONO");
        } else {
            System.out.println("FIGURA DESCONHECIDA");
        }


    }
}