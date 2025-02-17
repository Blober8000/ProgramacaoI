import java.util.Arrays;
import java.util.Scanner;

public class ex_6 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor1 = new int[Ler(true)];
        int[] vetor2 = new int[vetor1.length];
        int count = 0, temp, m;
        for (int v = 0; v < vetor1.length; v++) {
            vetor1[v] = Ler(false);
        }
        System.arraycopy(vetor1, 0, vetor2, 0, vetor1.length);
        for (int r = 0; r < vetor2.length; r++) {
            for (int d = r + 1; d < vetor2.length; d++) {
                if ((vetor2[r] == vetor2[d]) && !(vetor2[r] == 0) && !(vetor2[d] == 0)) {
                    vetor2[d] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(vetor1));
        for (int t = 0; t < vetor2.length; t++) {
            if (vetor2[t] == 0) {
                m = vetor2.length - 1;
                temp = 0;
                do {
                    if (vetor2[m] != 0 && m > t) {
                        temp = vetor2[m];
                    }
                    m--;
                } while (m > 0 && temp == 0);
                if (temp != 0) {
                    vetor2[t] = temp;
                    vetor2[m + 1] = 0;
                }
            }
        }
        for (int c = 0; c < vetor2.length; c++) {
            if (vetor2[c] != 0) {
                count++;
            }
        }
        vetor2 = Arrays.copyOf(vetor2, count);
        System.out.println(Arrays.toString(vetor2));
    }

    public static int Ler(boolean lim) {
        int n;
        System.out.print("Introduza um valor: ");
        n = sc.nextInt();
        while ((n < 2 || n > 20) && lim) {
            System.out.print("Valor introduzido inválido. Introduza um valor: ");
            n = sc.nextInt();
        }
        return n;
    }
}
