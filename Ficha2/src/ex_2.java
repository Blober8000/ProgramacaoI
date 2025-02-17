import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        int x, res;
        Scanner sc;

        sc = new Scanner(System.in);
        x = sc.nextInt();

        if ( x == 0 ){
            res = 0;
        } else if (x < 0) {
            res = x;
        }
        else {
            res = (int)((Math.pow(x,2)) - (2*x));
        }
        System.out.println("F(" + x + ") = " + res);
    }
}