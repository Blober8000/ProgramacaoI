import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        Scanner sc;
        int num, temp, digs, x;
        boolean repete;

        do {
            sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num % 2 == 0) {
                repete = false;
            } else {
                repete = true;
            }
            temp = num;
            digs = 0;
            while (temp != 0) {
                temp /= 10;
                digs++;
            }
            if (digs != 4) {
                repete = true;
            }
        } while (repete);
        x = 1;
        do {
            System.out.println(7 * x);
            x++;
        } while (7 * x < num);
    }
}
