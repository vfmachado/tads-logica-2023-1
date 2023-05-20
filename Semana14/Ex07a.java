import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tam, salto;
        tam = in.nextInt();
        salto = in.nextInt();

    
        for (int contador = 0; contador < tam * tam; contador++) {
            
                if (contador % salto == 0) {
                    System.out.print(" O ");
                } else {
                    System.out.print(" * ");
                }
                contador++;
            
            if (contador % tam == 0)
            System.out.println();
        }


    }
}