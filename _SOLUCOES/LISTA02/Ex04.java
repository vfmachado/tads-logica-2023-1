import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;

      
        System.out.println("Informe dois valores");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println("A VAR num1 CONTEM O MAIOR VALOR " + num1);
        } else if (num1 < num2) {
            System.out.println("A VAR num2 CONTEM O MAIOR VALOR " + num2);
        } else {
            System.out.println("VALORES IGUAIS");
        }
        
        
                
    }
}