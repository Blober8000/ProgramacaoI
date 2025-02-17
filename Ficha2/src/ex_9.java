import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {
        float num1, num2, res;
        char op;
        boolean Fail;
        Scanner sc;

        sc = new Scanner(System.in);
        Fail = false;
        num1 = sc.nextFloat();
        op = sc.next().charAt(0);
        num2 = sc.nextFloat();
        res=0;

        switch (op) {
            case '^':
                res = (float) Math.pow(num1, num2);
                break;
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num2==0){
                    System.out.println("Operação impossível");
                    Fail = true;
                }else{
                    res = num1 / num2;
                }
                break;
            default:
                    System.out.println("Operador desconhecido");
                    Fail = true;
                    break;
        }
        if (!Fail) {
            System.out.printf("%.2f%c%.2f=%.2f",num1,op,num2,res);
        }
    }
}