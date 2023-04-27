public class Exemplo01 {
    public static void main(String[] args) {

        int contador = 0;
        while (contador < 10) {
            System.out.println("CONTADOR " + contador);
            contador++;
        }

        for ( int valor = 0 ;  valor < 10  ; valor++ ) {
            System.out.println("FOR INC " + valor);
        }   

        for (int valor = 5; valor >= 0; valor--) {
            System.out.println("FOR DEC " + valor);
        }

        for (int v = 5;  ; v++) {
            System.out.println(v);
            // se o valor digitado for igual a 0 para;
            // if (dig == 0) {
            //     break;
            // }
        }

        for (int a = 2; a < 10; ) {
            a++;
        }

        int outroLugar = 5;

        for ( ;  outroLugar > 0; outroLugar--) {

        }

        int valorInicial = 10;

        for (int i = valorInicial; i > 0; i--) {
            System.out.println("i " + i);
        }

    }
}