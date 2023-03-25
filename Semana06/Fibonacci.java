import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 1;
        int b = 1;
        int c = 2;
        int max;

        System.out.println("DIGITE UM NUMERO");
        max = in.nextInt();
        System.out.print(a + "  " + b);
        
        while (c < max) {
            System.out.print("   " + c);
            a = b;
            b = c;
            c = a+b;
        }        

    }
}