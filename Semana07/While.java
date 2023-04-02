import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        // PROGRAMA PARA CONTAR ATÉ X
    
            // CRESCENDO ||  // DECRESCENDO
        int contador = 0;
        int limite = 10;
        while (contador < limite) {
            System.out.println(contador);
            contador++; // contador = contador + 1;
        }

        // teste falso, continua

        // PROGRAMA QUE FICA REPETINDO ATÉ QUE O USUARIO DIGITE 0
        Scanner in = new Scanner(System.in);
        int valor = 345;
        while (valor != 0) { 
            System.out.println("INFORME UM VALOR");
            valor = in.nextInt();
        }

    }

}