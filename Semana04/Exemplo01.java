import java.util.Scanner;
// LISTA 2 - EX 16
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float salario, emprestimo, valorPrestacao, maxPermitido;
        int quantParcelas;

        System.out.println("Informe o valor do salario, emprestimo pretendido e quantidades de parcelas");
        salario = in.nextFloat();
        emprestimo = in.nextFloat();
        quantParcelas = in.nextInt();

        if (salario <= 0 || emprestimo <= 0 || quantParcelas <= 0) {
            System.out.println("VC NAO PODE INFORMAR VALORES MENORES OU IGUAIS A ZERO");
        } else {

            valorPrestacao = emprestimo/quantParcelas;
            System.out.println("VALOR DA PRESTACAO: " + valorPrestacao);
            
            // .3f (o f indica que estou usando float)
            maxPermitido = 0.3f * salario;
            System.out.println("MAX PRESTACAO PERMITIDA: " + maxPermitido);

            if (valorPrestacao > maxPermitido) {
                System.out.println("EMPRESTIMO NEGADO");
            } else {
                System.out.println("BEM VINDO A NOSSA EMPRESA DE EMPRESTIMOS");
            }
        }
    }
}