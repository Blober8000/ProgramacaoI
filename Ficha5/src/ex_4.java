import java.util.Arrays;
import java.util.Scanner;

public class ex_4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Ler(true);
        int[] vetor1 = new int[n];
        n = Ler(true);
        int[] vetor2 = new int[n];
        for (int v = 0; v < vetor1.length; v++) {
            vetor1[v] = Ler(false);
        }
        for (int r = 0; r < vetor2.length; r++) {
            vetor2[r] = Ler(false);
        }
        int[] vetor3 = new int[vetor1.length + vetor2.length];
        System.arraycopy(vetor1, 0, vetor3, 0, vetor1.length);
        System.arraycopy(vetor2, 0, vetor3, vetor1.length, vetor2.length);
        System.out.println(Arrays.toString(vetor3));
    }

    public static int Ler(boolean lim) {
        int n;
        System.out.print("Introduza um valor: ");
        n = sc.nextInt();
        while ((n < 1 || n > 20) && lim) {
            System.out.print("Valor introduzido inválido. Introduza um valor: ");
            n = sc.nextInt();
        }
        return n;
    }
}