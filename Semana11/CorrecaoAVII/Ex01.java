import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int vinicial, vfinal, passo;
        System.out.println("Informe vi, vf, passo");
        vinicial = in.nextInt();
        vfinal = in.nextInt();
        passo = in.nextInt();

        if (vinicial < vfinal) {
            while (vinicial <= vfinal) {
                System.out.println(vinicial);
                vinicial += passo;      // vinicial = vinicial + passo;
            }
        } else {
            while (vfinal <= vinicial) {
                System.out.println(vinicial);
                vinicial -= passo;   
            }
        }

    }
}