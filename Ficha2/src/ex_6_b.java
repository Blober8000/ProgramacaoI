import java.util.Scanner;

public class ex_6_b {
    public static void main(String[] args) {
        Scanner sc;
        float aprovados, lim1, lim2, lim3, lim4;

        sc = new Scanner(System.in);
        aprovados = sc.nextFloat();
        lim1 = sc.nextFloat();
        lim2 = sc.nextFloat();
        lim3 = sc.nextFloat();
        lim4 = sc.nextFloat();
        if (0<lim1 && lim1<lim2 && lim2<lim3 && lim3<lim4 && lim4<1) {
            if (aprovados < 0 || aprovados > 1) {
                System.out.println("Valor Inválido");
            } else if (aprovados < lim1) {
                System.out.println("Turma com Baixíssimo Rendimento");
            } else if (aprovados < lim2) {
                System.out.println("Turma com Baixo Rendimento");
            } else if (aprovados < lim3) {
                System.out.println("Turma Razoável");
            } else if (aprovados < lim4) {
                System.out.println("Turma com Bom Rendimento");
            } else {
                System.out.println("Turma Excelente");
            }
        }
    }
}