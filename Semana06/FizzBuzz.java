// MOSTRAR OS NUMEROS DE 1 A 100, OS NUMEROS MULTIPLOS DE 3 DEVE APARECER A PALAVRA FIZZ, OS NUMEROS MULTIPLOS DE 5 A PALABRA BUZZ, OS NUMEROS QUE SAO MULTIPLOS DE 3 E 5 SIMULTANEAMENTE A PALAVRA FIZZBUZZ

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 100) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
            n++;
        }
    }
}
