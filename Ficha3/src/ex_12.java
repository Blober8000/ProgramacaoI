import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner sc;
        int n, num;
        String seq;

        sc = new Scanner(System.in);
        do {
            n = sc.nextInt();
        } while (n < 0);
        seq = "";
        for (int v = 0; v < n; v++) {
            do {
                num = sc.nextInt();
            } while (num / 10 != 0);
            if (num % 2 != 0) {
                seq = String.format("%d%s", num, seq);
                System.out.println(seq);
            } else {
                seq = String.format("%s%d", seq, num);
                System.out.println(seq);
            }
        }
    }
}