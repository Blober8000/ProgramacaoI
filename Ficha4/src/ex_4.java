import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        int num, tentativas, capi = 0, i;
        tentativas = lerIntPositivo("Digite o número máximo de tentativas: ");
        for (i = 0; (i < tentativas) && (capi == 0); i++) {
            if (testarCapicua(lerIntPositivo("Digite um numero: "))) {
                capi = 1;
                System.out.println("Encontrado número capicua");
            }
            else System.out.println("O número não é uma capicua");
        }
        if (i>=tentativas) {
            System.out.println("Excedeu o número de tentativas");
        }
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

    public static boolean testarCapicua(int num) {
        int temp, digs, digUlt, digPri;
        boolean capi;

        if (num / 10 != 0) {
            temp = num;
            digs = 0;
            while (temp != 0) {
                temp = temp / 10;
                digs++;
            }
            capi = true;
            while (digs > 1 && capi) {
                digUlt = num % 10;
                digPri = num / (int) (Math.pow(10, (digs - 1)));
                digs = digs - 2;
                if (digUlt != digPri) {
                    capi = false;
                }
                num = (num - digUlt) / 10;
                num = num - (digPri * (int) (Math.pow(10, digs)));
            }
            if (capi) {
                return true;
            } else {
                return false;
            }
        } else {
            num = lerIntPositivo("O número tem de ter mais do que 1 dígito.\nDigite um número: ");
            return testarCapicua(num);
        }
    }
}
