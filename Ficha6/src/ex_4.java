import java.util.Scanner;

public class ex_4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        biggerThanNeighboors(Armazenar());
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
            if (n >= 0 && (a.length != 30 && b.length != 30)) n = Ler("Insira o valor a guardar: ", false);
        } while (n >= 0 && (a.length != 30 && b.length != 30));
        if (a.length == 30 || b.length == 30) {
            System.out.println("Conjunto não pode ter mais do que 30 valores.");
        }
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

    public static void biggerThanNeighboors(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if (i == 0) {
                if (valores[i] > valores[i + 1]) {
                    System.out.printf("O valor %d é maior que o seu vizinho: %d\n", valores[i], valores[i + 1]);
                }
            } else if (i == valores.length - 1) {
                if (valores[i] > valores[i - 1]) {
                    System.out.printf("O valor %d é maior que o seu vizinho: %d\n", valores[i], valores[i - 1]);
                }
            } else {
                if (valores[i] > valores[i + 1] && valores[i] > valores[i - 1]) {
                    System.out.printf("O valor %d é maior que os seus vizinhos: %d e %d\n", valores[i], valores[i + 1], valores[i - 1]);
                }
            }
        }
    }
}