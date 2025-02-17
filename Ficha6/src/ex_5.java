import java.util.Scanner;

public class ex_5 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Ler("Insira a altura da matriz: ", true);
        int m = Ler("Insira a largura da matriz: ", true);
        int[][] matriz = new int[n][m];
        matriz = Armazenar(matriz, n, m);
        printMatrix(matriz, n, m);
        matriz = ordenarLinhas(matriz, n, m);
        printMatrix(matriz, n, m);
        matriz = ordenarColunas(matriz, n, m);
        printMatrix(matriz, n, m);
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
            if (isPositive && num <= 0) {
                System.out.print("Valor não suportado. " + texto);
            } else if (isPositive) {
                isPositive = false;
            }
        } while (isPositive);
        return num;
    }

    public static void printMatrix(int[][] matriz, int altura, int largura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] Armazenar(int[][] matriz, int altura, int largura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                matriz[i][j] = Ler("Insira o valor a guardar: ", false);
            }
        }
        return matriz;
    }

    public static int[][] ordenarLinhas(int[][] matriz, int altura, int largura) {
        int temp, temp2, replace;
        for (int i = 0; i < altura; i++) {
            for (int v = 0; v < largura; v++) {
                replace = 0;
                temp = matriz[i][replace];
                for (int j = 0; j < largura; j++) {
                    if (matriz[i][j] < temp) {
                        temp2 = matriz[i][j];
                        matriz[i][j] = temp;
                        matriz[i][replace] = temp2;
                        replace = j;
                    } else {
                        temp = matriz[i][j];
                        replace = j;
                    }
                }
            }
        }
        return matriz;
    }

    public static int[][] ordenarColunas(int[][] matriz, int altura, int largura) {
        int temp, temp2, replace;
        for (int i = 0; i < largura; i++) {
            for (int v = 0; v < altura; v++) {
                replace = 0;
                temp = matriz[replace][i];
                for (int j = 0; j < altura; j++) {
                    if (matriz[j][i] > temp) {
                        temp2 = matriz[j][i];
                        matriz[j][i] = temp;
                        matriz[replace][i] = temp2;
                        replace = j;
                    } else {
                        temp = matriz[j][i];
                        replace = j;
                    }
                }
            }
        }
        return matriz;
    }
}
