import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner sc;
        int num, div, teste;
        boolean primo;

        sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("O número não pode ser negativo");
        } else if (num == 0) {
            System.out.println("O número 0 não é primo");
        } else if (num == 1) {
            System.out.println("O número 1 não é primo");
        } else {
            primo = true;
            div = 2;
            while (primo && div < num) {
                teste = num % div;
                if (teste == 0) {
                    primo = false;
                } else {
                    div++;
                }
            }
            if (primo) {
                System.out.printf("O número %d é primo", num);
            } else {
                System.out.printf("O número %d não é primo", num);
            }
        }
    }
}
