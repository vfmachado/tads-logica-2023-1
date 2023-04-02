import java.util.Scanner;
public class ExString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // TIPOS VARIAVEIS
        char letra = 'A';
        String texto = "TExto que pode conter\nmuitas linhas";

        System.out.println("A VARIAVEL DO TIPO CHAR TEM " + letra);
        System.out.println("A VARIAVEL DO TIPO STRING TEM " + texto);

        System.out.println("INFORME A SUA IDADE");
        int idade = in.nextInt();

        System.out.println("INFORME O SEU NOME");
        in.nextLine();
        String nome = in.nextLine();    // le uma palavra
        // String sobrenome = in.next();
        System.out.println("NO NOME TEM " + nome);
        // System.out.println("NO SOBRENOME TEM " + sobrenome);

        // String outroTexto = in.next();
        // System.out.println("SOBROU: " + outroTexto);
        System.out.println("Informe o tipo de combustivel (alcool,gasolina,flex)")
        String tipoCombustivel = in.next();

        // dessa maneira podemos comparar String que é um tipo nao primitivo de dados
        if (tipoCombustivel.equals("flex")) {
            // BLOCO DE CODIGO
        } 

        
    
    }
}