import java.util.Scanner;

public class ex_2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n, max, min;
        n = Ler();
        int [] vetor =new int[n];
        for (int v = 0; v <= (n-1); v++) {
            System.out.println("Valor?");
            vetor[v] = sc.nextInt();
        }
        max = vetor[0];
        min = vetor[0];
        for (int r = 0; r <= (n - 1); r++) {
            if (vetor[r] > max) max = vetor[r];
            if (vetor[r] < min) min = vetor[r];
        }
        System.out.printf("Valor min: %d. Valor max: %d\n", min, max);
    }
    public static int Ler(){
        int n;
        System.out.print("Introduza um valor: ");
        n = sc.nextInt();
        while(n<1 || n>20){
            System.out.print("Valor introduzido inválido. Introduza um valor: ");
            n = sc.nextInt();
        }
        return n;
    }
}
