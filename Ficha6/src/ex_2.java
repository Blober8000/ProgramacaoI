import java.util.Scanner;

public class ex_2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Comparar(Armazenar());
    }

    public static int[] Armazenar() {
        int n, flip = 0;
        int[] a = new int[0];
        int[] b = new int[0];
        n = Ler("Insira o valor a guardar: ", false);
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
            if (!(n < 0)) n = Ler("Insira o valor a guardar: ", false);
        } while (n > 0);
        if (a.length > b.length) {
            return a;
        } else {
            return b;
        }
    }

    public static int Ler(String texto, boolean isPositive) {
        System.out.print(texto);
        String temporario;
        int num = 0;
        boolean fail = false;
        do {
            do {
                temporario = sc.nextLine();
                if (temporario.isEmpty()) {
                    System.out.print("Valor não inserido. " + texto);
                    fail = true;
                } else {
                    try {
                        num = Integer.parseInt(temporario);
                        fail = false;
                    } catch (NumberFormatException e) {
                        System.out.print("Valor inválido." + texto);
                        fail = true;
                    }
                }
            } while (fail);
            if (isPositive && num < 0) {
                System.out.print("Valor não suportado. " + texto);
            } else if (isPositive && num > 0) {
                isPositive = false;
            }
        } while (isPositive);
        return num;
    }

    public static void Comparar(int[] vetor) {
        int temp, repeat;
        for (int i = 0; i < vetor.length; i++) {
            repeat = 1;
            int digs = 0;
            temp = vetor[i];
            while (temp > 0) {
                digs++;
                temp /= 10;
            }
            int[] Alg = new int[digs];
            temp = vetor[i];
            for (int j = 0; j < digs; j++) {
                Alg[j] = temp % 10;
                temp /= 10;
            }

            for (int k = 0; k < digs; k++) {
                //System.out.printf("%d ? %d\n", Alg[0], Alg[k]);
                if (Alg[0] != Alg[k]) {
                    repeat++;
                    //System.out.printf("%d != %d\nrepeat = %d\n", Alg[0], Alg[k], repeat);
                } //else System.out.printf("%d == %d\n", Alg[0], Alg[k]);
            }

            System.out.printf("%d:%d\n", vetor[i], repeat);
        }
    }
}
