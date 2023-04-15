import java.util.Scanner;

public class L04Ex06 {
    public static void main(String[] args) {

        // SISTEMA PARA VALIDAR UM INPUT DO USUARIO, >= 1 E <= 10;
        // CASO O VALOR NAO SEJA VALIDO, DEVEMOS LER UM NOVO VALOR
        
        Scanner in = new Scanner(System.in);
        int valor;

        // ex 1
        // while (true) {
        //     System.out.println("Informe um valor: ");
        //     valor = in.nextInt();

        //     if (valor >= 1 && valor <= 10) {
        //         System.out.println("VALOR VALIDO");
        //         break;
        //     } else {
        //         System.out.println("INVALIDO... ");
        //     }
        // }

        // ex 2 - sem break
        // valor = -1;
        // while (valor < 1 || valor > 10) {
        //     System.out.println("Informe um valor: ");
        //     valor = in.nextInt();

        //     if (valor >= 1 && valor <= 10) {
        //         System.out.println("VALOR VALIDO");
        //     } else {
        //         System.out.println("INVALIDO... ");
        //     }
        // }


        // ex - do while
        do {
            System.out.println("Informe um valor: ");
            valor = in.nextInt();
        } while (valor < 1 || valor > 1);

        System.out.println("VALOR VALIDO " + valor)
    }
}