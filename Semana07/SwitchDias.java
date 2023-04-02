import java.util.Scanner;

public class SwitchDias {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // DADO O NUMERO DE UM DIA DE 1 A 7, INFORMAR SE É DIA DE SEMANA OU FINAL DE SEMANA, DOM = 1

        int dia = in.nextInt();

        switch (dia) {
            case 1:
            case 7:
                System.out.println("FINAL DE SEMANA");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIA DA SEMANA");
                break;

            default:
                System.out.println("DIA INVALIDO");
        }




    }
}