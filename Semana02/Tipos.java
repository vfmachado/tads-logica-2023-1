import java.util.Scanner;

public class Tipos {
    public static void main(String[] args) {
        System.out.println("SOBRE TIPOS!!!!");
        Scanner in = new Scanner(System.in);
        // EXISTEM DIVERSOS TIPOS DE DADOS, DENTRE ELES OS PRINCIPAIS (EM LOGICA)

        // primitivos (começa com letra minuscula)
        
        int numeroInteiro;
        System.out.print("Informe um numero inteiro: ");
        numeroInteiro = in.nextInt();
        // valores negativos e positivos entre ~2.5b

        float numeroRealBaixaPrecisao = 1.12345678f;
        // valores negativos e positivos com 8 casas decimais
        System.out.print("Informe um float: ");
        numeroRealBaixaPrecisao = in.nextFloat();

        double numerosReaisAltaPrecisao = 1.213121241514211;
        System.out.print("Informe um numero de alta precisao (double): ");
        numerosReaisAltaPrecisao = in.nextDouble();
        // igual ao float + precisao

        boolean verdadeiroOuFalso = true; 
        System.out.print("Informe um boolean: ");
        verdadeiroOuFalso = in.nextBoolean();

        System.out.println("O COMPUTADOR ENTENDEU TODAS SUAS ENTRADAS!!!");

        // OUTROS TIPOS NUMÉRICOS
        // short
        // byte
        // long

        // TIPOS DE TEXTO

        // LETRA
        char umaLetra = 'A';
        String textos = "ISSO EH UM EXEMPLO\nDE TEXTO QUE TEM\nQUEBRAS DE LINHA\n\tE TAMBEM TABULACOES";

        // NAO FUNCIONA!!!
        // umaLetra = in.nextChar();
        umaLetra = in.next().charAt(0);
        textos = in.next(); // uma palavra;
        textos = in.nextLine(); // uma linha
        
    }   
}