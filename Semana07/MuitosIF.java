import java.util.Scanner;

public class MuitosIF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // CONTA BANCARIA
        // NESSA CONTA BANCARIA O USUARIO PODE INTERAGIR ATRAVÉS DE UM MENU
        // PODENDO
        // VER SALDO
        // SACAR UM VALOR
        // DEPOSITAR UM VALOR
        // VER EXTRATO
        // SAIR

        int opcao = -132132;
        float saldo = 1000;
        float valor;

        while (opcao != 5) {
            // LER A OPCAO DESEJADA
            // E DEPOIS COMPARAR DENTRO DE TODOS OS IFS..

            System.out.println("===== IF BANK =====");
            System.out.println("1. Ver saldo");
            System.out.println("2. Saque");
            System.out.println("3. Deposito");
            System.out.println("4. Extrato");
            System.out.println("5. Sair");

            opcao = in.nextInt();

            // ESCOLHA (VALOR AVALIADO)
            // SWITCH (NOME DA VARIAVEL)
            switch (opcao) {
                case 1:
                    // BLOCO DE CODIGO
                    System.out.printf("SALDO R$ %.2f\n",  saldo);
                    break;  // encerra o CASE

                case 2:
                    // BLOCO DE CODIGO
                    System.out.println("SAQUE");
                    System.out.println("Quanto vc gostaria de sacar? ");
                    valor = in.nextFloat();

                    if (valor < 0) {
                        System.out.println("ESPERTINHO ˆˆ");
                    } else if (valor <= saldo) {
                        saldo = saldo - valor;
                        System.out.println("SAQUE EFETUADO COM SUCESSO");
                    } else {
                        System.out.println("NAO É POSSIVEL REALIZAR O SAQUE; SALDO INSUFICIENTE");
                    }

                    break;  // encerra o CASE

                case 3:
                    // BLOCO DE CODIGO
                    System.out.println("DEPOSITO");
                    break;  // encerra o CASE

                case 4:
                    // BLOCO DE CODIGO
                    System.out.println("EXTRATO");
                    break;  // encerra o CASE

                case 5:
                    // BLOCO DE CODIGO
                    System.out.println("SAINDO");
                    break;  // encerra o CASE

                default:
                    System.out.println("OPCAO INVALIDA");
            }
            
            
            // if (opcao == 1) {
            //     System.out.println("SALDO R$ 0,00");
            // }
            // if (opcao == 2) {
            //     System.out.println("SAQUE");
            // }
            // if (opcao == 3) {
            //     System.out.println("DEPOSITO");
            // }
            // if (opcao == 4) {
            //     System.out.println("EXTRATO ... ");
            // }
            // if (opcao == 5) {
            //     System.out.println("SAINDO...");
            // }
        }

    }
}