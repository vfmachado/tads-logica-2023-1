import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char tipo;
        float litros, valor, valorDesconto, descontoAplicado;

        System.out.println("INFORME O TIPO DE COMBUSTIVEL DESEJADO");
        
        // in.next() => le uma string (palavra)
        // .toUpperCase() => converte esse string para tudo em MAIUSCULO
        // .charAt(0) => pega a primeira letra
        tipo = in.next().toUpperCase().charAt(0);

        System.out.println("QUANTOS LITROS VC QUER ABASTECER");
        litros = in.nextFloat();

        if (tipo == 'A') {
            System.out.println("TIPO SELECIONADO: ALCOOL");
            valor = litros * 3.9f;
            System.out.println("TOTAL A SER PAGO: " + valor);
            
            if (litros <= 20) {
                descontoAplicado =  0.97f;
            } else {
                descontoAplicado =  0.95f;
            }

            valorDesconto = valor * descontoAplicado;

            System.out.println("TOTAL A SER PAGO COM DESCONTO: " + valorDesconto);
        } else if (tipo == 'G') {
            System.out.println("TIPO SELECIONADO: GASOLINA"); 

            valor = litros * 4.3f;
            System.out.println("TOTAL A SER PAGO: " + valor);

            if (litros <= 20) {
                valorDesconto = valor * 0.96f;
            } else {
                valorDesconto = valor * 0.94f;
            }

            System.out.println("TOTAL A SER PAGO COM DESCONTO: " + valorDesconto);
        } else {
            System.out.println("TIPO NAO IDENTIFICADO");
        }


    }
}