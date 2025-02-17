import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        int s = 0;
        int[] vec = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 9; i++) {
            System.out.println("Valor?");
            vec[i] = sc.nextInt();
            s += (int) (Math.pow(vec[i], 2));
        }
        System.out.printf("Resultado = %d\n", s);
        for (int i = 0; i <= 9; i++) {
            System.out.println(vec[i]);
        }
    }
}
//Este algoritomo é capaz de pedir 10 valores ao usuário,
//adiciona a potência de exponente 2 de todos os 10 valores introduzidos e
//mostra ao usuário o resultado dessa soma e mostra também todos os valores introduzidos por ordem.