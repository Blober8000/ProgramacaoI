import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        int tempoSeg;
        float tempoMin, custo;
        Scanner sc;

        sc = new Scanner(System.in);
        tempoSeg = sc.nextInt();
        tempoMin = (float) tempoSeg / 60;
        if (tempoSeg<=0){
            System.out.println("Tempo inválido");
        }else {
            if (tempoSeg<=60){
                custo = (float)(tempoMin*0.30);
            } else if (tempoSeg<=300){
                custo = (float)(0.30+((tempoMin-1)*0.15));
            } else {
                custo = (float)(0.30+0.60+((tempoMin-5)*0.08));
            }
            if (tempoMin>20){
                custo = (float)(custo*0.9);
            }
            System.out.printf("A chamada durou: %d segundos e custou: %.2f€",tempoSeg,custo);
        }
    }
}
