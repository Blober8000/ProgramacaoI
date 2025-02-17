import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        int a, b, c, d, tot;
        float temp;
        Scanner sc;
        String classe;

        sc = new Scanner(System.in);
        temp = sc.nextFloat();
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        tot = 0;
        classe = "";
        while (temp > 0) {
            if (temp <= 37) {
                classe = "normal";
                a++;
            } else if (temp < 38) {
                classe = "ligeiramente alta";
                b++;
            } else if (temp < 39) {
                classe = "moderadamente alta";
                c++;
            } else {
                classe = "elevada";
                d++;
            }
            System.out.printf("A sua temperatura está %s\n", classe);
            tot++;
            temp = sc.nextFloat();
        }
        if (tot == 0) {
            System.out.println("Não houve pacientes");
        } else {
            System.out.printf("Há %d pacientes sem febre\n", a);
            System.out.printf("%.2f%% dos pacientes teve febre leve\n", (float) ((b * 100) / tot));
            System.out.printf("%.2f%% dos pacientes teve febre moderada\n", (float) ((c * 100) / tot));
            System.out.printf("%.2f%% dos pacientes teve febre alta\n", (float) ((d * 100) / tot));
        }
    }
}