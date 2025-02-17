import java.util.Scanner;

public class ex_5_a {
    public static void main(String[] args) {
        float peso, altura;
        Scanner sc;

        sc = new Scanner(System.in);
        peso=sc.nextFloat();
        altura=sc.nextFloat();

        System.out.println("O seu IMC é: "+(peso/((float)(Math.pow(altura,2)))));
    }
}