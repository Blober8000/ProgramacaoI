import java.util.Scanner;

public class ex_9_c {
    public static void main(String[] args) {
        Scanner sc;
        int n, res, num;

        sc = new Scanner(System.in);
        do {
            n = sc.nextInt();
        } while (n < 0);
        for (int v = 0; n > v; v++) {
            res = 1;
            num = sc.nextInt();
            for (int x = num; x > 1; x--) {
                res = res * x;
            }
            System.out.printf("%d! = %d\n", num, res);
        }
    }
}
