import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        int par, num, a;
        Scanner sc;

        sc = new Scanner(System.in);
        par = 0;
        num = sc.nextInt();
        while (num != 0) {
            a = num % 10;
            num = num / 10;
            if (a % 2 == 0) {
                par = par + a;
            }
        }
        System.out.printf("A soma dos números pares é: %d\n", par);
    }
}
