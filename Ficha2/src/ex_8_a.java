import java.util.Scanner;

public class ex_8_a {
    public static void main(String[] args) {
        float a, b ,c;
        String classe;
        Scanner sc;

        sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();

        if (a==90 || b==90 || c==90){
            classe = "Retângulo";
        }else if (a>90 || b>90 || c>90){
            classe = "Obtusângulo";
        }else{
            classe = "Acutângulo";
        }
        System.out.println("O triângulo é: "+classe);
    }
}