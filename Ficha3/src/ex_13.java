import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {
        Scanner sc;
        int num, par, impar, negative;

        sc = new Scanner(System.in);
        num = sc.nextInt();
        par = 0;
        impar = 0;
        negative = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
                negative += num;
            }
            num = sc.nextInt();
        }
        System.out.printf("%.2f%% é a percentagem dos números pares\n", (float) ((par * 100) / (par + impar)));
        System.out.printf("A média dos números ímpares é %.2f", (float) (negative / impar));
    }
}