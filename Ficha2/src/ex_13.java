import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {
        int tempoSeg, tempoMin, tempoH;
        Scanner sc = new Scanner(System.in);

        tempoSeg = sc.nextInt();
        tempoMin = (tempoSeg/60);
        tempoH = (tempoMin/60);
        tempoMin = tempoMin-tempoH*60;
        tempoSeg=tempoSeg-(tempoH*3600 + tempoMin*60);
        System.out.printf("%02d:%02d:%02d", tempoH, tempoMin, tempoSeg);
    }
}