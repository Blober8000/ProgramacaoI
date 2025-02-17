import java.util.Scanner;

public class ex_8_b {
    public static void main(String[] args) {
        float a, b ,c;
        String classe;
        Scanner sc;

        sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();

        if (a<=0 || b<=0 || c<=0 || a+b+c!=180){
            classe = "Impossível";
        } else if (a==90 || b==90 || c==90){
            classe = "Retângulo";
        }else if (a>90 || b>90 || c>90){
            classe = "Obtusângulo";
        }else{
            classe = "Acutângulo";
        }
        System.out.println("O triângulo é: "+classe);
    }
}