import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {
        int nPacientes, tot, dosagmg, intervh;
        Scanner sc;

        sc = new Scanner(System.in);
        do {
            nPacientes = sc.nextInt();
        } while (nPacientes < 0);
        tot = 0;
        for (int v = 0; nPacientes > v; v++) {
            dosagmg = sc.nextInt();
            intervh = sc.nextInt();
            System.out.printf("Vezes que o medicamento foi tomado: %d\n", 24 / intervh);
            System.out.printf("Quantidade total de medicamento administrado: %d\n", (24 / intervh) * dosagmg);
            tot += ((24 / intervh) * dosagmg);
        }
        System.out.printf("No total foram administradas %dmg de medicamento", tot);
    }
}