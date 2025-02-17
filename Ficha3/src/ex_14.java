import java.util.Scanner;

public class ex_14 {
    public static void main(String[] args) {
        int min, max;
        Scanner sc;

        sc = new Scanner(System.in);
        do {
            min = sc.nextInt();
            max = sc.nextInt();
        } while (min > max);
        for (int v = min - 1; v < max + 1; v++) {
            if ((v * 3) % 2 == 0 && (v * 3) >= min && (v * 3) < max) {
                System.out.println(v * 3);
            }
        }
    }
}