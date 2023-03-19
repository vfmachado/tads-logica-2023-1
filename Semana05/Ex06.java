import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float altura, peso, imc;
        char genero;

        System.out.println("Informe o genero, peso e altura");
        genero = in.next().charAt(0);
        peso = in.nextFloat();
        altura = in.nextFloat();

        imc = peso / (altura * altura);
        System.out.println("IMC " + imc);

        if (imc < 18) {
            System.out.println("Abaixo do peso");
        } else if ( (imc < 24  && genero == 'F') || (imc < 25 && genero == 'M')) {
            System.out.println("IMC NORMAL");
        } else if (imc < 30) {
            System.out.println("IMC SOBREPESO");
        }  else if (imc < 35) {
            System.out.println("IMC OB I");
        }  else if (imc < 40) {
            System.out.println("IMC OB II");
        } else {
            System.out.println("IMC OB III");
        }


    }

}