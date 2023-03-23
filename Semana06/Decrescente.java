import java.util.Scanner;

public class Decrescente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // MOSTRAR OS NUMEROS DE 10 A 1
        int numero = in.nextInt();
        System.out.print("AM");
        while (numero >= 1) {
            System.out.print("O");
            numero--;
        } 

        System.out.println( " JAVA ");
    }
}