import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("TA TUDO CERTO!");
        int idade, idadeAnoPassado;
       
        System.out.print("INFORME A SUA IDADE: ");
        idade = in.nextInt();

        idadeAnoPassado = idade - 1;    
        System.out.println("Ano passado, nesta mesma epoca vc tinha " + idadeAnoPassado);

    }
}