import java.util.Scanner;

public class ex_1_b {
    public static void main(String[] args) {
        int num, dig1, dig2, dig3;
        String pOuI;
        Scanner sc;

        sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Número não tem 3 dígitos.");
        }
        else {
            dig3 = num % 10;
            dig2 = (num / 10) % 10;
            dig1 = (num / 100) % 10;
            if (dig3%2 == 0){
                pOuI = "Par";
            }
            else {
                pOuI = "Impar";
            }
            System.out.println(dig1 + " " + dig2 + " " + dig3 + " e é " + pOuI);
        }
    }
}