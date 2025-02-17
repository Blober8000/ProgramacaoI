import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner sc;
        int n, c, a;

        sc = new Scanner(System.in);
        n = sc.nextInt();
        c = 0;
        while (n != 0) {
            a = n % 10;
            if (a % 2 == 1) {
                c++;
            }
            n = n / 10;
        }
        if (c == 0) {
            System.out.println("Todos os algarismos são pares.");
        } else {
            System.out.printf("Há %d algarismos ímpares.", c);
        }
    }
}
