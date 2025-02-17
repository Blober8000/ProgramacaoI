import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        int a, b, neg, n, nota;
        Scanner sc;

        sc = new Scanner(System.in);
        n = sc.nextInt();
        a = 0;
        b = 0;
        neg = 0;
        if (n < 0) {
            System.out.println("O número de alunos tem de ser maior que 0");
        } else {
            for (int v = 0; v != n; v++) {
                nota = sc.nextInt();
                if (nota < 10) {
                    a++;
                    neg = neg + nota;
                } else {
                    b++;
                }
            }
            System.out.printf("A média das notas negativas é: %.2f\n", (float) (neg / a));
            System.out.printf("%.2f%% das notas foram positivas", (float) ((b * 100) / n));
        }
    }
}
