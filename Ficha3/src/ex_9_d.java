import java.util.Scanner;

public class ex_9_d {
    public static void main(String[] args) {
        Scanner sc;
        int res, num;

        sc = new Scanner(System.in);
        res = 1;
        num = sc.nextInt();
        while (num > 0) {
            for (int x = num; x > 1; x--) {
                res = res * x;
            }
            System.out.printf("%d! = %d\n", num, res);
            num = sc.nextInt();
            res = 1;
        }
    }
}