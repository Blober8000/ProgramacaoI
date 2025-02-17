import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        int N1, N2, N;

        N1 = lerInteiro("Diga o 1º valor do intervalo: ");
        N2 = lerInteiro("Diga o 2º valor do intervalo: ");
        while (N2 < N1) {
            System.out.println("Valores inválidos o 1º valor deve ser menos que o 2º");
            N1 = lerInteiro("Diga o 1º valor do intervalo: ");
            N2 = lerInteiro("Diga o 2º valor do intervalo: ");
        }
        N = lerInteiro("Diga o valor de nºs por linha: ");
        while (N > (N2 - N1)) {
            System.out.println("Valor inválido o número de nºs por linha tem de ser menor que quantos valores há no intervalo");
            N = lerInteiro("Diga o valor de nºs por linha: ");
        }
        mostrarSeqNumPorLinha(N1, N2, N);
    }

    public static int lerInteiro(String texto) {
        Scanner sc;
        String temporario;
        int falhou = 0, num = 0;
        sc = new Scanner(System.in);
        System.out.print(texto);
        temporario = sc.nextLine();
        do {
            if (temporario.isEmpty()) {
                System.out.print("Valor não inserido. Digite um número: ");
                falhou = 1;
            } else {
                try {
                    num = Integer.parseInt(temporario);
                    falhou = 0;
                } catch (NumberFormatException e) {
                    System.out.print("Input inválido. Digite o valor de num: ");
                    falhou = 1;
                }
            }
            if (falhou == 1) {
                temporario = sc.nextLine();
            }
        } while (falhou != 0);

        return num;
    }

    public static void mostrarSeqNumPorLinha(int n1, int n2, int n3) {
        int contN = 0;
        for (int v = n1; v <= n2; v++) {
            System.out.printf("%d ", v);
            contN++;
            if (contN == n3) {
                System.out.println("\n");
                contN = 0;
            }
        }
    }

}
