import java.util.Scanner;

public class ExUns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantidade = in.nextInt();


        for (   ; quantidade > 0; quantidade--) {
        
            int numero = in.nextInt();

            if (numero % 2 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }

}
