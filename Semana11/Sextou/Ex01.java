import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quantidade = in.nextInt();

        int contador;

        contador = 0;
        while (contador < quantidade) {
            System.out.println("REPETINDO... ");
            contador++;
        }

        for ( contador = 0 ;  contador < quantidade  ;  contador++  ) {
            System.out.println("FOR >> " + contador);
        }
    }
}