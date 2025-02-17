import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        int num = lerNum("Digite um valor: ");
        ex_2_b(num);
    }

    public static int lerNum(String texto){
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

    public static boolean ex_2_a(int Arm) {
        int temp1, digs = 0, acc = 0, temp2;
        temp1 = Arm;
        while (temp1 != 0) {
            temp1 /= 10;
            digs++;
        }
        temp2 = Arm;
        for (int v = 1; v <= digs; v++) {
            temp1 = temp2 % 10;
            acc += (int) Math.pow(temp1, digs);
            temp2 = (temp2 - temp1) / 10;
        }
        if (acc == Arm) return true;
        else return false;
    }

    public static void ex_2_b(int max) {
        for (int v = 0; v <= max; v++) {
            if (ex_2_a(v)) System.out.println(v);
        }
    }
}