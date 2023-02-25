import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, n2, n3, res;
        System.out.println("Informe as 3 notas");
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        n3 = in.nextFloat();

        res = (n1 * 3 + n2 * 4 + n3 * 5) / (3 + 4 + 5);
        System.out.println("MEDIA POND: " + res);
    }
}