import java.util.Scanner;

public class ex_3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = Ler("Insira o tamanho da matriz: ", true);
        int[][] a = new int[size][size];
        a = InserirNum(a);
        PrintMaztriz(a, size);
    }

    public static void PrintMaztriz(int[][] matriz, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%s%3d%s ", String.format("\u001B[%dm", Cor(matriz[i][j])), matriz[i][j], "\u001B[0m");
            }
            System.out.println();
        }
    }

    public static int Ler(String texto, boolean isPositive) {
        System.out.print(texto);
        String temporario;
        int num = 0;
        boolean fail;
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

    public static int[][] InserirNum(int[][] matriz) {
        boolean zero;
        int max = matriz.length;
        int min = -1;
        int num = 0;
        do {
            zero = false;
            max--;
            min++;
            num++;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if ((i == min || j == min || i == max || j == max) && matriz[i][j] == 0) {
                        matriz[i][j] = num;
                    }
                }
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length && !zero; j++) {
                    if (matriz[i][j] == 0) zero = true;
                    else zero = false;
                }
            }
        } while (zero && max != 0);
        return matriz;
    }

    public static int Cor(int valor) {
        boolean finish = false;
        int colour = 0;
        for (int x = 1; !finish; x++) {
            if (valor <= 7 * x) {
                colour = valor + (37 + (-7 * x));
                finish = true;
            }
        }
        return colour;
    }
}