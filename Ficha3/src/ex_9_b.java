import java.util.Scanner;

public class ex_9_b {
    public static void main(String[] args) {
        Scanner sc;
        int res, num;

        sc = new Scanner(System.in);
        res = 1;
        num = sc.nextInt();
        for (int x = num; x > 1; x--) {
            res *= x;
        }
        System.out.printf("%d! = %d", num, res);
    }
}
