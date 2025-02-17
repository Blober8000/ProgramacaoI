import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado;
        float lado, area;
        area=0;
        teclado=new Scanner(System.in);
        System.out.print("Lado do quadrado: ");
        lado=teclado.nextFloat();
        area=(float)Math.pow(lado,2);
        System.out.println("A área do quadrado é: " + area);
    }
}