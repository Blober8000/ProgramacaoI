import java.util.Scanner;

public class ex_15 {
    public static void main(String[] args) {
        Scanner sc;
        int acc, accMax, maiorNum, num;

        sc = new Scanner(System.in);
        do {
            accMax = sc.nextInt();
        } while (accMax < 0);
        maiorNum = (int) (-Math.pow(10, 9));
        acc = 0;
        while (acc < accMax) {
            do {
                num = sc.nextInt();
            } while (num < 0);
            acc += num;
            if (num > maiorNum) {
                maiorNum = num;
            }
        }
        System.out.printf("O maior número foi %d", maiorNum);
    }
}