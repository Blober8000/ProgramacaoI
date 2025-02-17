import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        tabuada(lerIntPositivo("Digite um número: "), lerIntPositivo("Digite um número: "));
    }
    public static void tabuada(int n1, int n2){
        int[] mult = new int[11];
        System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
        System.out.println("_______________________________________________");
        for (int t = n1; t<=n2; t++) {
            for (int v = 1; v <= 10; v++) {
                mult[v] = v * t;
            }
            System.out.printf("%d\t|   %3d\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\n",t,mult[1],mult[2],mult[3],mult[4],mult[5],mult[6],mult[7],mult[8],mult[9],mult[10]);
        }
    }
    public static int lerIntPositivo(String texto) {
        int num = 0;
        int falhou;
        String temporario;
        Scanner sc = new Scanner(System.in);
        System.out.print(texto);
        temporario = sc.nextLine();
        do {
            if (temporario.isEmpty()) {
                System.out.print("Valor não inserido. Digite um número: ");
                falhou = 1;
            } else {
                try {
                    num = Integer.parseInt(temporario);
                    falhou = 0;
                    if (num < 0) {
                        falhou = 1;
                        System.out.print("Valor inferior a 0. Digite um numero: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Input inválido. Digite o valor de num: ");
                    falhou = 1;
                }
            }
            if (falhou == 1) {
                temporario = sc.nextLine();
            }
        } while (falhou != 0);
        return num;
    }
}