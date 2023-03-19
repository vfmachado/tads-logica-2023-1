import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero, un, dz, cen, milhar, resultado;

        System.out.println("Informe um numero");
        numero = in.nextInt();

        milhar = numero / 1000;
        cen = (numero % 1000)/100;
        dz = (numero % 100)/10;
        un = numero % 10;

        resultado = un * 1000 + dz * 100 +  cen * 10 + milhar;
        System.out.println("INVERTIDO: " + resultado);
    }
}
