import java.util.Scanner;

public class ex_6_a {
    public static void main(String[] args) {
        Scanner sc;
        final float LIM1=0.2f, LIM2=0.5f, LIM3=0.7f, LIM4=0.9f;
        float aprovados;

        sc = new Scanner(System.in);
        aprovados = sc.nextFloat();
        if (aprovados <0 || aprovados > 1) {
            System.out.println("Valor Inválido");
        } else if (aprovados < LIM1) {
            System.out.println("Turma com Baixíssimo Rendimento");
        } else if (aprovados < LIM2){
            System.out.println("Turma com Baixo Rendimento");
        } else if (aprovados < LIM3){
            System.out.println("Turma Razoável");
        } else if (aprovados < LIM4){
            System.out.println("Turma com Bom Rendimento");
        } else {
            System.out.println("Turma Excelente");
        }
    }
}