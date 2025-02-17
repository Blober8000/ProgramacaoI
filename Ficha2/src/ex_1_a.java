import java.util.Scanner;

public class ex_1_a {
    public static void main(String[] args) {
        int num, dig1, dig2, dig3;
        Scanner sc;

        sc=new Scanner(System.in);
        num=sc.nextInt();

        if (num<100 || num >999){
            System.out.println("Número não tem 3 dígitos.");
        }
        else {
            dig3=num%10;
            dig2=(num/10)%10;
            dig1=(num/100)%10;
            System.out.println(dig1+" "+dig2+" "+dig3);
        }
    }
}
