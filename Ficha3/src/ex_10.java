import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        int num, x, v;
        Scanner sc;
        String seq;

        sc = new Scanner(System.in);
        do {
            num = sc.nextInt();
        } while (num <= 0);
        x = 0;
        seq = "";
        while (x != num) {
            x++;
            seq = String.format("%s%d ", seq, x);
            System.out.println(seq);
        }
        v = 0;
        while (x != 1) {
            seq = "";
            x--;
            while (v != x) {
                v++;
                seq = String.format("%s%d ", seq, v);
            }
            System.out.println(seq);
            v = 0;
        }
    }
}
