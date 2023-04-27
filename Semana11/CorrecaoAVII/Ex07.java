import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int quantAsteriscos;
        int i;

        while ( n > 0) {
            quantAsteriscos = n * 2 - 1;

            i = 0;
            while (i < quantAsteriscos) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            n--;
        }
    }
}