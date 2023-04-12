import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b;

        // do {
        //     b = in.nextInt();
        //     if (b == 100) {
        //         break;
        //     }
            
        //     a++;
        //     System.out.println("DEPOIS DO BREAK E MESMO ASSIM EU MOSTRO");

        // } while (a < 10);

         do {
            b = in.nextInt();
            if (b != 100) {
                a++;
                System.out.println("DEPOIS DO BREAK E MESMO ASSIM EU MOSTRO");
            }

            
        } while (a < 10 && b != 100);

        System.out.println("a => " + a);
        System.out.println("b => " + b);
    }
}