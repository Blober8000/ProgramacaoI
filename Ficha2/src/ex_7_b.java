import java.util.Scanner;

public class ex_7_b {
    public static void main(String[] args) {
        float a, b ,c;
        String classe;
        Scanner sc;

        sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();

        if (a<=0 || b<=0 || c<=0 || a>b+c || b>a+c || c>a+b){
            classe = "Impossível";
        }else if (a==b && b==c){
            classe = "Equilátero";
        }else if (a==b || b==c || a==c){
            classe = "Isosceles";
        }else{
            classe = "Escaleno";
        }
        System.out.println("O triângulo é: "+classe);
    }
}