import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int [] a = { 1, 2, 3, 4, 5};
        int [] b = { 1, 6, 9, 2, 3};
        int [] c = new int[5];
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[total] = a[i];
                    total++;
                }
            }
        }

        for (int i = 0; i < total; i++) {
            System.out.println(c[i]);
        }
    }
}