import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        int num, temp, digs, digUlt, digPri;
        Scanner sc;
        boolean capi;

        sc = new Scanner(System.in);
        num = sc.nextInt();
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
                System.out.println("O número é capicua");
            } else {
                System.out.println("O número não é capicua");
            }
        } else {
            System.out.println("O número tem de ter mais do que 1 dígito.");
        }
    }
}
