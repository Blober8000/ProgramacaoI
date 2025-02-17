import java.util.Arrays;
import java.util.Scanner;

public class ex_1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        N=Ler("Insira o número de valores a tratar: ", true);
        int[] conjuntoNum = new int[N];
        conjuntoNum = Armazenar(conjuntoNum, N);
        Print(conjuntoNum);
        System.out.println(Arrays.toString(conjuntoNum));
    }

    public static int Ler(String texto, boolean isPositive){
        System.out.print(texto);
        String temporario;
        int num=0;
        boolean fail=false;
        do {
            do {
                temporario = sc.nextLine();
                if (temporario.isEmpty()) {
                    System.out.print("Valor não inserido. " + texto);
                    fail = true;
                } else {
                    try {
                        num = Integer.parseInt(temporario);
                        fail = false;
                    } catch (NumberFormatException e) {
                        System.out.print("Valor inválido." + texto);
                        fail = true;
                    }
                }
            } while (fail);
            if (isPositive && num<0){
                System.out.print("Valor não suportado. " + texto);
            } else if (isPositive && num>0) {
                isPositive = false;
            }
        }while(isPositive);
        return num;
    }

    public static int[] Armazenar(int[] vetor, int N){
        int temp;
        boolean repeat = false;
        for (int i = 0; i < N; i++) {
            String texto = String.format("Insira o " + (i+1) + "º a tratar: ");
            do {
                repeat = false;
                temp = Ler(texto, false);
                for (int j = 0; j < i && !repeat; j++) {
                    if (temp == vetor[j]) repeat = true;
                }
                if (repeat) System.out.print("Valor repetido. ");
                else vetor[i] = temp;
            } while (repeat);
        }
        return vetor;
    }

    public static void Print(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}