import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String senha = "12345";
        String digitou;

        int tentativas = 0;

        do {
            System.out.println("Digite a senha");
            digitou = in.next();
            tentativas++;
        } while (!senha.equals(digitou));

        System.out.println("VC ACERTOU A SENHA EM " + tentativas  + " TENTATIVAS");

    }
}