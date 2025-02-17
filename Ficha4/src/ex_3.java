import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        int num1, num2, N, maisParecidos=0, store1=0, store2=0;
        N = lerIntPositivo("Digite o nº de pares a serem lidos: ");
        for (int v=0; v<N; v++) {
            num1 = lerIntPositivo("Digite um numero: ");
            num2 = lerIntPositivo("Digite um numero: ");
            if (qntsDigsComuns(num1, num2)>= maisParecidos) {
                store1 = num1;
                store2 = num2;
                maisParecidos = qntsDigsComuns(num1, num2);
            }
        }
        if (maisParecidos == 0) System.out.print("sem resultados");
        else System.out.printf("%d/%d",store1,store2);
    }

    public static int lerIntPositivo(String texto) {
        int num = 0;
        int falhou;
        String temporario;
        Scanner sc = new Scanner(System.in);
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
                    if (num < 0) {
                        falhou = 1;
                        System.out.print("Valor inferior a 0. Digite um numero: ");
                    }
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

    public static int qntsDigsComuns(int num1, int num2) {
        int temp1, temp2, digs1 = 0, digs2 = 0, cont = 0, diga, digb;
        temp1 = num1;
        temp2 = num2;
        while (temp1 != 0) {
            temp1 /= 10;
            digs1++;
        }
        while (temp2 != 0) {
            temp2 /= 10;
            digs2++;
        }
        temp1 = num1;
        for (int v = 0; v < digs1; v++) {
            diga = temp1 % 10;
            temp1 = (temp1 - diga) / 10;
            temp2 = num2;
            for (int t = 0; t < digs2; t++) {
                digb = temp2 % 10;
                temp2 = (temp2 - digb) / 10;
                if (diga == digb) cont++;
            }
        }
        return cont;
    }
}