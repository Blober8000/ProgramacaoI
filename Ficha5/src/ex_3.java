import java.util.Arrays;
import java.util.Scanner;

public class ex_3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, flip = 0;
        int[] a = new int[0];
        int[] b = new int[0];
        n = Ler();
        do {
            if (n > 0 && flip == 0) {
                a = new int[(b.length + 1)];
                a[0] = n;
                for (int v = 0; v < b.length; v++) {
                    a[v + 1] = b[v];
                }
                flip++;
            } else if (n > 0 && flip == 1) {
                b = new int[(a.length + 1)];
                b[0] = n;
                for (int v = 0; v < a.length; v++) {
                    b[v + 1] = a[v];
                }
                flip--;
            }
            if (!(n < 0)) n = Ler();
        } while (n > 0);
        if (a.length > b.length) {
            System.out.printf("O menor valor introduzido foi: %d. E foi introduzido %d vezes.", min(a)[0], min(a)[1]);
        } else {
            System.out.printf("O menor valor introduzido foi: %d. E foi introduzido %d vezes.", min(b)[0], min(b)[1]);
        }

    }

    public static int Ler() {
        int n;
        System.out.print("Introduza um valor: ");
        n = sc.nextInt();
        return n;
    }

    public static int[] min(int[] vetor) {
        int min = vetor[0], cont = 0;
        for (int r = 0; r <= (vetor.length - 1); r++) {
            if (vetor[r] < min) min = vetor[r];
        }
        for (int d = 0; d <= (vetor.length - 1); d++) {
            if (vetor[d] == min) cont++;
        }
        return new int[]{min, cont};
    }
}
