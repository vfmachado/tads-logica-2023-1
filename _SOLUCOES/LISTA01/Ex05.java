import java.util.Scanner;
/*
Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para
graus Celsius.
*/
public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ENTRADA
        float tempFahrenheit;
        float tempCelsius;

        System.out.println("Informe a temperatura em Fahrenheits");
        tempFahrenheit = in.nextFloat();

        tempCelsius = (tempFahrenheit - 32) / 9 * 5;

        System.out.printf("TEMPERATURA EM GRAUS CELSIUS: %.1f\n", tempCelsius);
    }
}