public class Potencia {
    public static void main(String[] args) {

        int base = 2;
        int expoente = 5;
        int resultado = 1;
        int contador = 1;

        while (contador <= expoente) {
            System.out.println("contador: " + contador);
            System.out.println("base: " + base);
            System.out.println("expoente: " + expoente);
            System.out.println();

            resultado = resultado * base;   

            contador++;
        }

        System.out.println("RESULTADO " + resultado);
    }
}
