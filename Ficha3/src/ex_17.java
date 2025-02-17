import java.util.Scanner;

public class ex_17 {
    public static void main(String[] args) {
        Scanner sc;
        int N, a, b, c;
        float delta;

        sc = new Scanner(System.in);
        do {
            N = sc.nextInt();
        } while (N < 0);
        for (int v = 0; v < N; v++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a == 0) {
                System.out.println("Não é equação do 2º grau");
            } else {
                delta = (float) (Math.pow(b, 2) - 4 * a * c);
                if (delta > 0) {
                    System.out.printf("A equação tem 2 raizes: 1ª %.2f e a 2ª %.2f\n", (float) ((-b + (Math.pow(delta, 0.5))) / (2 * a)), (float) ((-b - (Math.pow(delta, 0.5))) / (2 * a)));
                } else if (delta == 0) {
                    System.out.printf("A equação tem uma raiz dupla: %.2f\n", (float) (-b / (2 * a)));
                } else {
                    System.out.printf("A equação tem 2 raizes imaginárias: 1ª %.2f + %.2fi e a 2ª %.2f - %.2fi\n", (float) (-b / (2 * a)), (float) ((Math.pow(-delta, 0.5)) / (2 * a)), (float) (-b / (2 * a)), (float) ((Math.pow(-delta, 0.5)) / (2 * a)));
                }
            }
        }
    }
}