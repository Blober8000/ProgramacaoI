import java.util.Scanner;

public class ex_5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = Vetor();
        System.out.printf("Sempre crescente = %b", crescente(vetor));
    }
    public static int Ler() {
        int n;
        System.out.print("Introduza um valor: ");
        n = sc.nextInt();
        return n;
    }
    public static int[] Vetor(){
        int[] vetor = new int[Ler()];
        for (int v = 0; v < vetor.length; v++) {
            vetor[v] = Ler();
        }
        return vetor;
    }
    public static boolean crescente(int[] vetor){
        boolean cresc;
        int r=0;
        do{
            if (vetor[r]<vetor[r+1]) cresc = true;
            else cresc = false;
            r++;
        } while (cresc && r<vetor.length-1);
        return cresc;
    }
}